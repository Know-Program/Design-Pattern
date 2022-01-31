
package com.kp.comps;

public class Model1Bike implements Bike {
	private BikeTyres tyres;
	
	public Model1Bike(BikeTyres tyres) {
		System.out.println("Model1Bike.Model1Bike()");
		this.tyres = tyres;
	}

	@Override
	public void assemble() {
		System.out.println("Model-1 bike is assembled");
	}

	@Override
	public void roadTest() {
		System.out.println("Model-1 bike is roadTest");
	}

	@Override
	public String toString() {
		return "Model-1 Bike with [tyres=" + tyres + "]";
	}
	
}
