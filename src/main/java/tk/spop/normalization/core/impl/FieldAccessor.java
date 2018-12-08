package tk.spop.normalization.core.impl;

import java.lang.reflect.Field;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import tk.spop.normalization.core.PropertyAccessor;

@RequiredArgsConstructor
public class FieldAccessor<T> implements PropertyAccessor<T> {

	private final Field field;

	@Override
	public String getName() {
		return field.getName();
	}

	@SuppressWarnings("unchecked")
	public Class<T> getType() {
		return (Class<T>) field.getType();
	}

	@SneakyThrows
	public void set(Object target, T value) {
		field.set(target, value);
	}

	@SneakyThrows
	@SuppressWarnings("unchecked")
	public T get(Object target) {
		return (T) field.get(target);
	}

}
