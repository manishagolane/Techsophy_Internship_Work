package com.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.services.PaymentService;

@SpringBootApplication
public class AopconceptApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopconceptApplication.class, args);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/aop/config.xml");
		
		PaymentService paymentObject  = context.getBean("payment",PaymentService.class);
		
		
		//auth, print:PaymentStarted
		paymentObject.makePayment();
		
		paymentObject.makePaymentwithAmount(1000000);
		
	}

}
