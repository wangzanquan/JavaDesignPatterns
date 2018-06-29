package com.javaSession.creational.two.prototype;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrototypeDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Employee ID: ");
		int eid = Integer.parseInt(br.readLine());

		System.out.println("\nEnter Employee Name: ");
		String ename = br.readLine();
		
		System.out.println("\nEnter Employee Desination: ");
		String edesignation = br.readLine();
		
		System.out.println("\nEnter Employee Address: ");
		String eaddress = br.readLine();
		
		System.out.println("\nEnter Employee Salary: ");
		double esalary = Double.parseDouble(br.readLine());
		
		EmployeeRecord e1 = new EmployeeRecord(eid, ename, edesignation, esalary, eaddress);
		
		e1.showRecord();
		System.out.println("\n");
		
		EmployeeRecord e2 = (EmployeeRecord)e1.getClone();

		e2.showRecord();
		
		
	}

}
