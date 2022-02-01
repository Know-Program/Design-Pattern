package com.kp.comp;

public class HireUIFresher extends HireFresher {

	@Override
	public boolean conductTechnicalTest() {
		System.out.println("HireUIFresher.conductTechnicalTest()");
		return true;
	}

	@Override
	public boolean conductCodingTest() {
		System.out.println("HireUIFresher.conductCodingTest()");
		return true;
	}

}
