package com.javaSession.creational.three.builder;

public class LuchOrderTeleDemo {

	public static void main(String[] args) {

		LunchOrderTele lunchOrderTele = new LunchOrderTele("wheat", "Lettuce", "Mustard", "Ham");
		
		LunchOrderTele lunchOrderTele1 = new LunchOrderTele("wheat", "Lettuce", "Mustard");
		
		LunchOrderTele lunchOrderTele2 = new LunchOrderTele("wheat", "Lettuce");
		
		
		System.out.println(lunchOrderTele.getBread());
		System.out.println(lunchOrderTele.getCondiments());
		System.out.println(lunchOrderTele.getDressing());
		System.out.println(lunchOrderTele.getMeat());
		
		
		System.out.println(lunchOrderTele.toString());
		System.out.println(lunchOrderTele1.toString());
		System.out.println(lunchOrderTele2.toString());
		
		
		
		
	}

}
