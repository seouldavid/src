package com.ict.day02;

public class Ex09 {

	public static void main(String[] args) {
		//	증감연산자 : 1씩 증가 감소기키는 연산자
		// ++(--)변수:현재 가지고 있는 값에1을 증가(감소)
		// 변수++(--):현재 가지고 있는 변수값을 사용하고 ;를 만남후 1 증가(감소)

		int su1 = 4;
		int su2 = 4;
		
		int result = ++su1 * 4;
		int result2 = su2++ * 4;
		
		System.out.println("result : " + result); //20
		System.out.println("result2 : " + result2);//16
		System.out.println(su1);//5
		System.out.println(su2);//5
		System.out.println();
		
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
		System.out.println(y);
		
	}

}
