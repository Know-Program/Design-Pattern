// VanillaIceCream.java (Concrete Component)
package com.kp.comps;

public class VanillaIceCream implements IceCream {
	@Override
	public void prepare() {
		System.out.println("Preparing Vanilla Ice Cream");
	}
}