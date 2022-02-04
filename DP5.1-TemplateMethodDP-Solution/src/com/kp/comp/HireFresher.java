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

	// template method - defining the skeleton of the algorithm
	// declare it as final so that child class can’t modify the order
	public final boolean recruiteFresher() {
		if (conductAptitudeTest()) {
			if (conductGDTest()) {
				if (conductTechnicalTest()) {
					if (conductCodingTest()) {
						if (conductHRTest()) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}
}
