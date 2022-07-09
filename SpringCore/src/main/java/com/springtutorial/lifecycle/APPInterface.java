package com.springtutorial.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class APPInterface {

	public static void main(String[] args) {
		
		  // by interface
	    ApplicationContext context1 =new ClassPathXmlApplicationContext("com/springtutorial/lifecycle/config.xml");
	    Doctor d = (Doctor)context1.getBean("d1");
	    System.out.println(d);
	    ((AbstractApplicationContext)context1).registerShutdownHook();
	}

}
