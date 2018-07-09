package com.javaSession.Structural.Decorator.Practice;

public class ChineseFood extends FoodDecorator{

	public ChineseFood(Food newfood) {
		super(newfood);
	}
	@Override
	public String prepareFood() {
		// TODO Auto-generated method stub
		return super.prepareFood() + " with fried rice and manchurian";
	}

	@Override
	public double foodPrice() {
		// TODO Auto-generated method stub
		return super.foodPrice() + 20;
	}

}
