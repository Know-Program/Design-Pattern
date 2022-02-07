package com.amazon.adapter;

import com.paypal.external.PayPalComp;
import com.paypal.external.PayPalCompImpl;

public class PayAmountAdapter {
	public String payShoppingAmount(long cardNo, String cardName, String bankName, double amt) {
		int cardCode = 0;
		int bankCode = 0;
		PayPalComp payPalComp = null;
		String paymentMsg = null;

		// get card codes from database
		if (cardName.equalsIgnoreCase("Visa"))
			cardCode = 111;
		else if (cardName.equalsIgnoreCase("Master"))
			cardCode = 222;
		else
			throw new IllegalArgumentException("Invalid card name");

		// get bank code from database
		if (bankName.equalsIgnoreCase("Bank of America"))
			bankCode = 1001;
		else if (bankName.equalsIgnoreCase("JPMorgan"))
			bankCode = 1002;
		else
			throw new IllegalArgumentException("Invalid bank name");

		// use PayPal component
		payPalComp = PayPalCompImpl.getInstance();
		paymentMsg = payPalComp.approveAmount(cardNo, cardCode, bankCode, amt);

		return paymentMsg;
	}

}
