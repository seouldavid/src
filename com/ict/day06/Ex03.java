package com.ict.day06;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 학생 인원수를 받고
		// 이름, 국어, 영어, 수학을 받아서
		// 총점, 평균, 학점, 순위를 구하고
		// 이름 총점 평균 학점 순위를 출력하자
		Scanner scan = new Scanner(System.in);
		System.out.print("총 학생수: ");
		
		int numOfPeople = scan.nextInt();
		String[] names = new String[numOfPeople];
		int[] sums = new int[numOfPeople];
		double[] averages = new double[numOfPeople];
		char[] letters =new char [numOfPeople];
		int[] rank = new int[numOfPeople];
		Arrays.fill(rank, 1);
		
		for (int i = 0; i < names.length; i++) {
			System.out.print("이름: ");
			String name = scan.next();
			names[i] = name;
		
			System.out.print("국어: ");
			int kor = scan.nextInt();

			System.out.print("영어: ");
			int eng = scan.nextInt();

			System.out.print("수학: ");
			int math = scan.nextInt();
			int sum = kor + eng + math;
			sums[i] = sum;
			double average = (int) (sum/3.0 *10) / 10.0 ;
			averages[i] = average;
			
			if (average >=90) {
				letters[i] = 'A';
			} else if (average >=80) {
				letters[i] = 'B';
			} else if (average >=70) {
				letters[i] = 'C';
			} else if (average >=60) {
				letters[i] = 'D';
			} else {
				letters[i] = 'F';
			}

		}
		for (int i = 0; i < averages.length; i++) {
			for (int j = 0; j < averages.length; j++) {
				if (averages[i] < averages[j]) {
					rank[i]++;
				}
			}
		}
		System.out.println("이름\t총점\t평균\t학점\t순위");
		for (int i = 0; i < rank.length; i++) {
//			System.out.println("이름:\t"+names[i]+"총점:\t"+sums[i]+"평균:\t"+averages[i]+"학점:\t"+letters[i]+ "순위:\t" + rank[i] );
			System.out.print(names[i]+"\t");
			System.out.print(sums[i]+"\t");
			System.out.print(averages[i]+"\t");
			System.out.print(letters[i]+"\t");
			System.out.print(rank[i]+"\t");
			System.out.println();
		}

	}

}
