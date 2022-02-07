package com.amazon.service;

public interface PayAmountService {
	public String payShoppingAmount(long cardNo, String cardName, String bankName, double amt);
}
