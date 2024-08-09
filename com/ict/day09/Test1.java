package com.ict.day09;

public class Test1 {

	public static void main(String[] args) {
		Test2 me = new Test2("Davidd");
		System.out.println(me.name);
		System.out.println(Test2.namae);
		Test2.namae ="david";
		System.out.println(Test2.namae);
		me.greeting("you");
	}
}
