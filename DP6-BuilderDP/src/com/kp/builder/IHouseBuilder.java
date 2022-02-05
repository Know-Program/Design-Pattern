// IHouseBuilder.java (Builder interface)
package com.kp.builder;

import com.kp.product.House;

public interface IHouseBuilder {
	// plans
	public void constructRoof();

	public void constructBasement();

	public void constructStructure();

	public void constructInterior();

	public House getHouse();
}