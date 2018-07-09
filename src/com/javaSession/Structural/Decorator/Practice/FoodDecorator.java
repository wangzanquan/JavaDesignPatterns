package com.javaSession.Structural.Decorator.Practice;

public abstract class FoodDecorator implements Food {
	private Food newFood;

	public FoodDecorator(Food newfood) {
		super();
		this.newFood = newfood;
	}

	@Override
	public String prepareFood() {
		// TODO Auto-generated method stub
		return newFood.prepareFood();
	}

	@Override
	public double foodPrice() {
		// TODO Auto-generated method stub
		return newFood.foodPrice();
	}
	
}
