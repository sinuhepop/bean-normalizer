package tk.spop.normalization.core.impl;

import lombok.SneakyThrows;
import tk.spop.normalization.core.NormalizerFactory;
import tk.spop.normalization.core.PropertyNormalizer;

public class DefaultNormalizerFactory implements NormalizerFactory {

	@Override
	@SneakyThrows
	public <T extends PropertyNormalizer<?>> T newInstance(Class<T> type) {
		return type.newInstance();
	}

}
