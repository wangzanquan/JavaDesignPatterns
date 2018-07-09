package com.javaSession.creational.four.factory.Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class GenerateBill {
	public static void main(String[] args) throws NumberFormatException, IOException {
		GetPlanFactory planFactory = new GetPlanFactory();
		
		System.out.println("Enter the name of plan for which thebill will be generated: ");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String planName = br.readLine();
		System.out.println("Enter the number of unites for bill will be calculated: ");
		
		int units = Integer.parseInt(br.readLine());
		
		Plan p = planFactory.getPlan(planName);
		
		System.out.println("Bill amount for: " + planName + " of " + units + " unit is ");
		
		p.getRate();
		p.calculateBill(units);
		
	}
}
