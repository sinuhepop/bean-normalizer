package tk.spop.normalization.core;

public interface NormalizerFactory {

	<T extends PropertyNormalizer<?>> T newInstance(Class<T> type);
}
