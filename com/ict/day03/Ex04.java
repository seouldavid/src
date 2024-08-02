package com.ict.day03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// 이름, 국어, 영어, 수하 점수를 키보드로 입력 받아서
		// 총점,평균을 구하고
		// 이름, 총점, 평균을 출력 (평균 소숫점 첫째자리까지 구하자.)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = scan.next();
		
		System.out.print("국어: ");
		int kor = scan.nextInt();
		
		System.out.print("영어: ");
		int eng = scan.nextInt();
		
		System.out.print("수학: ");
		int math = scan.nextInt();
		
		int sum = kor + eng + math;
		double average = (int)(10 * sum/3.0)/10.0;
		System.out.println("이름: " + name);
		System.out.println("총점: " + sum);
		System.out.println("평균: " + average);
	}

}
