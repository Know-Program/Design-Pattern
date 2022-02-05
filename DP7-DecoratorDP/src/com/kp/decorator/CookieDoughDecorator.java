// OreoDecorator.java (Concrete Decorator)
package com.kp.decorator;

import com.kp.comps.IceCream;

// To add Oreo topping on any type of IceCream
public class CookieDoughDecorator extends IceCreamDecorator {
	public CookieDoughDecorator(IceCream icecream) {
		super(icecream);
	}

	@Override
	public void prepare() {
		super.prepare();
		addCookieDough();
	}

	public void addCookieDough() {
		System.out.println("Adding Cookie Dough");
	}
}