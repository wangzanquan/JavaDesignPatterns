package com.javaSession.creational.four.factory.Practice;

import com.javaSession.creational.four.factory.DemoOne.Vehicle;

public class CommercialPlan extends Plan {

	public CommercialPlan() {

		System.out.println("Commercial plan created");
		
	}
	@Override
	public void getRate() {
		rate = 7.5;
	}

}
