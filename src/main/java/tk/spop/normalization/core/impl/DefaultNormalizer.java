package tk.spop.normalization.core.impl;

import lombok.Builder;
import lombok.Data;
import lombok.val;
import tk.spop.normalization.core.ClassPropertyRegistry;
import tk.spop.normalization.core.NormalizationException;
import tk.spop.normalization.core.Normalizer;
import tk.spop.normalization.core.NormalizerFactory;
import tk.spop.normalization.core.PropertyActions;

@Data
@Builder
public class DefaultNormalizer implements Normalizer {

	private final NormalizerFactory factory;
	private final ClassPropertyRegistry registry;

	public void normalize(Object object) {
		val properties = registry.getActions(object.getClass());
		properties.forEach(x -> normalizeProperty(object, x));
	}

	protected <T> void normalizeProperty(Object target, PropertyActions<T> actions) {
		val accessor = actions.getAccessor();
		T value = accessor.get(target);
		for (val normalizer : actions.getNormalizers()) {
			try {
				value = normalizer.normalize(value);
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
