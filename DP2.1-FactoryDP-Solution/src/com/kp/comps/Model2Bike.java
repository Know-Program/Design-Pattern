package com.kp.comps;

public class Model2Bike implements Bike {

private BikeTyres tyres;
	
	public Model2Bike(BikeTyres tyres) {
		System.out.println("Model2Bike.Model2Bike()");
		this.tyres = tyres;
	}

	@Override
	public void assemble() {
		System.out.println("Model-2 bike is assembled");
	}

	@Override
	public void roadTest() {
		System.out.println("Model-2 bike is roadTest");
	}

	@Override
	public String toString() {
		return "Model-2 Bike with [tyres=" + tyres + "]";
	}

}
