package com.javaSession.creational.four.factory.Practice;

public class InstitutionPlan extends Plan{

	public InstitutionPlan() {
	
		System.out.println("Institution plan created");

	}
	
	@Override
	public void getRate() {
		rate = 5.5;
		
	}

}
