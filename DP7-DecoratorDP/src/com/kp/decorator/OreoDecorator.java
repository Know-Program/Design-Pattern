// OreoDecorator.java (Concrete Decorator)
package com.kp.decorator;

import com.kp.comps.IceCream;

// To add Oreo topping on any type of IceCream
public class OreoDecorator extends IceCreamDecorator {
	public OreoDecorator(IceCream icecream) {
		super(icecream);
	}

	@Override
	public void prepare() {
		super.prepare();
		addOreo();
	}

	public void addOreo() {
		System.out.println("Adding Oreo");
	}
}