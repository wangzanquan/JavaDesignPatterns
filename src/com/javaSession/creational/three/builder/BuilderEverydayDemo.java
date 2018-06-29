package com.javaSession.creational.three.builder;

public class BuilderEverydayDemo {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		
		builder.append("This is an example");
		builder.append(" of the builder patter. ");
		builder.append("It has methods to append ");
		builder.append("amost anything we want to a String. ");
		builder.append(42);
		
		System.out.println(builder.toString());

	}

}
