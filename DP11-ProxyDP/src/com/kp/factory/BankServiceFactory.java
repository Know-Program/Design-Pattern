package com.kp.factory;

import com.kp.component.BankService;
import com.kp.component.BankServiceImpl;
import com.kp.proxy.BankServiceProxyImpl;

public class BankServiceFactory {
	// factory pattern
	public static BankService getInstance(boolean demonitisation) {
		BankService service = null;
		if (demonitisation)
			service = new BankServiceProxyImpl();
		else
			service = new BankServiceImpl();
		return service;
	}
}
