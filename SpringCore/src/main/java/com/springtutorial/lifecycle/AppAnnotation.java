package com.springtutorial.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppAnnotation {

	public static void main(String[] args) {
		
		// @PostConstruct and @PreDestroy is not work in 9 and 11 it is removed 
		// add new dependecy in pm.xml
		
	    ApplicationContext context =new ClassPathXmlApplicationContext("com/springtutorial/lifecycle/config.xml");
        Patient p = (Patient)context.getBean("p1");
        System.out.println(p);
        ((AbstractApplicationContext)context).registerShutdownHook();
	}

}
