package com.ict.day12;

import java.util.Random;

public class Ex23 {
	public static void main(String[] args) {
		// random 처리
		// 1. Math.random()
		// 2. Random 클래스

		// Math 클래스의 전체 메서드는 모두 static 메서드이다. 객체 생성없음
		// Math.메서드이름([인자]);

		// 1. Math.random() //0.0 이상 1.0 미만
		System.out.println(Math.random());

		// 2. 특정범위
		// System.out.println(Math.random() * 숫자); // 0- (숫자 -1)

		// Random 클래스 : 일반 클래스이므로 객체 생성 해야한다.
		Random ran = new Random();

		// 각종 자료형의 난수를 발생
		System.out.println("boolean 형 : " + ran.nextBoolean());
		// int형과long 형은 음수가 된다.
		System.out.println("int 형 : " + ran.nextInt());
		System.out.println("long 형 : " + ran.nextLong());

		// 실수 : 0.0 이상 ~ 1.0미만
		System.out.println("float형 : " + ran.nextFloat());
		System.out.println("double형 : " + ran.nextDouble());

		// 특정범위 :
		// 1. .nextInt(숫자) :0- (숫자 -1) : 0-(숫자-1)
		// 2.(int)(ran.nextDouble() * 숫자) : 0-(숫자-1)
		System.out.println(ran.nextInt(1, 10));
		System.out.println((int)(ran.nextDouble() * 7));

	}
}
