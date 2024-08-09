package com.ict.day09;

public class Test2 {
	String name = "david";
	int score = 11;
	static String namae = "davit";
	
	public Test2(String name) {
		this.name = name; 
		this.greeting("you");
	}
	
	final void greeting(String message) {
		System.out.println("hi" + message);
		System.out.println("I am " + name);
	}
	
	

}
