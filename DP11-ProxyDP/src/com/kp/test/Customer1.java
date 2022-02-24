package com.kp.test;

import com.kp.component.BankService;
import com.kp.factory.BankServiceFactory;

public class Customer1 {
	public static void main(String[] args) {
		BankService service = BankServiceFactory.getInstance(true);
		System.out.println(service.withdraw(10001, 20000));
		System.out.println("=============================");
		System.out.println(service.withdraw(10001, 2000));
	}
}
