package com.kp.test;

import com.kp.comp.CompanyCar;
import com.kp.factory.SouthFactory;

public class SouthCustomer {
	public static void main(String[] args) {
		CompanyCar car = SouthFactory.createCar("model1");
		car.drive();
	}
}
