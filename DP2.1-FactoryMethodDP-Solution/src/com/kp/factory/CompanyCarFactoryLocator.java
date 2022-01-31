//  CompanyCarFactoryLocator.java
package com.kp.factory;

// This class is optional
// It is only to provide abstraction on 
// North or south factory object creation process
public class CompanyCarFactoryLocator {
	// factory pattern
	// To return of the the CompanyFactory type
	public static CompanyFactory buildCarFactory(String location) {
		if (location.equalsIgnoreCase("north")) {
			return new NorthFactory();
		} else if (location.equalsIgnoreCase("south")) {
			return new SouthFactory();
		} else {
			throw new IllegalArgumentException("Invalid Factory location");
		}
	}
}