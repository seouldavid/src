package com.ict.day16;

import java.util.HashSet;
import java.util.Scanner;

public class Ex04_Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashSet<Ex04> students = new HashSet<>();
		esc: while (true) {
			System.out.print("이름:");
			String name = scan.next();
			System.out.print("국어:");
			int kor = scan.nextInt();
			System.out.print("영어:");
			int eng = scan.nextInt();
			System.out.print("수학:");
			int math = scan.nextInt();

			int sum = kor + eng + math;
			double average = (int) (sum / 3.0 * 10.0) / 10.0;
			String hak = "";
			if (average >= 90) {
				
				hak = "A 학점";
			} else if (average >= 80) {
				
				hak = "B 학점";
			} else if (average >= 70) {
				
				hak = "C 학점";
			} else {
				
				hak = "F 학점";
			}
			Ex04 student = new Ex04(name, kor, eng, math, sum, average, hak);
			students.add(student);
			while (true) {
				System.out.println("학생 추가하시겠습니까? y/n");
				String choice = scan.next();
				if (choice.equalsIgnoreCase("y")) {
					continue esc;
				} else if (choice.equalsIgnoreCase("n")) {
					break esc;
				} else {
					System.out.println("다시 입력해 주십시오.");
				}
			}
		}
		System.out.print("이름\t총점\t평균\t학점\t");
		for (Ex04 ex04 : students) {
			System.out.println();
			System.out.print(ex04.getName() + "\t");
			System.out.print(ex04.getSum() + "\t");
			System.out.print(ex04.getAvg() + "\t");
			System.out.print(ex04.getHak() + "\t");
		}
	}
}
