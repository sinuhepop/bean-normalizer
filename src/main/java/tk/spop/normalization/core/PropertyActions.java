package tk.spop.normalization.core;

import java.util.List;

import lombok.Data;

@Data
public class PropertyActions<T> {

	private final PropertyAccessor<T> accessor;
	private final List<PropertyNormalizer<T>> normalizers;

	public String getName() {
		return accessor.getName();
	}
}
