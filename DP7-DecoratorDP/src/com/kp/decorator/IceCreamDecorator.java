// IceCreamDecorator.java (Abstract Decorator)
package com.kp.decorator;

import com.kp.comps.IceCream;

public abstract class IceCreamDecorator implements IceCream {
	// property which will be used to
	// link one decorator with another decorator
	private IceCream icecream; // composition (HAS-A)

	// constructor
	public IceCreamDecorator(IceCream icecream) {
		this.icecream = icecream;
	}

	@Override
	public void prepare() {
		icecream.prepare();
	}
}