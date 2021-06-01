package com.kp.test;

import com.kp.comps.Bike;
import com.kp.factory.BikeFactory;
import com.kp.factory.BikeType;

/* Requirement:- customer-2 want Model-3 bike*/
public class Customer2 {

	public static void main(String[] args) {
		Bike bike = BikeFactory.getBike(BikeType.MODEL3);
		System.out.println(bike);
	}

}
