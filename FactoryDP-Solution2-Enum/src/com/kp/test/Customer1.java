package com.kp.test;

import com.kp.comps.Bike;
import com.kp.factory.BikeFactory;
import com.kp.factory.BikeType;

/* Requirement:- customer-1 want Model-1 bike*/
public class Customer1 {

	public static void main(String[] args) {
		Bike bike = BikeFactory.getBike(BikeType.MODEL1);
		System.out.println(bike);
	}
}
