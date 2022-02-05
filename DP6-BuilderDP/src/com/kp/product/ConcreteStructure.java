package com.kp.product;

public class ConcreteStructure implements IStructure {

	public ConcreteStructure() {
		System.out.println("ConcreteStructure.ConcreteStructure(): 0-Param Constructor");
	}

	@Override
	public String toString() {
		return "ConcreteStructure []";
	}

}
