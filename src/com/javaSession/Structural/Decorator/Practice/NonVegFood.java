package com.javaSession.Structural.Decorator.Practice;

public class NonVegFood extends FoodDecorator{
	public NonVegFood(Food newFood) {
		super(newFood);
	}
	
	@Override
	public String prepareFood() {
		// TODO Auto-generated method stub
		return super.prepareFood() + " with chicken";
	}

	@Override
	public double foodPrice() {
		// TODO Auto-generated method stub
		return super.foodPrice() + 10;
	}
}
