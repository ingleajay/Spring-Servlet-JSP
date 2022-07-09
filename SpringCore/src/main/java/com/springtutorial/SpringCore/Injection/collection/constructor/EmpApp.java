package com.springtutorial.SpringCore.Injection.collection.constructor;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class EmpApp {

	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("com/springtutorial/SpringCore/Injection/collection/constructor/config.xml");
		Employee e = (Employee) context.getBean("emp1");
        System.out.println(e);
	}
}
