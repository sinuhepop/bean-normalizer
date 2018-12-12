package tk.spop.normalization.core;

import java.lang.annotation.Annotation;

public interface Transformer<T> {

	T transform(T property);

	default T transform(T property, Annotation annotation) {
		return transform(property);
	}

	default T transform(T property, NormalizationContext<?> context) {
		return transform(property, context.getAnnotation());
	}

}
