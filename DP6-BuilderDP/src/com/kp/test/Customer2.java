//  Customer2.java
package com.kp.test;

import com.kp.factory.HouseFactory;
import com.kp.product.House;

// Customer-2 wants wooden house
public class Customer2 {
	public static void main(String[] args) {
		House house = HouseFactory.getInstance("wood");
		System.out.println(house);
	}
}