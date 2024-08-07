package com.ict.day08;

import java.util.Iterator;

public class Ex01 {

	public static void main(String[] args) {
		// 선언과 생성을 한번에 처리
		// 자료형[][] 이름 = new 자료형[1차원배열이 가지고 있는 각각의 배열의 크기]
		char[][] ch = new char[3][2];

		// 고정길이에서만 사용 가능
		ch[0][0] = 'a';
		ch[0][1] = 'A';

		ch[1][0] = 'b';
		ch[1][1] = 'B';

		ch[2][0] = 'c';
		ch[2][1] = 'C';

		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {
				System.out.println(ch[i][j]);
			}
		}
		System.out.println();

		// 고정길이 /가변길이 모두 사용하는 방법
		int[][] su = new int[4][2];
		int[] k1 = { 10, 20 };
		int[] k2 = { 100, 200 };
		int[] k3 = { 1000, 2000 };
		int[] k4 = { 10000, 20000 };

		System.out.println(su[0]);

		su[0] = k1;
		System.out.println(su[0]);
		su[1] = k2;
		su[2] = k3;
		su[3] = k4;
		System.out.println();
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su[i].length; j++) {
				System.out.println(su[i][j]);
			}
		}
		System.out.println();
		int[][] num = { { 1, 2, 3, 4 }, { 9, 8, 7, 6 } };
		//선언, 생성 데이터 저장을 한번에
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.println(num[i][j]);
			}
		}
		int [][] s1 = new int[3][];
		s1[0] =k1;
		System.out.println(s1[0][1]);
		
	}

}
