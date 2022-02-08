package com.kp.test;

import com.kp.comp.Shape;
import com.kp.factory.ShapeFactory;

public class FlyweightTest {
	public static void main(String[] args) {
		try {
			for (int i = 0; i <= 500; ++i) {
				Shape shape = ShapeFactory.getShape("circle");
				System.out.println(shape.hashCode());
				shape.draw(i + 10, "blue", "dotted");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("=======================");

		try {
			for (int i = 0; i <= 500; ++i) {
				Shape shape = ShapeFactory.getShape("square");
				System.out.println(shape.hashCode());
				shape.draw(i + 10, "green", "dotted");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
