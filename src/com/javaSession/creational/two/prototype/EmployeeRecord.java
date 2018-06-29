package com.javaSession.creational.two.prototype;

public class EmployeeRecord implements Prototype{

	private int id;
	private String name, designation;
	private double salary;
	private String address;
	
	@Override
	public Prototype getClone() {
		return new EmployeeRecord(id, name, designation, salary, address);
	}

	public EmployeeRecord() {
		System.out.println("Employee Records of Oracle Corporation");
		System.out.println("---------------------------------------");
		System.out.println(" E id" + "\t" + "E name" + "\t" + "E designation" + "\t" + "E salary" + "\t\t" + "E address");
	}

	public EmployeeRecord(int id, String name, String designation, double salary, String address) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.address = address;
	}
	
	public void showRecord() {
		System.out.println(id + "\t" + name + "\t" + designation + "\t" + salary + "\t" + address);
	}
	
	
	
}
