package com.javaSession.Behavioral.Strategy.Practice;

public class Bike {
	
	private RidingStyle ridingStyle;
	
	public Bike() {
		this.ridingStyle = new CarefulRiding();
	}
	
	public RidingStyle getRidingStyle() {
		return ridingStyle;
	}
	
	public void setRidingStyle(RidingStyle ridingStyle) {
		this.ridingStyle = ridingStyle;
	}
	
	public void rideBike() {
		ridingStyle.ride();
	}
	
	
}
