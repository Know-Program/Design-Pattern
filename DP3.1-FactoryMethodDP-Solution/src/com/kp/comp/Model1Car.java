package com.kp.comp;

public class Model1Car extends CompanyCar {
	private String accelerationLevel;

	@Override
	public void drive() {
		System.out.println("Driving Model-1 Car from Company-X.");
	}
}