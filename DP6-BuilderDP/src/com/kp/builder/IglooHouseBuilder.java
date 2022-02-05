// WoodenHouseBuilder.java (ConcreteBuilder i.e. Concrete class) 
package com.kp.builder;

import com.kp.product.House;
import com.kp.product.IceBasement;
import com.kp.product.IceCarvingInterior;
import com.kp.product.IceRoof;
import com.kp.product.IceStructure;

public class IglooHouseBuilder implements IHouseBuilder {
	private House house;

	public IglooHouseBuilder(House house) {
		this.house = house;
		System.out.println("IglooHouseBuilder: 1-param constructor");
	}

	@Override
	public void constructRoof() {
		house.setRoof(new IceRoof());
	}

	@Override
	public void constructBasement() {
		house.setBasement(new IceBasement());
	}

	@Override
	public void constructStructure() {
		house.setStructure(new IceStructure());
	}

	@Override
	public void constructInterior() {
		house.setInterior(new IceCarvingInterior());
	}

	@Override
	public House getHouse() {
		return house;
	}

}