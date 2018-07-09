package com.javaSession.creational.four.factory.DemoOne;

public abstract class VehicleFactory {

	Vehicle vehicle;
	public Vehicle assembleVehicle() {
		System.out.println("Starting to build vehicle");
		vehicle = createVehicle();
		System.out.println("Mounting vehicle parts");
		return vehicle;
		
	}
	
	protected abstract Vehicle createVehicle();
	
	
}
