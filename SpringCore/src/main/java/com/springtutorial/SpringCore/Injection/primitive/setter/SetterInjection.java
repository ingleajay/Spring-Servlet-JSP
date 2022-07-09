package com.springtutorial.SpringCore.Injection.primitive.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjection {

	public static void main(String[] args) {
		
       ApplicationContext context =new ClassPathXmlApplicationContext("com/springtutorial/SpringCore/Injection/primitive/setter/config.xml");
       Student student1 = (Student) context.getBean("student1");
       Student student2 = (Student) context.getBean("student2");
       Student student3 = (Student) context.getBean("student3");
       System.out.println(student1);
       System.out.println(student2);
       System.out.println(student3);
	}
}
