package com.kp.test;

import com.kp.comp.Vehicle;
import com.kp.factory.VehicleFactory;

public class Test {
	public static void main(String[] args) {
		// use factory
		Vehicle vehicle = VehicleFactory.getVehicle("electric");
		vehicle.drive("Place-A", "Place-B");
	}
}