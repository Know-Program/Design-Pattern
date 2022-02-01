package com.kp.test;

import com.kp.comp.HireFresher;
import com.kp.factory.HireFresherFactory;

public class Collage2PlacementCell {

	public static void main(String[] args) {
		HireFresher uiFresher = HireFresherFactory.getInstance("ui");
		boolean result = uiFresher.recruiteFresher();
		if (result)
			System.out.println("UI fresher is selected");
		else
			System.out.println("UI fresher is not selected");
	}

}
