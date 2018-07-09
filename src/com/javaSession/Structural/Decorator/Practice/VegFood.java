package com.javaSession.Structural.Decorator.Practice;

public class VegFood implements Food{

	@Override
	public String prepareFood() {
		return "Veg Food";
	}

	@Override
	public double foodPrice() {
		return 40;
	}
	
	
}
