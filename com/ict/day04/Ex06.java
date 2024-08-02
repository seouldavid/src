package com.ict.day04;

public class Ex06 {

	public static void main(String[] args) {
		// for문 정해진 규칙에 따라 실행문을 반복 처리한다.
		// 조건싯이 참일때 실행 겆;ㅅㅇ;먄 실행 안함
		// 형식) for (초기식;조건식; 증감식){
		// 조건식이 참일 때 실행할 문장;
		// 조건식이 참일 때 실행할 문장;
		// 조건식이 참일 때 실행할 문장;
		// }
		// 정해진 규칙
		// 1. for문 만나면 초기식 간다.
		// 2. 초기식에서 조건식 간다,
		// 3. 조건식이 참니면 실향 거짓이면 실행 어ㅏㄴ함
		// 4. for문의 끝을 만나면 증감식 간다.
		// 5. 증감식에서 조건식 간다.

		// 자바에서는 블록안에 만들에진 변수는 블럭 벗어니ㅏ먄 사라징가 +> 지역변수
		// for문도 초기식에서 변수로 선언하고 초기값을 주면
		// for문을 벗어나면 변수는 사라진다.
//		for (int i = 0; i < 10; i++) {
//			System.out.print(i + " ");
//			System.out.println("hi");
//		}
//		int k;
//		
//		for ( k = 0; k < 10; k++) {
//			System.out.println(k);
//		}
//		System.out.println("k: " + k);

//		for (int i = 0; i < 10; i= i+2) {
//		System.out.print(i + " ");
//		System.out.println("hi");
//	}
		// 10 부터 20 까지 출력

		for (int i = 10; i < 21; i++) {
			System.out.println(i);
		}

		// 10-20까지 짝수 찍기
		System.out.println("-------10-20까지 짝수찍기------------");

		for (int i = 10; i < 21; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		// 10-20까지 홀수 찍기
		System.out.println("-------10-20까지 홀수찍기------------");
		for (int i = 10; i < 21; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		// 1-50까지 7의 배수만 출력
		System.out.println("-------1-50까지 7배수 찍기------------");
		for (int i = 1; i < 51; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
		}

		// 1-10까지 누적합 구하기
		// 1-10까지 홀수의, 짝수의 누적합 각각 구하기
		System.out.println("-------1-10까지 누적합 구하기------------");
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum = sum + i;
		}
		System.out.println("1-10까지 누적합: " + sum);

		System.out.println("-------1-10까지 홀짝 누적합 구하기------------");
		int odd = 0;
		int even = 0;
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 1) {
				odd = odd + i;
			} else {
				even = even + i;
			}
		}
		System.out.println("1-10까지 홀수 누적합: " + odd);
		System.out.println("1-10까지 짝수 누적합: " + even);
		//
		System.out.println("""
				------------------------
				0 0 0 0
				0 0 0 0
				0 0 0 0
				0 0 0 0 프린트하기:
				------------------------
								""");
		String paper = "";
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 7; j++) {
				if (j % 2 == 0) {
					paper = paper + 0;
				} else {

					paper = paper + " ";
				}
			}
			paper = paper + '\n';

		}
		System.out.println(paper);
		paper = "";
		for (int i = 1; i < 17; i++) {
			paper = paper + "0 ";
			if (i % 4 == 0) {
				paper = paper + '\n';
			}

		}
		System.out.println(paper + "------");
		paper = "";
		for (int i = 1; i < 17; i++) {
			System.out.print("0 ");
			if (i % 4 == 0) {
				System.out.println();
			}

		}
		System.out.println();
		paper = "";
		// 증
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2 * (i + 1); j++) {
				if (j % 2 == 0) {
					paper = paper + 0;
				} else {

					paper = paper + " ";
				}
			}
			paper = paper + '\n';
		}
		System.out.println(paper);
//		paper = "";
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 7 - 2 * i; j++) {
//				if (j % 2 == 0) {
//					paper = paper + 0;
//				} else {
//
//					paper = paper + " ";
//				}
//			}
//
//			// 증
//			for (int k = 0; i < 4; i++) {
//				for (int j = 0; j < 2 * (i + 1); j++) {
//					if (j % 2 == 0) {
//						paper = paper + 0;
//					} else {
//
//						paper = paper + " ";
//					}
//				}
//				paper = paper + '\n';
//
//			}
//		}
//		System.out.println(paper);
		
		
		sum = 0;
		int x = 0;
		for (int i = 0; sum < 100; i++) {
			if (i % 2 == 1) {
				sum = sum + i;
			} else {
				sum = sum - i;

			}
			x = i;
		}
		System.out.println("합: " + sum);
		System.out.println("숫자: " + x);
		//별찍기
		paper = "";
		String star = "★";
		for (int i = 0; i < 10; i++) {
			
			for (int k = 10; k-i > 0; k--) {
				paper = paper + " ";
			}
			
			for (int j = 0; j < 1 + 2 * i; j++) {
				paper = paper + "★";
			}
			paper = paper + '\n';
		}
		System.out.println(paper);

	}

}
