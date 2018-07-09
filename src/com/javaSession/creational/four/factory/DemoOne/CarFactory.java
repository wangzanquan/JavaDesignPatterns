package com.javaSession.creational.four.factory.DemoOne;

public class CarFactory extends VehicleFactory{

	@Override
	protected Vehicle createVehicle() {
		return new Car();
	}
	
	

}
