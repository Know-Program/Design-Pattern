package com.kp.comp;

public class Circle implements Shape {
	private String label = "circle";

	public Circle() {
		System.out.println("Circle.Circle(): 0-Param constructor");
	}

	@Override
	public void draw(float radius, String fillColor, String lineStyle) {
		System.out.println("Drawing cicle with radius: " + radius + " having fillColor: " + fillColor + " , lineStyle: "
				+ lineStyle);
	}

}
