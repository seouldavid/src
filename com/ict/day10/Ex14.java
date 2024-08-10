package com.ict.day10;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		Ex13 student = new Ex13();
		
		System.out.print("이름: ");
		String name = scan.next();
		
		System.out.print("국어: ");
		int kor = scan.nextInt();
		
		System.out.print("수학: ");
		int math = scan.nextInt();
		
		System.out.print("영어: ");
		int eng = scan.nextInt();
		
		int sum = student.getSum(kor,eng,math);
		double avg = student.getAvg(sum);
		String hak = student.getHak(avg);
		
		System.out.println("이름: " + name);
		System.out.println("총합: " + sum);
		System.out.println("평균: " + avg);
		System.out.println("학점: " + hak);
		
		

	}

}
