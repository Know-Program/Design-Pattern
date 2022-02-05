package com.kp.product;

public class ConcreteBasement implements IBasement {

	public ConcreteBasement() {
		System.out.println("ConcreteBasement.ConcreteBasement(): 0-Param Constructor");
	}

	@Override
	public String toString() {
		return "ConcreteBasement []";
	}

}
