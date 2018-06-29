package com.javaSession.creational.one.singleton;

public class SingletonEverydayDemo {

	public static void main(String[] args) {
		/*
		 * Runtime either has no constructor or private constructor
		 */
		
		Runtime singletonRuntime = Runtime.getRuntime();
		
		singletonRuntime.gc();
		
		System.out.println(singletonRuntime);
		
		Runtime antoherInstance = Runtime.getRuntime();
		
		System.out.println(antoherInstance);
		
		if(singletonRuntime == antoherInstance) {
			System.out.println("They are the same instance");
		}
		

	}

}
