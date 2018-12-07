package tk.spop.normalizer.core.accessor;

import java.lang.reflect.Field;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

@RequiredArgsConstructor
public class FieldAccessor<T> implements PropertyAccessor<T> {

    private final Field field;

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
