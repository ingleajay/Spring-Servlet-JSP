package com.springtutorial.beanscope.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonScope {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springtutorial/beanscope/singleton/config.xml");
		
		// by default
		Hospital h1 = context.getBean("hospital",Hospital.class);
		System.out.println(h1 + " " + h1.hashCode());
	
		Hospital h2 = context.getBean("hospital",Hospital.class);
		System.out.println(h2 + " " + h2.hashCode());
		
		
		// by annotation
		Hospital2 h6 = context.getBean("hospital2",Hospital2.class);
		System.out.println(h6 + " " + h6.hashCode());
	
		Hospital2 h5 = context.getBean("hospital2",Hospital2.class);
		System.out.println(h5 + " " + h5.hashCode());
		
		// by xml
		Hospital1 h3 = context.getBean("hos",Hospital1.class);
		System.out.println(h3 + " " + h3.hashCode());
		Hospital1 h4 = context.getBean("hos",Hospital1.class);
		System.out.println(h4 + " " + h4.hashCode());
	}
}
