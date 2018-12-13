package tk.spop.normalization.core;

import java.util.List;

import javax.annotation.concurrent.Immutable;

import lombok.Data;

@Data
@Immutable
public class Transformation<T> {

	private final PropertyAccessor<T> accessor;
	private final List<Transformer<T, ?>> transformers;

	public String getName() {
		return accessor.getName();
	}
}
