package com.saop.SpringAop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class PaymentAspect1 {
	
	
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
	public void printBefore() {
		System.out.println("Before payemnt services....");
	}
	
	public void printAfter() {
		System.out.println("After payment service....");
	}
	
	
	
	public void thowexception(Exception error) {
		System.out.println("There is some error we will look on it. " + error);
	}
	
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
	
	public void ReturningAdvice(Object result){
		System.out.println("Status : "+ result);
	}
}
