package com.springtutorial.autowire.annotation.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppAnnotationQualifier {

	// Qualifier is basically for which bean you want to used for object injection
	// use @Qualifier
	
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("com/springtutorial/autowire/annotation/qualifier/config.xml");
        Student s1 = (Student)context.getBean("student1");
        System.out.println(s1);
       
	}
}
