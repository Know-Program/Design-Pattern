package com.kp.builder;

import com.kp.product.ConcreteBasement;
import com.kp.product.ConcreteRoof;
import com.kp.product.House;
import com.kp.product.IronStructure;
import com.kp.product.MixedInterior;

public class MarbleHouseBuilder implements IHouseBuilder {
	private House house;

	public MarbleHouseBuilder(House house) {
		this.house = house;
		System.out.println("MarbleHouseBuilder.MarbleHouseBuilder(): 1 param constructor");
	}

	@Override
	public void constructRoof() {
		house.setRoof(new ConcreteRoof());
	}

	@Override
	public void constructBasement() {
		house.setBasement(new ConcreteBasement());
	}

	@Override
	public void constructStructure() {
		house.setStructure(new IronStructure());
	}

	@Override
	public void constructInterior() {
		house.setInterior(new MixedInterior());
	}

	@Override
	public House getHouse() {
		return house;
	}

}
