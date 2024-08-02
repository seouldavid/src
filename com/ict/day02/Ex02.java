package com.ict.day02;

public class Ex02 {

	public static void main(String[] args) {
		// 숫자 크기 비교 (char는 숫자로저장되기 때문에 비교 가능)
		// byte < short < char < int < float < double

		int su1 = 100;
		long su2 = su1; // 프로모션
		double su3 = su2; // 프로모션

		char ch1 = '대';
		int su4 = ch1; // 프로모션
		System.out.println("ch1: " + ch1);
		System.out.println("ch4: " + su4);

		// short 보다는 char가 크다.
		// short sh1=ch1; =>error

		// 소수점 둘째자리까지 구하자 (* => /)
		double num = 17486.2145;
		num = num * 100;
		System.out.println(num);

		// double을 int로 강제 형변환 하면 소수점이 없어진다.
		int num2 = (int) (num);
		System.out.println(num2);

		int num4 = num2 / 100; // 17486
		System.out.println(num4);// 17486

		// num2 => int, 100 => int
		// int와 int를 계산하면 결과는 long
		// long과 long을 계산하면 결과는 long
		// int와 long를 계산하면 결과는 long
		// float와 long를 계산하면 결과는 float
		// double과 long를 계산하면 결과는 double

		// double과 float을 계산하면 결과는 double

		// 예외 :모든 숫자계산은 int 이상으로결과를 저장한다.
		// byte와byte를 계산하면byte가 아니라 int
		// short와 short을 계산하면 short가 아니라 int
		// byte외 short을 계산하면 short가 아니라 int
		double num5 = num2 / 100; // 17486
		System.out.println(num5);// 17486.0

		double num6 = num2 / 100.0;
		System.out.println(num6);

		num = 17486.2145;

		double num7 = num / 10;
		System.out.println(num7);

		int num8 = (int) (num7) * 10;
		System.out.println(num8);
		
		
		
		
		
		

	}

}
