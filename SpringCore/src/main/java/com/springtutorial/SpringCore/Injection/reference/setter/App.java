package com.springtutorial.SpringCore.Injection.reference.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springtutorial.SpringCore.Injection.primitive.setter.Student;

public class App {

	public static void main(String[] args) {
		
	   ApplicationContext context =new ClassPathXmlApplicationContext("com/springtutorial/SpringCore/Injection/reference/setter/config.xml");
	   Exam ex1 = (Exam) context.getBean("exam1");
	   System.out.println("Exam Name : " + ex1.getEname());
	   System.out.println("Exam ref book (" + ex1.getBook().getBid() + ")" 
	   + ": " + ex1.getBook().getBname());
	   
	   Exam ex2 = (Exam) context.getBean("exam2");
	   System.out.println("Exam Name : " + ex2.getEname());
	   System.out.println("Exam ref book (" + ex2.getBook().getBid() + ")" 
	   + ": " + ex2.getBook().getBname());
	   
	   Exam ex3 = (Exam) context.getBean("exam3");
	   System.out.println("Exam Name : " + ex3.getEname());
	   System.out.println("Exam ref book (" + ex3.getBook().getBid() + ")" 
	   + ": " + ex3.getBook().getBname());
	}

}
