package com.kp.component;

public class BankServiceImpl implements BankService {

	@Override
	public String withdraw(long accno, double amount) {
		return "Withdrawing amount:: " + amount + " from account number:: " + accno;
	}

}
