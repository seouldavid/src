package com.ict.day07;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("학생 수: ");
		int studentNums = scan.nextInt();
		String[] names = new String [studentNums];
		int[] totals = new int [studentNums];
		double[] averages = new double [studentNums];
		String[] letters = new String [studentNums];
		int[] ranks = new int [studentNums];
		String[] data = new String[4];
		scan.nextLine();
		for (int i = 0; i < studentNums; i++) {
			
			System.out.print("이름,국어,영어,수학 입력 >> ");
			String info = scan.nextLine();
			data = info.trim().split(" "); 
			
			int total = Integer.parseInt(data[1]) +Integer.parseInt(data[2]) + Integer.parseInt(data[3]);
			double average = (int)(total/3.0 *10)/10.0;
			names[i] = data[0];
			if(average >=90) {
				letters[i] = "A학점";
			} else if (average >=80) {
				letters[i] = "B학점";
			} else if (average >=70) {
				letters[i] = "C학점";
			} else if (average >=60) {
				letters[i] = "D학점";
			} else {
				letters[i] = "F학점";
			}
			
			
			totals[i] = total;
			averages[i] = average;
		}
		Arrays.fill(ranks, 1);
		for (int i = 0; i < ranks.length; i++) {
			for (int j = 0; j < ranks.length; j++) {
				if (averages[i] < averages[j]) {
					ranks[i]++;
				}
			}
		}
		System.out.println("이름\t총점\t평균\t학점\t순위");
		for (int i = 0; i < ranks.length; i++) {
			System.out.print(names[i]+"\t");
			System.out.print(totals[i]+"\t");
			System.out.print(averages[i]+"\t");
			System.out.print(letters[i]+"\t");
			System.out.print(ranks[i]+"\t");
			System.out.println();
		}

	}
}
