package com.kp.factory;

import com.kp.comp.CompanyCar;
import com.kp.comp.Model1Car;
import com.kp.comp.Model2Car;
import com.kp.comp.Model3Car;

public class SouthFactory {
	public static void paint() {
		System.out.println("SouthFactory: Painting Company-X car");
	}

	public static void assemble() {
		System.out.println("SouthFactory: Assembling Company-X car");
	}

	public static void roadTest() {
		System.out.println("SouthFactory: Road Testing of Company-X car");
	}

	public static void oiling() {
		System.out.println("SouthFactory: Oiling of Company-X car");
	}

	/*
	 * Implementing Simple Factory Pattern to provide abstraction on Car creation
	 * process.
	 **/
	// Java factory method
	public static CompanyCar createCar(String model) {
		CompanyCar car = null;
		// create one of the several model car based on requirement
		if (model.equalsIgnoreCase("model1")) {
			car = new Model1Car();
		} else if (model.equalsIgnoreCase("model2")) {
			car = new Model2Car();
		} else if (model.equalsIgnoreCase("model3")) {
			car = new Model3Car();
		} else {
			throw new IllegalArgumentException("Invalid Car-Model Type");
		}
		
		// process to create Car
		paint();
		assemble();
		oiling();
		roadTest(); 

		// return car
		return car;
	}
}
