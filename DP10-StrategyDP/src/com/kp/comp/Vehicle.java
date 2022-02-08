// Vehicle.java (target class)
package com.kp.comp;

public final class Vehicle {
	private IEngine enginee; // HAS-A property

	public Vehicle() {
		System.out.println("Vehicle:: 0-param constructor");
	}

	public void setEnginee(IEngine enginee) {
		System.out.println("Vehicle.setEnginee()");
		this.enginee = enginee;
	}

	public void drive(String srcPlace, String destPlace) {
		System.out.println("Vehicle.drive()");
		enginee.start();
		System.out.println("Vehicle: Driving started at " + srcPlace);
		System.out.println("Vehicle: Driving is going on");
		enginee.stop();
		System.out.println("Vehicle: Driving ended at " + destPlace);
	}
}