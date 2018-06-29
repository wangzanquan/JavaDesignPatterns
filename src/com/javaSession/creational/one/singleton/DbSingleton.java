package com.javaSession.creational.one.singleton;

public class DbSingleton {
	//Singleton class will not have public constructor
	//Singleton class also requires to have static instance of class itself
	
	private static volatile DbSingleton instance = null;
	
	private DbSingleton() {
		
	}
	
	//This method will use to use the instance of the class
	public static DbSingleton getInstance() {
		if(instance == null) {
			instance = new DbSingleton();
		}
		return instance;
	}
}
