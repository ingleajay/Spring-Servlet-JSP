package com.springtutorial.stereotype.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppCollection {

	public static void main(String[] args) {

		// component create class name as object name
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springtutorial/stereotype/collection/config.xml");
		Teacher t = context.getBean("teacher",Teacher.class);
		System.out.println("Teacher Id : " + t.getTid());
		System.out.println("Teacher Name : " + t.getTname());
		System.out.println("Type of list : " + t.getPhone().getClass().getName());
		System.out.println("List of teacher phone : " + t.getPhone());
	}
}
