package com.kp.factory;

import com.kp.comp.HireFresher;
import com.kp.comp.HireJavaFresher;
import com.kp.comp.HirePythonFresher;
import com.kp.comp.HireUIFresher;

public class HireFresherFactory {
	public static HireFresher getInstance(String fresherType) {
		if (fresherType.equalsIgnoreCase("java"))
			return new HireJavaFresher();
		else if (fresherType.equalsIgnoreCase("python"))
			return new HirePythonFresher();
		else if (fresherType.equalsIgnoreCase("ui"))
			return new HireUIFresher();
		else
			throw new 
			IllegalArgumentException("As of now we are not recruiting " 
			+ fresherType + " freshers");
	}

}
