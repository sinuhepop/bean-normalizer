package tk.spop.normalization.core.impl;

import lombok.SneakyThrows;
import tk.spop.normalization.core.TransformerFactory;
import tk.spop.normalization.core.Transformer;

public class DefaultNormalizerFactory implements TransformerFactory {

	@Override
	@SneakyThrows
	public <T extends Transformer<?,?>> T newInstance(Class<T> type) {
		return type.newInstance();
	}

}
