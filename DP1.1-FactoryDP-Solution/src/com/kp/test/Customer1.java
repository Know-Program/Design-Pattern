package com.kp.test;

import com.kp.comps.Bike;
import com.kp.factory.BikeFactory;

/* Requirement:- customer-1 want Model-1 bike*/
public class Customer1 {

	public static void main(String[] args) {
		Bike bike = BikeFactory.getBike("model1");
		System.out.println(bike);
	}
}
