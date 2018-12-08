package tk.spop.normalization.core;

import java.util.List;
import java.util.Map;

public interface ClassPropertyRegistry {

	Map<String, List<PropertyNormalizer<?>>> getProperties(Class<?> type);

}
