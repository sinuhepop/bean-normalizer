package tk.spop.normalizer.core.accessor;

public interface PropertyAccessor<T> {

    Class<T> getType();

    void set(Object target, T value);

    T get(Object target);

}
