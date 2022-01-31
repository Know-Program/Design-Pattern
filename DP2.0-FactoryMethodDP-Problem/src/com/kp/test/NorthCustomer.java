package com.kp.test;

import com.kp.comp.CompanyCar;
import com.kp.factory.NorthFactory;

public class NorthCustomer {
	public static void main(String[] args) {
		CompanyCar car = NorthFactory.createCar("model1");
		car.drive();
	}
}
