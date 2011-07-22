package de.slackspace.tutorials.web;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration("/test-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class MyManagedBeanTest {

	@Autowired
	private MyManagedBean bean;
	
	@Test
	public void testAddNumbers() {
		Assert.assertEquals(3, bean.addNumbers(1, 2));
		Assert.assertEquals(0, bean.addNumbers(0, 0));
		Assert.assertEquals(-1, bean.addNumbers(0, -1));
		Assert.assertEquals(-2, bean.addNumbers(-1, -1));
	}
}
