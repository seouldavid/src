package com.ict.day10;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("총 학생 수 : ");
		int nums = scan.nextInt();
		Ex09[] students = new Ex09[nums];
		for (int i = 0; i < nums; i++) {
			students[i] = new Ex09();
			System.out.print("이름: ");
			String name = scan.next();
			students[i].play01(name);
			
			System.out.print("국어: ");
			int kor = scan.nextInt();
			
			System.out.print("영어: ");
			int eng = scan.nextInt();
			
			System.out.print("수학: ");
			int math = scan.nextInt();
			
			students[i].play02(kor, eng, math);
			students[i].play03();
			students[i].play04();
			students[i].play05();
			

		}
		System.out.println("이름\t총점\t평점\t학점");
		for (int i = 0; i < students.length; i++) {
			System.out.print( students[i].name + "\t");
			System.out.print( students[i].sum + "\t");
			System.out.print( students[i].avg + "\t");
			System.out.print( students[i].hak);
			System.out.println();
		}
	}

}
