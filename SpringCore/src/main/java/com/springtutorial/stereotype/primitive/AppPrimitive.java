package com.springtutorial.stereotype.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppPrimitive {
	
	// Stereotype means instaed of beans we can write annotation directly
	
	// @Component - It is used to create obejct of your class automatically
	// @Value - It hold values of your properties


	public static void main(String[] args) {

		// component create class name as object name
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springtutorial/stereotype/primitive/config.xml");
		Teacher t = context.getBean("teacher",Teacher.class);
		System.out.println("Teacher Id : " + t.getTid());
		System.out.println("Teacher Name : " + t.getTname());
		
		// if we want our own name to class object
		Teachers t1 = (Teachers) context.getBean("t1");
		System.out.println("Teacher Id : " + t1.getTid());
		System.out.println("Teacher Name : " + t1.getTname());
		
		// componet create class name in camel case 
		TeacherClub tc = context.getBean("teacherClub",TeacherClub.class);
		System.out.println("Teacher Id : " + tc.getTid());
		System.out.println("Teacher Name : " + tc.getTname());
	}
}
