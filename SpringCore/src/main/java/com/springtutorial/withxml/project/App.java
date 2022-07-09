package com.springtutorial.withxml.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springtutorial/withxml/project/Config.xml");
		Student stu = context.getBean("student",Student.class);
		System.out.println("Welcome to student portfolio..");
		System.out.println("ID : " + stu.getSid());
		System.out.println("Name : " + stu.getSname());
		System.out.println("Student Subject Count : " + stu.getSubjects().stream().count());
		System.out.println("Subjects are following : ");
		
		for(Subject i : stu.getSubjects()) {
			System.out.println("Subject ID : " + i.subid);
			System.out.println("Subject Name : " + i.subname);
		}
		System.out.println("Address Details : ");
		System.out.println("City : " + stu.getAddress().getCity());
		System.out.println("Zip : " + stu.getAddress().getZip());
		System.out.println("Country : " + stu.getAddress().getCountry());
	}
}
