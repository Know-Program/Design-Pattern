package com.kp.product;

public class ConcreteRoof implements IRoof {

	public ConcreteRoof() {
		System.out.println("ConcreteRoof.ConcreteRoof(): 0-Param Constructor");
	}

	@Override
	public String toString() {
		return "ConcreteRoof []";
	}

}
