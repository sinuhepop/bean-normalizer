package tk.spop.normalization.actions;

import lombok.val;
import tk.spop.normalization.core.NormalizationContext;
import tk.spop.normalization.core.Transformer;

public class TrimTransformer implements Transformer<String, Trim> {

	public String transform(String property) {
		return property == null ? null : property.trim();
	}

	@Override
	public String transform(String property, NormalizationContext<Trim> context) {
		val type = context.getAnnotation().value();
		return property == null ? null : property.trim();
	}

}
