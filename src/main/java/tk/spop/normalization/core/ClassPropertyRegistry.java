package tk.spop.normalization.core;

import java.util.List;

public interface ClassPropertyRegistry {

	List<PropertyActions> getActions(Class<?> type);

}
