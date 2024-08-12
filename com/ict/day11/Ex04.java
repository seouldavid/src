package com.ict.day11;

public class Ex04 {

	public static void main(String[] args) {
		Ex03 test = new Ex03();
		int sum = test.plus(10, 20);
		System.out.println("sum : "+ sum);
		
		sum = test.plus("10", "20");
		System.out.println("sum : "+ sum);
		
		sum = test.plus(10.5, 20.9);
		System.out.println("sum : "+ sum);

	}

}
