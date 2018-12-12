package tk.spop.normalization.core;

import java.lang.annotation.Annotation;

public interface NormalizationContext<A extends Annotation> {

	Normalizer getNormalizer();

	String resolve(String text);

	<T> T convert(String value, Class<T> type);

	A getAnnotation();

}
