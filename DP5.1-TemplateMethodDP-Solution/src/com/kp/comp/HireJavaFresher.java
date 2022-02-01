package com.kp.comp;

public class HireJavaFresher extends HireFresher {

	@Override
	public boolean conductTechnicalTest() {
		System.out.println("HireJavaFresher.conductTechnicalTest()");
		return true;
	}

	@Override
	public boolean conductCodingTest() {
		System.out.println("HireJavaFresher.conductCodingTest()");
		return true;
	}

}
