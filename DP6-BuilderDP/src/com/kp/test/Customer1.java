//  Customer1.java
package com.kp.test;

import com.kp.factory.HouseFactory;
import com.kp.product.House;

// Customer-1 wants Marble house
public class Customer1 {
	public static void main(String[] args) {
		House house = HouseFactory.getInstance("Marble");
		System.out.println(house);
	}
}