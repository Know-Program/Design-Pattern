// OreoDecorator.java (Concrete Decorator)
package com.kp.decorator;

import com.kp.comps.IceCream;

// To add Oreo topping on any type of IceCream
public class DryFruitDecorator extends IceCreamDecorator {
	public DryFruitDecorator(IceCream icecream) {
		super(icecream);
	}

	@Override
	public void prepare() {
		super.prepare();
		addDryFruit();
	}

	public void addDryFruit() {
		System.out.println("Adding Dry Fruits");
	}
}