package com.javaSession.Structural.Decorator;

public class CarDealer {

	public static void main(String[] args) {

		Car buggati = new SportsCar();
		Car carWithMusicSystem = new MusicSystem(buggati);
		Car carWithBumperSticker = new BumperSticker(carWithMusicSystem, "RED");
		
		System.out.println("Car information: " + carWithBumperSticker.getDetails() + ", cost " + carWithBumperSticker.calculateCost());
		
		
	}

}
