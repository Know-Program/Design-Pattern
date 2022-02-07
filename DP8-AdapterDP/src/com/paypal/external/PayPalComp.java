package com.paypal.external;

public interface PayPalComp {
	public String approveAmount(long cardNo, int cardCode, int bankCode, double amt);
}
