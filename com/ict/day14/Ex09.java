package com.ict.day14;

// 인터페이스 :서비스를 제공하는 목록
// 			다수의 구현체를 통일화된 명세로 정의하는것
//			클래스들이 반드시 구현해야 하느 메서드의 목록을 정의한 것
//			상수와 추상 메서드로 구성되어 있음
//			객체 생성 안됨
//			클래스 상속과 달리 인터페이스 상속은 다중 상속이 가능하다.
//			** 인터페이스가 같다는 뜻은 대체가 가능하다.

class Ex09 {
	int su1 = 10;
	static int su2 = 20;
	int su3 = 30;
	static final int su4 = 30;
}

interface Ex10 {
	int su1 = 100;
	static int su2 = 200;
	final int su3 = 300;
	static final int su4 = 400;
	
	//추상 메서드
	public abstract void sound();
	//abstract 생략 가능
	public void play();
}