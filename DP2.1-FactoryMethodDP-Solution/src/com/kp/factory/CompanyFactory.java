// CompanyFactory.java
package com.kp.factory;

// class having Factory Method design pattern
// (Given by Company)
import com.kp.comp.CompanyCar;

public abstract class CompanyFactory {
	/* Processes used in Car manufacturing */
	// North & South factory must implement them
	public abstract void paint();

	public abstract void assemble();

	public abstract void roadTest();

	public abstract void oiling();

	public abstract CompanyCar createCar(String model);

	// method having factory method design pattern logic
	public CompanyCar orderCar(String type) {
		// rules and guidelines (standard)
		paint(); // 1st paint
		assemble(); // 2nd assemble
		oiling(); // 3rd oiling
		CompanyCar car = createCar(type); // 4th create Car
		roadTest(); // 5th road test
		return car;
	}
}