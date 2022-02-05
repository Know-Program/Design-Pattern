// WoodenHouseBuilder.java (ConcreteBuilder i.e. Concrete class) 
package com.kp.builder;

import com.kp.product.House;
import com.kp.product.WoodenBasement;
import com.kp.product.WoodenInterior;
import com.kp.product.WoodenRoof;
import com.kp.product.WoodenStructure;

public class WoodenHouseBuilder implements IHouseBuilder {
	private House house;

	public WoodenHouseBuilder(House house) {
		this.house = house;
		System.out.println("WoodenHouseBuilder: 1-param constructor");
	}

	@Override
	public void constructRoof() {
		house.setRoof(new WoodenRoof());
	}

	@Override
	public void constructBasement() {
		house.setBasement(new WoodenBasement());
	}

	@Override
	public void constructStructure() {
		house.setStructure(new WoodenStructure());
	}

	@Override
	public void constructInterior() {
		house.setInterior(new WoodenInterior());
	}

	@Override
	public House getHouse() {
		return house;
	}

}