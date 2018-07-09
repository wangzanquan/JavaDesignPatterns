package com.javaSession.creational.four.factory.DemoOne;

public class BikeFactory extends VehicleFactory{

	@Override
	protected Vehicle createVehicle() {
		return new Bike();
	}

}
