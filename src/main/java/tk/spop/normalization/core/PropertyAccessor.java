package tk.spop.normalization.core;

import javax.annotation.concurrent.Immutable;

@Immutable
public interface PropertyAccessor<T> {

    String getName();

    Class<T> getType();

    void set(Object target, T value);

    T get(Object target);

}
