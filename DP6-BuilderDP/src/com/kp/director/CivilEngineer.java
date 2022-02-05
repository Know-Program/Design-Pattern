//  CivilEngineer.java (Builder DP)
package com.kp.director;

import com.kp.builder.IHouseBuilder;
import com.kp.product.House;

public class CivilEngineer {
	private IHouseBuilder builder;

	public CivilEngineer(IHouseBuilder builder) {
		this.builder = builder;
		System.out.println("CivilEngineer.CivilEngineer()");
	}

	/*
	 * Builder design pattern main logic:- Defining process to construct the complex
	 * object
	 */
	public House buildHouse() {
		// process
		builder.constructBasement(); // 1st => construct basement
		builder.constructStructure(); // 2nd => construct structure
		builder.constructRoof(); // 3rd => construct roof
		builder.constructInterior(); // 4th => construct interior

		// get House object
		House house = builder.getHouse();

		// return final product
		return house;
	}
}