package com.amazon.service;

import com.amazon.adapter.PayAmountAdapter;

public class PayAmountServiceImpl implements PayAmountService {

	@Override
	public String payShoppingAmount(long cardNo, String cardName, String bankName, double amt) {
		// use adapter class for payment service
		PayAmountAdapter adapter = new PayAmountAdapter();
		return adapter.payShoppingAmount(cardNo, cardName, bankName, amt);
	}

}
