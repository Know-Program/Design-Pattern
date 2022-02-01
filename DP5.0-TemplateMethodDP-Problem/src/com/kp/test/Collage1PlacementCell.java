package com.kp.test;

import com.kp.comp.HireFresher;
import com.kp.comp.HireJavaFresher;

public class Collage1PlacementCell {

	public static void main(String[] args) {
		HireFresher javaFresher = new HireJavaFresher();
		
		// client application developer must know the order
		// of method invocation
		boolean result = javaFresher.conductAptitudeTest();
		if(result) {
			result = javaFresher.conductGDTest();
		}
		if(result) {
			result = javaFresher.conductTechnicalTest();
		} 
		if(result) {
			result = javaFresher.conductCodingTest();
		}
		if(result) {
			result = javaFresher.conductHRTest();
		}
		if(result) {
			System.out.println("Java Fresher is selected");
		} else {
			System.out.println("Java Fresher is not selected");
		}
	}

}
