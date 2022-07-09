package com.springtutorial.SpringCore.Injection.reference.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springtutorial.SpringCore.Injection.primitive.setter.Student;

public class App {

	public static void main(String[] args) {
		
	   ApplicationContext context =new ClassPathXmlApplicationContext("com/springtutorial/SpringCore/Injection/reference/constructor/config.xml");
	   Exam ex1 = (Exam) context.getBean("exam1");
	   System.out.println(ex1);
	   
	   Exam ex2 = (Exam) context.getBean("exam2");
	   System.out.println(ex2);
	   
	   Exam ex3 = (Exam) context.getBean("exam3");
	   System.out.println(ex3);
	}

}
