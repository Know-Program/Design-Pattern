package com.kp.proxy;

import com.kp.component.BankService;
import com.kp.component.BankServiceImpl;

public class BankServiceProxyImpl implements BankService {
	private BankService real;
	
	public BankServiceProxyImpl() {
		real = new BankServiceImpl();
	}

	@Override
	public String withdraw(long accno, double amount) {
		String msg = null;
		if(amount <= 4000)
			msg = real.withdraw(accno, amount);
		else {
			msg = real.withdraw(accno, 4000);
			msg = msg + "(*** Only max of 4000 can be withdraw at a time during transition period ***)";
		}
		return msg;
	}

}
