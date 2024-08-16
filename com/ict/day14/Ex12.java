package com.ict.day14;

//인터페이스 상속
//1. 일반 클래스가 인터페이스를 부모로 해서 상속 받으면 반드시 오버라이딩 해야 한다.
class Ex12 implements Ex10 {
	@Override
	public void play() {
		// TODO Auto-generated method stub
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
	}
}

//2. 추상 클래스가 인터페이스르 부모로 해서 상속을 받으면 오버라이딩 하지 않는다.
abstract class Ex13 implements Ex10 {
	
}

//3. 인터페이스가 인터페이스를 부모로 상속 받으면 오버라이딩 하지 않는다.
interface Ex14 extends Ex10 {
	 @Override
	default void play() {
		// TODO Auto-generated method stub
		
	}
	 @Override
	default void sound() {
		// TODO Auto-generated method stub
		
	}
}