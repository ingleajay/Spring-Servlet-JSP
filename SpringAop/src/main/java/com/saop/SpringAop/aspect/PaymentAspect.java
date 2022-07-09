package com.saop.SpringAop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PaymentAspect {
	
	
	// 1. Aspect - it's programming paradigm that used for cross cutting methods => PaymentAspect
	// 2. JoinPoint - join point is always the execution of a method => makePayment()
	// 4. PointCut - it creates empty method for advice
	// 3. Advice - Advices are actions taken for a particular join point.  => printBefore(), printAfter()....
	//    -> @Before : These advices runs before the execution of join point methods.
	//    -> @After : An advice that gets executed after the join point method finishes executing.
    //	  -> @AfterThrowing : This advice gets executed only when join point method throws exception
    //    -> @AfterReturning :  An advice return value after join point method
	//    -> @Around : Mark a function as an advice to be executed before method(s) covered by PointCut.

	// * - means used for return all data type by given method 
	@Before("execution(* com.saop.SpringAop.services.PaymentServiceImpl.makePayment(..))")
	public void printBefore() {
		System.out.println("Before payemnt services....");
	}
	
	// first * for return type and rest will be packages...
	@After("execution(* *.*.*.*.*.makePayment(..))")
	public void printAfter() {
		System.out.println("After payment service....");
	}

	// it is used when we have exception in code
	@AfterThrowing("execution(* *.*.*.*.*.makePayment(..))")
	public void thowexception() {
		System.out.println("There is some error we will look on it...");
	}
	
	// it will return if your method is returning something..
	@AfterReturning(pointcut="execution(* *.*.*.*.*.makePayment(..))", returning="returnString")
	public void ReturningAdvice(boolean returnString){
		System.out.println("Status : "+ returnString);
	}
	
	@Pointcut("execution(* *.*.*.*.*.makePayment(..))")
	private void runPayment(){}
	
	@Around("runPayment()")
	public void aroundAdvice(ProceedingJoinPoint pj) throws Throwable {
		Object[] args = pj.getArgs();
	      if(args.length>0){
	         System.out.print("Before around method passed ( argument ) : " );
	         for (int i = 0; i < args.length; i++) {
	            System.out.println("arg "+(i+1)+" : "+args[i]);
	         }
	      }
	      Object result = pj.proceed(args);
	      System.out.println("After around method ( return value) : " + result);
	}	
}
