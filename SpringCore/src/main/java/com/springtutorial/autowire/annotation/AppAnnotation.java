package com.springtutorial.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppAnnotation {

	// It dosen't matter what you have written in name="college" you can write any name
	// becuase it maintaine by annotation @Autowire
	// bydefault it uses bytype concept only
	
	// we can do three ways annotation 
	// 1. on properties
	// 2. on setter method
	// 3. on constructor
	
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("com/springtutorial/autowire/annotation/config.xml");
        Student s1 = (Student)context.getBean("student1");
        System.out.println(s1);
        
        
	}
}
