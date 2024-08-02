package com.ict.day05;

public class Ex01 {

	public static void main(String[] args) {
		// while문: for문과 같은 반복문
		// 형식)
		// 초기식;
		// while(조건식) {
		// 조건식이 참일 때 실행 할 문장;
		// 조건식이 참일 때 실행 할 문장;
		// 조건식이 참일 때 실행 할 문장;
		// 증감식;
		// }
		// while 문의 끝을 만나면 조건식으로 간다.
		//
		//
		int k = 0;
		while (k < 10) {
			System.out.print(k + "\t");
			k++;
		}
		System.out.println();

		// 구구단에서 7단 출력
		int num = 1;
		int res = 0;
		System.out.println("7단");
		while (num <= 9) {
			System.out.println("7*" + num + "= " + (num * 7));
			num++;
		}

		// 1-10까지 홀수의 누적합, 짝수의 누적합을 구하자
		int oddSum = 0;
		int evenSum = 0;
		int total = 0;
		num = 1;
		int max = 10;
		while (num <= max) {
			if (num % 2 == 0) {
				evenSum = evenSum + num;
			} else {
				oddSum = oddSum + num;
			}
			num++;
		}
		System.out.println("홀 합계: " + oddSum + "\n짝 합계: " + evenSum);
		
		

	}

}
