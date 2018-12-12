package tk.spop.normalization.core;

import lombok.Getter;
import lombok.val;

@Getter
@SuppressWarnings("rawtypes")
public class NormalizationException extends RuntimeException {

    private static final long serialVersionUID = 8424182621815921420L;

    private final Class<? extends Transformer> normalizer;
    private final transient Object target;
    private final String property;
    private final transient Object value;

    private NormalizationException(Class<? extends Transformer> normalizer, Object target, String property, Object value,
            String message, Throwable cause) {
        super(message, cause);
        this.normalizer = normalizer;
        this.target = target;
        this.property = property;
        this.value = value;
    }

    public static NormalizationException build(Class<? extends Transformer> normalizer, Object target, String property, Object value,
            Throwable cause) {
        val message = String.format("Error normalizing %s.%s using %s", //
                target.getClass().getName(), property, normalizer);
        return new NormalizationException(normalizer, target, property, value, message, cause);
    }

}
