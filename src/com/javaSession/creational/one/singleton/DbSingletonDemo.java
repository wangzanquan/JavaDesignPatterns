package com.javaSession.creational.one.singleton;

public class DbSingletonDemo {

	public static void main(String[] args) {
		//Calling DbSingleton class and instead of creating new instance will use
		//getInstance method.
		DbSingleton instance = DbSingleton.getInstance();
		
		System.out.println(instance);
		
		/*
		 * Lets try with one more instance and check if we are getting same instance or not
		 */
		
		DbSingleton anotherinstance = DbSingleton.getInstance();
		
		System.out.println(anotherinstance);
		
		//make it lazy loaded
		//Make the private static DbSingleton instance = null

	}

}
