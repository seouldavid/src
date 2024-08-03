package com.ict.day05;

public class TestCode {
	static int test;

	public static void main(String[] args) {
		// 1-10까지 출력
		int i = 1;
		int sum = 0;
		do {
			if (i > 10) {
				break;
			}
			System.out.println(i);
			i++;
		} while (true);
		// 5단
		i = 1;
		System.out.println("5단");
		do {
			if (i >= 10) {
				break;
			}
			System.out.println("5*" + i + "=" + (5 * i));
			i++;
		} while (true);
		
		// 1-10 홀수의 합, 짝수의 합 구하기
		int odd = 0;
		int even = 0;
		i = 1;
		do {
			if (i > 10) {
				break;
			}

			if (i % 2 == 1) {
				odd = odd + i;
			} else {
				even = even + i;
			}
			i++;
		} while (true);
		System.out.println("홀수 합: " + odd);
		System.out.println("짝수 합: " + even);
		
		System.out.println(test);
		double ert = 0.0;
		ert++;
		System.out.println(ert);

	}

}
