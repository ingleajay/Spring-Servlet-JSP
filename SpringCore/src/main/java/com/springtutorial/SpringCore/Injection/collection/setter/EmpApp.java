package com.springtutorial.SpringCore.Injection.collection.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class EmpApp {

	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("com/springtutorial/SpringCore/Injection/collection/setter/config.xml");
		Employee e = (Employee) context.getBean("emp1");
        System.out.println(e);
        System.out.println("Name : " + e.getName());
        System.out.println("List of phone no : " + e.getPhones());
        System.out.println("Set of address no : " + e.getAddresses());
        System.out.println("Map of all department : " + e.getDepartment());
	}
}
