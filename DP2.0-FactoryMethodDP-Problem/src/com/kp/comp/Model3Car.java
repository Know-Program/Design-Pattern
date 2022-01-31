package com.kp.comp;

public class Model3Car extends CompanyCar {
	private String strength;

	@Override
	public void drive() {
		System.out.println("Driving Model-3 Car from Company-X.");
	}
}