package com.kp.test;

import com.kp.comps.Bike;
import com.kp.factory.BikeFactory;

/* Requirement:- customer-2 want Model-3 bike*/
public class Customer2 {

	public static void main(String[] args) {
		Bike bike = BikeFactory.getBike("model3");
		System.out.println(bike);
	}

}
