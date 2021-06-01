package com.kp.test;

import com.kp.comps.Bike;
import com.kp.comps.BikeTyres;
import com.kp.comps.Model1Bike;

/* Requirement:- customer-1 want Model-1 bike*/
public class Customer1 {

	public static void main(String[] args) {
		BikeTyres tyres = new BikeTyres();
		Bike bike = new Model1Bike(tyres);
		bike.assemble();
		bike.roadTest();
		System.out.println(bike);
	}

}
