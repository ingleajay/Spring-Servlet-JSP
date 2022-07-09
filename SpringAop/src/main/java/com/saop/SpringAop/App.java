package com.saop.SpringAop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.saop.SpringAop.services.PaymentServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext c = new AnnotationConfigApplicationContext(Config.class);
       PaymentServiceImpl p = (PaymentServiceImpl) c.getBean("service");
       String code = "1234";
       p.makePayment(code);
    }
}
