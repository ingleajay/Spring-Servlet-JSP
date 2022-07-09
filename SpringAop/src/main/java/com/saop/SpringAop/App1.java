package com.saop.SpringAop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.saop.SpringAop.services.PaymentServiceImpl1;

public class App1 {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/saop/SpringAop/config.xml");
		 PaymentServiceImpl1 p = (PaymentServiceImpl1) context.getBean("service1");
	     String code = "1234";
	     p.makePayment(code);
		
	}

}
