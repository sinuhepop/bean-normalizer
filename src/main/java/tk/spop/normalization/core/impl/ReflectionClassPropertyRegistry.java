package tk.spop.normalization.core.impl;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import tk.spop.normalization.core.ClassPropertyRegistry;
import tk.spop.normalization.core.PropertyActions;

public class ReflectionClassPropertyRegistry implements ClassPropertyRegistry {

	private final Map<Class<?>, PropertyActions> map = new ConcurrentHashMap<>();

	@Override
	public List<PropertyActions> getActions(Class<?> type) {
		// TODO Auto-generated method stub
		return null;
	}
}
