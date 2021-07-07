package com.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	@Before("execution(* com.aop.services.PaymentServiceImpl.makePayment())")
	public void printBefore() {
		System.out.println("Payment started....");
		
	}
	
	@After("execution(* com.aop.services.PaymentServiceImpl.makePayment())")
	public void printAfter() {
		System.out.println("Payment Complited......");
		
	}

	
	@Before("execution(* com.aop.services.PaymentServiceImpl.makePaymentwithAmount(..))")
	public void printBeforeamountDone() {
		System.out.println("Payment started with amount....");
		
	}
	
	@After("execution(* com.aop.services.PaymentServiceImpl.makePaymentwithAmount(..))")
	public void printAfterAmountDone() {
		System.out.println("Payment Complited with amount......");
		
	}

}