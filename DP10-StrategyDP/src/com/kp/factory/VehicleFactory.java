package com.kp.factory;

import com.kp.comp.DieselEngine;
import com.kp.comp.ElectricEngine;
import com.kp.comp.IEngine;
import com.kp.comp.Vehicle;

// Implementation of Factory Design Pattern
public class VehicleFactory {

	/*
	 * static factory to create and return Vehicle object by creating passed engine
	 * type
	 */
	public static Vehicle getVehicle(String engType) {
		IEngine engg = null;
		if (engType.equalsIgnoreCase("diesel")) {
			engg = new DieselEngine();
		} else if (engType.equalsIgnoreCase("electric")) {
			engg = new ElectricEngine();
		} else {
			throw new IllegalArgumentException("Invalid Engine type");
		}

		// create target class object
		Vehicle vehicle = new Vehicle();
		// assign dependent class object to target class object
		vehicle.setEnginee(engg);
		// return target class object
		return vehicle;
	}
}