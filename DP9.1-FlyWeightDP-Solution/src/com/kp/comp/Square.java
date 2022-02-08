package com.kp.comp;

public class Square implements Shape {
	private String label = "square";

	public Square() {
		System.out.println("Square.Square(): 0-Param constructor");
	}

	@Override
	public void draw(float sideLength, String fillColor, String lineStyle) {
		System.out.println("Drawing Square with side length: " + sideLength + " having fillColor: " + fillColor
				+ " , lineStyle: " + lineStyle);
	}

}
