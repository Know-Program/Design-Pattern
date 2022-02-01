package com.kp.comp;

public class HirePythonFresher extends HireFresher {

	@Override
	public boolean conductTechnicalTest() {
		System.out.println("HirePythonFresher.conductTechnicalTest()");
		return false;
	}

	@Override
	public boolean conductCodingTest() {
		System.out.println("HirePythonFresher.conductCodingTest()");
		return false;
	}

}
