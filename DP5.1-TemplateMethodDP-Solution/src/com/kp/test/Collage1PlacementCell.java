package com.kp.test;

import com.kp.comp.HireFresher;
import com.kp.factory.HireFresherFactory;

public class Collage1PlacementCell {

	public static void main(String[] args) {
		HireFresher javaFresher = HireFresherFactory.getInstance("java");
		boolean result = javaFresher.recruiteFresher();
		if (result)
			System.out.println("Java fresher is selected");
		else 
			System.out.println("Java fresher is not selected");
	}

}
