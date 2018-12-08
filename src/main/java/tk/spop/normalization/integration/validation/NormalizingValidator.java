package tk.spop.normalization.integration.validation;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.executable.ExecutableValidator;
import javax.validation.metadata.BeanDescriptor;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import tk.spop.normalization.core.impl.DefaultNormalizer;

@Getter
@RequiredArgsConstructor
public class NormalizingValidator implements Validator {

	private final Validator validator;
	private final DefaultNormalizer normalizer;

	@Override
	public <T> Set<ConstraintViolation<T>> validate(T object, Class<?>... groups) {
		normalizer.normalize(object);
		return validator.validate(object, groups);
	}

	@Override
	public <T> Set<ConstraintViolation<T>> validateProperty(T object, String propertyName, Class<?>... groups) {
		return validator.validateProperty(object, propertyName, groups);
	}

	@Override
	public <T> Set<ConstraintViolation<T>> validateValue(Class<T> beanType, String propertyName, Object value,
			Class<?>... groups) {
		return validator.validateValue(beanType, propertyName, value, groups);
	}

	@Override
	public BeanDescriptor getConstraintsForClass(Class<?> clazz) {
		return validator.getConstraintsForClass(clazz);
	}

	@Override
	public <T> T unwrap(Class<T> type) {
		return validator.unwrap(type);
	}

	@Override
	public ExecutableValidator forExecutables() {
		return validator.forExecutables();
	}

}
