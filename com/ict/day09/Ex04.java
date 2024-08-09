package com.ict.day09;

public class Ex04 {

	public static void main(String[] args) {
		// Math 클래스 : 수학에서 자주 사용되는 상수(static final)들과 static 메서드들로 이루어진 클래스
		double k1 = Math.PI;
		System.out.println(k1);
		double k2 = Math.E;
		System.out.println(k2);
		
		//상수는 값 변경이 안된다.
//		Math.PI =Math.PI + 5;
		
		//math 메서드들은 static이므로 클래스를 객체 생성 하지 않아도 사용 가능
		// 사용법 : Math.메서드()
		
		//1.abs(인자 = 매개변수) : 받은 인자응 절대값 처리한다.
		System.out.println("abs: 절대값");
		System.out.println(Math.abs(10));
		System.out.println(Math.abs(15.124));
		System.out.println(Math.abs(-10));
		System.out.println(Math.abs(-15.124));
		
		//2.random():0.0 이상에서 1.0 미만의 임의의 난수 발생
		//			 무작위로 생성되는 수, 특정 패턴이나 규칙성이 없어야 한다.
		System.out.println(Math.random());//0.0 ~ 1.0미만
		int k3 = (int)Math.random() * 10;// 0-9
		
		//3. ceil() : 올림( 큰 정수 찾기)
		System.out.println("ceil() : 올림( 큰 정수 찾기)");
		System.out.println(Math.ceil(10.1));
		System.out.println(Math.ceil(10.6));
		System.out.println(Math.ceil(-10.1));
		System.out.println(Math.ceil(-10.6));
		System.out.println();
		//3. floor() : 내림( 작은 정수 찾기)
		System.out.println("floor() : 내림( 작은 정수 찾기)");
		System.out.println(Math.floor(10.1));
		System.out.println(Math.floor(10.6));
		System.out.println(Math.floor(-10.1));
		System.out.println(Math.floor(-10.6));
		System.out.println();
		//3. round() : 반올림( 작은 정수 찾기)
		System.out.println("round() : 반올림( 작은 정수 찾기)");
		System.out.println(Math.round(10.1));
		System.out.println(Math.round(10.6));
		System.out.println(Math.round(-10.1));
		System.out.println(Math.round(-10.6));
		System.out.println();
		
	}

}
