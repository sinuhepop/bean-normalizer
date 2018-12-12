package tk.spop.normalization.core;

public interface TransformerFactory {

	<T extends Transformer<?>> T newInstance(Class<T> type);
}
