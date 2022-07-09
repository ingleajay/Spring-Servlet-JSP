package com.constructor.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	// if constructor has different paramter but doing same operation then 
	// constructor injection takes first one constructor for running
	
	// if in constructor we pass String value then it takes this first constructor
	
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("com/constructor/ambiguity/config.xml");
		Addition a = (Addition)context.getBean("add");
		System.out.println("Addition :" + a.add());
		
		Addition a1 = (Addition)context.getBean("add1");
		System.out.println("Addition :" + a1.add());

	}

}
