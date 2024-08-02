package com.ict.day05;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// 국어 영어 수학 점수 받고 총접 평균 구하고 계속할까요?
		Scanner scan = new Scanner(System.in);
		
		int kor = 0;
		int eng = 0;
		int math = 0;
		int sum = 0;
		double average = 0;
		int option = 0;
		String name = "";
		
		
		while (true) {
			System.out.print("학년을 입력하시오: ");
			int lvl = scan.nextInt();
			// 입력버퍼에남아있는 엔터문자를 삭제하기 위해서
			scan.nextLine();
			System.out.print("이름을 입력하시오: ");
			name = scan.nextLine();
			System.out.print("국어 점수를 입력하시오: ");
			kor = scan.nextInt();

			System.out.print("영어 점수를 입력하시오: ");
			eng = scan.nextInt();

			System.out.print("수학 점수를 입력하시오: ");
			math = scan.nextInt();

			sum = kor + eng + math;
			average = sum / 3;

			String hak = "";
			if (average >= 90) {
				hak = "A학점";
			} else if (average >= 80) {
				hak = "B학점";
			} else if (average >= 70) {
				hak = "C학점";
			} else {
				hak = "F학점";
			}
			
			System.out.println("총점: " + sum);
			System.out.println("평균: " + average);
			System.out.println("학점: " + hak);
			System.out.println("이름: " + name);

			System.out.print("계속하시겠습니까? (yes ->1 no ->2) : ");
			option = scan.nextInt();

			if (option == 1) {
				continue;
			} else if (option == 2) {
				break;
			} else {
				System.out.print("계속하시겠습니까? (yes ->1 no ->2) : ");
				option = scan.nextInt();
			}
		}

	}

}
