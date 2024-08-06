package com.ict.day07;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("학생의 수: ");
		int cnt = scan.nextInt();
		scan.nextLine();
		// 학생의 수를 3을 입력 후 enter 치면 입력버퍼에 있는 3는cnt에 가고 enter만 남는다.
		// 이 남은 enter를 지은 위에 scan.next
		String[] names = new String[cnt];
		int[] kor = new int[cnt];
		int[] eng = new int[cnt];
		int[] math = new int[cnt];
		int[] sum = new int[cnt];
		double[] avg = new double[cnt];
		int[] rank = new int[cnt];
		String[] hak = new String[cnt];
		for (int i = 0; i < rank.length; i++) {
			System.out.print("이름,국어,영어,수학 입력 >> ");
			// 띄어쓰기를 하면 띄어쓰기 전까지만 사용하고 탈출한다.

			String str = scan.nextLine();
			System.out.println("str : " + str);
			String[] in = str.split(" ");
			names[i] = in[0];
			kor[i] = Integer.parseInt(in[1]);
			eng[i] = Integer.parseInt(in[2]);
			math[i] = Integer.parseInt(in[3]);

			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = (int) (sum[i] / 3.0 * 10) / 10.0;
			if (avg[i] >= 90) {
				hak[i] = "A";
			} else if (avg[i] >= 80) {
				hak[i] = "B";
			} else if (avg[i] >= 70) {
				hak[i] = "C";
			} else {
				hak[i] = "F";
			}

			// 순위의 초기값은 모두 사람이 1이다.
			rank[i] = 1;

		}

		// 순위
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if (sum[i] < sum[j]) {
					rank[i]++;
				}
			}
		}
		// 정렬

		// 출력
		System.out.println("이름\t총점\t평균\t학점\t순위");
		for (int i = 0; i < hak.length; i++) {

			for (int j = 0; j < hak.length; j++) {
				if (i + 1 == rank[j]) {

					System.out.print(names[j] + "\t");
					System.out.print(sum[j] + "\t");
					System.out.print(avg[j] + "\t");
					System.out.print(hak[j] + "\t");
					System.out.println(rank[j]);
				}
			}
		}

	}

}
