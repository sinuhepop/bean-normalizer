package tk.spop.normalization.core.impl;

import lombok.Builder;
import lombok.Data;
import lombok.val;
import tk.spop.normalization.core.NormalizationException;
import tk.spop.normalization.core.Normalizer;
import tk.spop.normalization.core.Transformation;
import tk.spop.normalization.core.TransformationFinder;
import tk.spop.normalization.core.TransformerFactory;

@Data
@Builder
public class DefaultNormalizer implements Normalizer {

	private final TransformerFactory factory;
	private final TransformationFinder registry;

	public void normalize(Object object) {
		val properties = registry.findTransformations(object.getClass());
		properties.forEach(x -> normalizeProperty(object, x));
	}

	protected <T> void normalizeProperty(Object target, Transformation<T> actions) {
		val accessor = actions.getAccessor();
		T value = accessor.get(target);
		for (val normalizer : actions.getTransformers()) {
			try {
				value = normalizer.transform(value, null);
			} catch (Exception e) {
				throw NormalizationException.build(normalizer.getClass(), target, accessor.getName(), value, e);
			}
		}
		accessor.set(target, value);
	}

	public static DefaultNormalizerBuilder getDefault() {
		return DefaultNormalizer.builder() //
				.factory(new DefaultNormalizerFactory()) //
				.registry(new ReflectionClassPropertyRegistry());
	}
}
