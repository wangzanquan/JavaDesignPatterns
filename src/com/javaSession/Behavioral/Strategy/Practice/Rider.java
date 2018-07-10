package com.javaSession.Behavioral.Strategy.Practice;

public class Rider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike = new Bike();
		bike.rideBike();
		//You can set the carefulriding ro rashing riding hased on client needs
		bike.setRidingStyle(new RashRiding());
		bike.rideBike();
		
	}

}
