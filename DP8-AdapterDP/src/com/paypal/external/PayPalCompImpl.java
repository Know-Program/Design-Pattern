package com.paypal.external;

public class PayPalCompImpl implements PayPalComp {
	private static PayPalComp INSTANCE;

	private PayPalCompImpl() {
	}

	// static factory method
	public static PayPalComp getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new PayPalCompImpl();
		}
		return INSTANCE;
	}

	@Override
	public String approveAmount(long cardNo, int cardCode, int bankCode, double amt) {
		// database interactions and communication operations
		return cardNo + " has been approved to pay " + amt + " from " + bankCode;
	}

}
