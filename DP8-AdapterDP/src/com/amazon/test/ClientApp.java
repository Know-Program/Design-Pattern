package com.amazon.test;

import com.amazon.service.PayAmountService;
import com.amazon.service.PayAmountServiceImpl;

public class ClientApp {
	public static void main(String[] args) {
		PayAmountService shopping = new PayAmountServiceImpl();
		String cfrmMsg = shopping.payShoppingAmount(55443322, "VISA", "Bank of America", 3000);
		System.out.println(cfrmMsg);
		System.out.println();
		
		cfrmMsg = shopping.payShoppingAmount(123456789, "Master", "JPMorgan", 5000);
		System.out.println(cfrmMsg);
	}

}
