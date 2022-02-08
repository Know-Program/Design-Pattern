package com.kp.test;

import com.kp.comp.Shape;
import com.kp.factory.ShapeFactory;

public class FlyWeightProblemTest {
	public static void main(String[] args) {
		for (int i = 0; i <= 500; ++i) {
			Shape shape = ShapeFactory.getShape("circle");
			System.out.println(shape.hashCode());
			shape.draw(i + 10, "blue", "dotted");
		}

		System.out.println("=======================");

		for (int i = 0; i <= 500; ++i) {
			Shape shape = ShapeFactory.getShape("square");
			System.out.println(shape.hashCode());
			shape.draw(i + 10, "green", "dotted");
		}
	}
}
