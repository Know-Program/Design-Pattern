package com.kp.comp;

public abstract class HireFresher {
	public boolean conductAptitudeTest() {
		System.out.println("HireFresher.conductAptitudeTest()");
		return true;
	}

	public boolean conductGDTest() {
		System.out.println("HireFresher.conductGDTest()");
		return true;
	}

	public abstract boolean conductTechnicalTest();

	public abstract boolean conductCodingTest();

	public boolean conductHRTest() {
		System.out.println("HireFresher.conductHRTest()");
		return true;
	}
}
