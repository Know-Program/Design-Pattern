package com.kp.factory;

import com.kp.comp.CompanyCar;
import com.kp.comp.Model1Car;
import com.kp.comp.Model2Car;
import com.kp.comp.Model3Car;

public class NorthFactory extends CompanyFactory {
	public void paint() {
		System.out.println("NorthFactory: Painting Company-X car");
	}

	public void assemble() {
		System.out.println("NorthFactory: Assembling Company-X car");
	}

	public void roadTest() {
		System.out.println("NorthFactory: Road Testing of Company-X car");
	}

	public void oiling() {
		System.out.println("NorthFactory: Oiling of Company-X car");
	}

	/*
	 * Implementing Simple Factory Pattern to provide abstraction on Car creation
	 * process.
	 **/
	// Java factory method
	public CompanyCar createCar(String model) {
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

		// return car
		return car;
	}
}
