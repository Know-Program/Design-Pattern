package com.kp.factory;

import com.kp.comp.Circle;
import com.kp.comp.Shape;
import com.kp.comp.Square;

public class ShapeFactory {
	public static Shape getShape(String type) {
		Shape shape = null;
		if(type.equalsIgnoreCase("square")) {
			shape = new Square();
		} else if(type.equalsIgnoreCase("circle")) {
			shape = new Circle();
		} else {
			throw new IllegalArgumentException("Invalid Shape Type");
		}
		return shape;
	}

}
