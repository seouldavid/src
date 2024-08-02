package com.ict.day03;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("초를 입력하시오: ");
		int seconds = scan.nextInt();
		
		int h = seconds / 3600;
		int m = (seconds % 3600) / 60;
		int s = ((seconds % 3600) % 60);

		System.out.println(seconds + "초는 : " + h + "시" + m + "분" + s + "초 입니다");

	}
}
