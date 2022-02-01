package com.kp.comps;

public class Model3Bike implements Bike {

private BikeTyres tyres;
	
	public Model3Bike(BikeTyres tyres) {
		System.out.println("Model3Bike.Model3Bike()");
		this.tyres = tyres;
	}

	@Override
	public void assemble() {
		System.out.println("Model-3 bike is assembled");
	}

	@Override
	public void roadTest() {
		System.out.println("Model-3 bike is roadTest");
	}

	@Override
	public String toString() {
		return "Model-3 Bike with [tyres=" + tyres + "]";
	}

}
