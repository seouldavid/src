package com.ict.day01;

public class Ex04 {

	public static void main(String[] args) {
		// 숫자형은 정수형과 실수형으로 나눈다.
		// 정수형응 소숫점아 없는 숫자
		// 실수혀은 서슷점이 있는 숫자
		// 정수 < 실수	
		
		// 정수 : byte< short < int(기본) <long
		// 실수 : float < double(기본)
		
		//byte :-128 ~ 127
		
		byte k1;
		k1 = 125 ;
		System.out.println(k1);
		
		short k2;
		k2= 125;
		System.out.println(k2);
		//정수형의 기본은 int 이다.
		int k3;
		k3 = 125;
		System.out.println(k3);
		//정수 중 가장 큰 범위는 long 이다.
		// 숫자 뒤에 L 또는 l을 붙인다(생략가능)
		long k4;
		k4= 125L;
		System.out.println(k4);
		//long = int 특별 케이스 int 가 long 형으로 버뀜 - jvm이 프로모션한다 프로모션 - 작은데이터가 큰 데이터로 변환(자동)
		//데이터 변형없음
		
		long k5;
		k5 =125;
		System.out.println(k5);
		
		int num1; 
		//int = long 큰 데이터가 작은 데이터로 변환(오류발생)
		//강제로 오류를 해제할 수 있다(디모션) =>강제형 변환
		//데이터 변형이 있을 수 도 있다.
		// 캐스팅 한다
		//방법: 변수 =(왼쪽자료형)(데이터);
		num1 = (int) (125L);
		System.out.println(num1);
		
		byte num2;
		num2 =(byte)(129);
		System.out.println(num2);
		
		
		
	}

}
