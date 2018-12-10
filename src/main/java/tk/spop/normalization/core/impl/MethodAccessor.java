package tk.spop.normalization.core.impl;

import java.lang.reflect.Method;

import lombok.Getter;
import lombok.SneakyThrows;
import tk.spop.normalization.core.PropertyAccessor;

public class MethodAccessor<T> implements PropertyAccessor<T> {

    @Getter
    private final String name;

    @Getter
    private final Class<T> type;

    private final Method getter;
    private final Method setter;

    @SuppressWarnings("unchecked")
    public MethodAccessor(String name, Method getter, Method setter) {
        this.name = name;
        this.getter = getter;
        this.setter = setter;
        getter.setAccessible(true);
        setter.setAccessible(true);
        this.type = (Class<T>) setter.getParameterTypes()[0];
    }

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
