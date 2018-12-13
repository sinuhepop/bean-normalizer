package tk.spop.normalization.integration.spring;

import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import tk.spop.normalization.core.Transformer;
import tk.spop.normalization.core.TransformerFactory;

@RequiredArgsConstructor
public class SpringNormalizerFactory implements TransformerFactory {

	private final AutowireCapableBeanFactory beanFactory;

	public SpringNormalizerFactory(ApplicationContext applicationContext) {
		this(applicationContext.getAutowireCapableBeanFactory());
	}

	@SneakyThrows
	public <T extends Transformer<?, ?>> T newInstance(Class<T> type) {
		return beanFactory.createBean(type);
	}

}
