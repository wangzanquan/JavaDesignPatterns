package com.javaSession.creational.four.factory.Practice;

public class DomesticPlan extends Plan {
	DomesticPlan(){
		System.out.println("Domestice Plan created");
	}

	@Override
	public void getRate() {
		rate = 3.5;
		
	}
}
