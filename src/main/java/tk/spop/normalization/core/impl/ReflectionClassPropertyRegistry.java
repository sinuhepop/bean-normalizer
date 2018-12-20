package tk.spop.normalization.core.impl;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import tk.spop.normalization.core.Transformation;
import tk.spop.normalization.core.TransformationFinder;

public class ReflectionClassPropertyRegistry implements TransformationFinder {

	private final Map<Class<?>, Transformation> map = new ConcurrentHashMap<>();
	private final Map<Class<? extends Annotation>, Object> annotations = new ConcurrentHashMap();

	@Override
	public List<Transformation> findTransformations(Class<?> type) {

		// TODO Auto-generated method stub
		return null;
	}

	private List<Transformation> findFields(Class<?> type) {

//		Arrays.stream(type.getDeclaredFields()) //
//		.map(FieldAccessor::new) //
//		.map(mapper)

		return null;
	}

}
