//  Shop.java
package com.kp.test;

import com.kp.comps.ChocolateIceCream;
import com.kp.comps.IceCream;
import com.kp.comps.VanillaIceCream;
import com.kp.decorator.CookieDoughDecorator;
import com.kp.decorator.DryFruitDecorator;
import com.kp.decorator.OreoDecorator;

public class Shop {
	public static void main(String[] args) {
		// Customer-1 wants VanillaIceCream without topping
		System.out.println("Customer-1");
		IceCream iceCream1 = new VanillaIceCream();
		iceCream1.prepare();
		System.out.println();

		// Customer-2 wants VanillaIceCream + Oreo topping
		System.out.println("Customer-2");
		IceCream iceCream2 = new OreoDecorator(new VanillaIceCream());
		iceCream2.prepare();
		System.out.println(); 

		// Customer-3 wants VanillaIceCream + Oreo + Dry Fruit topping
		System.out.println("Customer-3");
		IceCream iceCream3 = new OreoDecorator(new DryFruitDecorator(new VanillaIceCream()));
		iceCream3.prepare();
		System.out.println(); 

		// Customer-4 wants
		// ChocolateIceCream + Cookie Dough + Dry Fruit + Oreo topping
		System.out.println("Customer-4");
		IceCream iceCream4 = new OreoDecorator(new DryFruitDecorator(
				new CookieDoughDecorator(new ChocolateIceCream())));
		iceCream4.prepare();
		System.out.println(); 

		// Customer-5 wants Cookie Dough two times as
		// StrawberryIceCream + Cookie Dough + Cookie Dough + Dry Fruit
		System.out.println("Customer-5");
		IceCream iceCream5 = new DryFruitDecorator(
				new CookieDoughDecorator(new CookieDoughDecorator(new ChocolateIceCream())));
		iceCream5.prepare();
		System.out.println();
	}
}