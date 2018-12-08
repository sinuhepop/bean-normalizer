package tk.spop.normalization.core;

import lombok.Getter;
import lombok.val;

@Getter
public class NormalizationException extends RuntimeException {

	private static final long serialVersionUID = 8424182621815921420L;

	private final Class<PropertyNormalizer<?>> normalizer;
	private final Object target;
	private final String property;
	private final Object value;

	private NormalizationException(Class<PropertyNormalizer<?>> normalizer, Object target, String property, Object value,
			String message, Throwable cause) {
		super(message, cause);
		this.normalizer = normalizer;
		this.target = target;
		this.property = property;
		this.value = value;
	}

	public static NormalizationException build(Class<PropertyNormalizer<?>> normalizer, Object target, String property,
			Object value, Throwable cause) {
		val message = String.format("Error normalizing %s.%s using %s", target.getClass(), property, normalizer);
		return new NormalizationException(normalizer, target, property, value, message, cause);
	}

}
