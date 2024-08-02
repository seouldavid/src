package com.ict.day03;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("첫번째 수 : ");
		int num1 = scan.nextInt();

		System.out.print("두번째 수 : ");
		int num2 = scan.nextInt();

		int add = num1 + num2;
		int sub = num1 - num2;
		int multi = num1 * num2;
		double div = (int)(num1) / num2;

		System.out.println(num1 + " + " + num2 + " = " + add);
		System.out.println(num1 + " - " + num2 + " = " + sub);
		System.out.println(num1 + " * " + num2 + " = " + multi);
		System.out.println(num1 + " / " + num2 + " = " + div);

	}

}
