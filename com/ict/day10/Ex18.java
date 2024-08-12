package com.ict.day10;

import java.util.Scanner;

public class Ex18 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.print("학생 수: ");
	int nums = scan.nextInt();
	//Ex17 로 만들어진 클래스들의 모임 : 객체형 배열 , 참조자료형 배열 => 클래스를 배열  
	Ex17[] students = new Ex17[nums];
	
	for (int i = 0; i < students.length; i++) {
		students[i] = new Ex17();
		System.out.print("이름: ");
		students[i].setName(scan.next());
		 
		System.out.print("국어: ");
		int kor = scan.nextInt();
		System.out.print("영어: ");
		int eng = scan.nextInt();
		System.out.print("수학: ");
		int math = scan.nextInt();
		students[i].setSum(Ex17.calSum(kor, eng, math));
		students[i].setAverage(Ex17.calAverage(students[i].getSum()));
		students[i].setHak(Ex17.calHak(students[i].getAverage()));
	}
	
	//순위
	for (int i = 0; i < students.length; i++) {
		for (int j = 0; j < students.length; j++) {
			if (students[i].getSum() < students[j].getSum()) {

				students[i].setRank(students[i].getRank() + 1);
			}
		}
	}
	//정렬
	Ex17 tmp;
	
	for (int i = 0; i < students.length-1; i++) {
		for (int j = 1; j < students.length; j++) {
			if (students[i].getSum() < students[j].getSum()) {
				tmp = students[i];
				students[i] = students[j];
				students[j] = tmp;
			} 
		}
	}
	
	
	//출력
	System.out.println("이름\t총점\t평균\t학점\t순위");
	for (int i = 0; i < students.length; i++) {
		System.out.print(students[i].getName()+"\t");
		System.out.print(students[i].getSum()+"\t");
		System.out.print(students[i].getAverage()+"\t");
		System.out.print(students[i].getHak()+"\t");
		System.out.print(students[i].getRank()+"\t");
		System.out.println();
	}
	

}
}
