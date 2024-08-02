package com.ict.day02;

public class Ex01 {

	public static void main(String[] args) {
		 //실수 : 소숫점이 있는 숫자
		//      float < double(기본)
		// float 는 숫자에 F나 f를 붙인다.
		float f1;
		f1 = 32546.123f;
		float f2;
		f2 = 124; //자동 형변환 float = int =>자동 형변환(자동) long 은 반드시 L float는 반드시 f
		System.out.println(f2);
		float f3;
		//float = double =>디모션(강제 형변환): 큰 자료형을 작은 자료형으로 변환 정보손실이 있을 수도 있다.
		//(왼쪽자료형)(강제변환할 데이터)
		f3 = (float)(1234.12);
		System.out.println(f3);
		  
		double d1;
		d1 =123.1232;
		
		double d2;
		//double = float => 프로모션(자동변환): 작은자형이 큰자료형으로 변환 (자동), 정보 손실이 있음
		d2=123.12f;
		
		
		

	}

}
