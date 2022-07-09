package com.springtutorial.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppXML {

	public static void main(String[] args) {
		
    // by xml
		
    // we can give any name to methods like init() -> in()		
    ApplicationContext context =new ClassPathXmlApplicationContext("com/springtutorial/lifecycle/config.xml");
    Courses c = (Courses)context.getBean("c1");
    System.out.println(c);
    ((AbstractApplicationContext)context).registerShutdownHook();
  
    
	
	}
}
