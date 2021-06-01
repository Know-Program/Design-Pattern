package com.kp.test;

import com.kp.comps.Bike;
import com.kp.comps.BikeTyres;
import com.kp.comps.Model3Bike;

/* Requirement:- customer-2 want Model-3 bike*/
public class Customer2 {

	public static void main(String[] args) {
		BikeTyres tyres = new BikeTyres();
		Bike bike = new Model3Bike(tyres);
		bike.assemble();
		bike.roadTest();
		System.out.println(bike);
	}

}
