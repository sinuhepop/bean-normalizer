package tk.spop.normalization.core.impl;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import tk.spop.normalization.core.TransformationFinder;
import tk.spop.normalization.core.Transformation;

public class ReflectionClassPropertyRegistry implements TransformationFinder {

	private final Map<Class<?>, Transformation> map = new ConcurrentHashMap<>();

	@Override
	public List<Transformation> findTransformations(Class<?> type) {
		// TODO Auto-generated method stub
		return null;
	}
}
