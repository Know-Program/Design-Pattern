package com.kp.comp;

public final class ElectricEngine implements IEngine {

	public ElectricEngine() {
		System.out.println("ElectricEngine:: 0-param constructor");
	}

	@Override
	public void start() {
		System.out.println("ElectricEngine is started");
	}

	@Override
	public void stop() {
		System.out.println("ElectricEngine is stoped");
	}
}