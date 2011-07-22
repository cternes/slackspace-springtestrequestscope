package de.slackspace.tutorials.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

public class CustomScope implements Scope {

	private final Map<String , Object> beanMap = new HashMap<String , Object>();
	
	public Object get(String name, ObjectFactory<?> factory) {
		Object bean = beanMap.get(name);
		if (null == bean) {
			bean = factory.getObject();
			beanMap.put(name, bean);
		}
		return bean;
	}

	public String getConversationId() {
		// not needed
		return null;
	}

	public void registerDestructionCallback(String arg0, Runnable arg1) {
		// not needed
	}

	public Object remove(String obj) {
		return beanMap.remove(obj);
	}

	public Object resolveContextualObject(String arg0) {
		// not needed
		return null;
	}
}
