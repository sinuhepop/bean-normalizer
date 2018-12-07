package tk.spop.normalizer.core.accessor;

import java.lang.reflect.Method;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

@RequiredArgsConstructor
public class MethodAccessor<T> implements PropertyAccessor<T> {

    @Getter
    private final Class<T> type;

    private final Method getter;
    private final Method setter;

    @SneakyThrows
    public void set(Object target, T value) {
        setter.invoke(target, value);
    }

    @SneakyThrows
    @SuppressWarnings("unchecked")
    public T get(Object target) {
        return (T) getter.invoke(target);
    }

}
