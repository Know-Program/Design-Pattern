package com.kp.test;

import com.kp.comp.HireFresher;
import com.kp.comp.HireUIFresher;

public class Collage2PlacementCell {

	public static void main(String[] args) {
		HireFresher uiFresher = new HireUIFresher();
		
		// client application developer 
		// changed the method invocation order and removed some process
		boolean result = uiFresher.conductAptitudeTest();
		if(result) {
			result = uiFresher.conductHRTest();
		}
		// HR test has been performed just after aptitude test
		if(result) {
			result = uiFresher.conductTechnicalTest();
		} 
		
		// doesn't calling conductCodingTest()
		/*if(result) {
		 *	result = uiFresher.conductCodingTest();
		 *}
		 */
		if(result) {
			result = uiFresher.conductGDTest();
		}
		if(result) {
			System.out.println("UI Fresher is selected");
		} else {
			System.out.println("UI Fresher is not selected");
		}
	}

}
