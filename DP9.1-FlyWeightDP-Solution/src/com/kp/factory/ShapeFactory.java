package com.kp.factory;

import java.util.HashMap;
import java.util.Map;

import com.kp.comp.Circle;
import com.kp.comp.Shape;
import com.kp.comp.Square;

public class ShapeFactory {
	// cache
	private static Map<String, Shape> cacheMap = new HashMap<>();

	public static Shape getShape(String type) {
		if (!cacheMap.containsKey(type)) {
			Shape shape = null;
			if (type.equalsIgnoreCase("square")) {
				shape = new Square();
			} else if (type.equalsIgnoreCase("circle")) {
				shape = new Circle();
			} else {
				throw new IllegalArgumentException("Invalid Shape Type");
			}

			cacheMap.put(type, shape); // store to cache
		}

		return cacheMap.get(type); // return from cache
	}

}
