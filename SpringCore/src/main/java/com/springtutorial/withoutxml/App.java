package com.springtutorial.withoutxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	
	/*
	@Configuration -> Indicate that file is configuration file .
	@ComponentScan -> if you are using @Bean then it is not neccssary to used . it used for define base package inside java config file.
	@Bean -> It used to remove @component and done all configuration inside java configuration
	*/

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
		Student s = context.getBean("createstudent",Student.class);
		System.out.println(s);
		
		
		
	}

}
