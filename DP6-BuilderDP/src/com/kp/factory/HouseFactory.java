//  HouseFactory.java 
package com.kp.factory;

import com.kp.builder.ConcreteHouseBuilder;
import com.kp.builder.IHouseBuilder;
import com.kp.builder.IglooHouseBuilder;
import com.kp.builder.MarbleHouseBuilder;
import com.kp.builder.WoodenHouseBuilder;
import com.kp.director.CivilEngineer;
import com.kp.product.House;

// Factory Pattern Implementation
public class HouseFactory {
	// factory method
	public static House getInstance(String type) {
		House house = new House();
		IHouseBuilder builder = null;

		// create one of the several class object
		if (type.equalsIgnoreCase("wood")) {
			builder = new WoodenHouseBuilder(house);
		} else if (type.equalsIgnoreCase("ice")) {
			builder = new IglooHouseBuilder(house);
		} else if (type.equalsIgnoreCase("concrete")) {
			builder = new ConcreteHouseBuilder(house);
		} else if (type.equalsIgnoreCase("marble")) {
			builder = new MarbleHouseBuilder(house);
		} else {
			throw new IllegalArgumentException("Invalid House type");
		}

		// create director/delegator object
		CivilEngineer engineer = new CivilEngineer(builder);
		// build house
		house = engineer.buildHouse();

		// return house
		return house;
	}

}