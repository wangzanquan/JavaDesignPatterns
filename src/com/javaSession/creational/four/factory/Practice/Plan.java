package com.javaSession.creational.four.factory.Practice;

public abstract class Plan {

	protected double rate;
	
	public abstract void getRate();
	
	void calculateBill(int units) {
		System.out.println(units * rate);
	}
	
	
}
