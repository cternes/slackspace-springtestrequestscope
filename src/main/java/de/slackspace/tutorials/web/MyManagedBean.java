package de.slackspace.tutorials.web;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("request")
public class MyManagedBean {
	
	public int addNumbers(int a, int b) {
		return a + b;
	}
}
