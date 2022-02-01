package com.kp.test;

import com.kp.comp.CompanyCar;
import com.kp.factory.CompanyCarFactoryLocator;
import com.kp.factory.CompanyFactory;

public class NorthCustomer {
	public static void main(String[] args) {
		CompanyFactory factory = CompanyCarFactoryLocator.buildCarFactory("north");
		CompanyCar car = factory.orderCar("model1");
		car.drive();
	}
}
