package com.ict.day04;

public class Ex02 {

	public static void main(String[] args) {
		// if else 문
		// 조건식이 참일때와 거짓일때
		// 각각 나눠서 처리한다.
//		 if(조건식){
//		 조건식이 참일때 실행할 문장;
//		 조건식이 참일때 실행할 문장;
//		 }else{
//		 조건식이 거짓일때 실행할 문장;
//		 조건식이 거짓일때 실행할 문장;
//		 }

		// int k1이 홀수인지 짝수인지 판별하자
		int k1 = 7;
		String res = "";
		if (k1 % 2 == 0) {
			res = "짝수";
		} else {

			res = "홀수";
		}

//		int k2가 1이면 가격을 10% 할인한다.
		int k2 = 1;
		int price = 1500;
		int result = 0;
		if (k2 == 1) {
			result = (int) (price * 0.9);
		} else {
			result = price;
		}
		System.out.println("가격은: " + result);

		// char k4가 대문자인지 아닌지를 판별하자.
		char k4 = 'd';
		if (k4 >= 'A' && k4 <= 'Z') {
			System.out.println("대문자");
		} else {

			System.out.println("소문자");
		}

		// 근무시간이 8시간 까지는 시간당 9860 이다.
		// 8시간 초과하면 초과한 시간만큼 1.5배 지급한다.
		// 현재 내가 근무한 시간이 10시간이면 얼마를 받아야 하는가.
		int income = 9860;
		int hour = 10;
		int total = 0;
		if (hour > 8) {
			total = income * 8;
		} else {
			total = income * 8 + (int) (income * 1.5 * (hour - 8));
		}
		System.out.println("결과: " + total);

	}

}
