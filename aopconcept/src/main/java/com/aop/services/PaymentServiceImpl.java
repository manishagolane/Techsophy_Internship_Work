package com.aop.services;

public class PaymentServiceImpl implements PaymentService{
	public void makePayment() {
		System.out.println("Amount Debited......");
		
		
		System.out.println("Amount Credited.....");
	}
	
	public void makePaymentwithAmount(int amount) {
		System.out.println(amount+" Amount Debited......");
		
		
		System.out.println(amount+" Amount Credited.....");
	}
}
