package com.kp.test;

import com.kp.component.BankService;
import com.kp.factory.BankServiceFactory;

public class Customer2 {
	public static void main(String[] args) {
		BankService service = BankServiceFactory.getInstance(false);
		System.out.println(service.withdraw(10002, 20000));
		System.out.println("=============================");
		System.out.println(service.withdraw(10002, 2000));
	}
}
