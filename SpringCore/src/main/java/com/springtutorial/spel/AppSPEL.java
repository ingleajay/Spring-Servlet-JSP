package com.springtutorial.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppSPEL {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springtutorial/spel/config.xml");
		DemoVariable d = context.getBean("dv",DemoVariable.class);
		System.out.println(d);
		
		DemoStaticMethodAndVar d1 = context.getBean("ds",DemoStaticMethodAndVar.class);
		System.out.println(d1);
		
		DemoInstanceMethodAndVar d2 = context.getBean("di",DemoInstanceMethodAndVar.class);
		System.out.println(d2);
	}

}
