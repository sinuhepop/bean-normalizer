package tk.spop.normalization.core;

import java.lang.annotation.Annotation;

public interface Transformer<T, A extends Annotation> {

	T transform(T property, NormalizationContext<A> context);

}
