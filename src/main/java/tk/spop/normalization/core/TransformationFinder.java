package tk.spop.normalization.core;

import java.util.List;

public interface TransformationFinder {

	List<Transformation> findTransformations(Class<?> type);

}
