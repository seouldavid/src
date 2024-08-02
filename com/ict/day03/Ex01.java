package com.ict.day03;

public class Ex01 {

	public static void main(String[] args) {
		// 논리연산자 : && (AND,논리곱,교집합)
		// 			 || (OR,논리합, 합집합)
		//			! (NOT,논리부정;0
		
		// 연산대상 : 비교연산자, 논리연산자, 논리형(true,false)
		// 결과 : boolean형 => 주로 조건식에 허용된다.
		// && (AND,논리곱,교집합)
		// 주어진 조건들리 모두true 일때 결과기 true
		//하나라도 false가 있으면 결과 false
		//false.를 만나면 연산이 중단된다.
		
		//AND 조건을 이용하면 범위를 지정할 수있다.
		
		int su1 =10;
		int su2 = 7;
		boolean res =false;
		//true = true && true
		res = (su1>=7) && (su2 >=5);
		System.out.println(res);
		//false = false && true
		res = (su1<=7) && (su2 >=5);
		System.out.println(res);
		
		//false = true && false
		res = (su1>=7) && (su2 <=5);
		System.out.println(res);
		
		// false = false&&false
		res = (su1<=7) && (su2 <=5);
		System.out.println(res);
		
		//AND연산은 false를 만나면 경과는 false이고 이흐연산을 하지 않눈다.
		su1 = 10;
		su2 = 7;
		//          True          &&            true
		res = ( ((su1=su1+2)> su2)&&(su1 == (su2=su2+5)) );// true
		System.out.println("결과: " + res);//true
		System.out.println("su1: "+ su1);//12
		System.out.println("su2: "+ su2);//12
		System.out.println();
		
		su1 = 10;
		su2 = 7;
		//              true          &&         false
		res = ( ((su1=su1+2)> su2)&&(su1 != (su2=su2+5)) );// true
		System.out.println("결과: " + res);//false
		System.out.println("su1: "+ su1);//12
		System.out.println("su2: "+ su2);//12
		System.out.println();
		
		su1 = 10;
		su2 = 7;
		//              false          &&         true
		res = ( ((su1=su1+2)< su2)&&(su1 == (su2=su2+5)) );// true
		System.out.println("결과: " + res);//false
		System.out.println("su1: "+ su1);//12
		System.out.println("su2: "+ su2);//7 계산 안됨 true를 만나서 스킵
		System.out.println();
		
		//AND 조건을 이용하면 범위를 지정할 수있다.
		int su3 =14;
		res = su3>=10 && su3 <=20;
		System.out.println("결과: " + res); //true
		System.out.println();
		
		char c1 ='0';
		res = c1 >= 'A' && c1 <='Z';
		System.out.println("결과: " + res); //true
		
		
	}

}
