package com.kp.comp;

public class HirePythonFresher extends HireFresher {

	@Override
	public boolean conductTechnicalTest() {
		System.out.println("HirePythonFresher.conductTechnicalTest()");
		return true;
	}

	@Override
	public boolean conductCodingTest() {
		System.out.println("HirePythonFresher.conductCodingTest()");
		return true;
	}

}
