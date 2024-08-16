package com.ict.day14;

// 추상 클래스 상속
//1. 일반적인 클래스가 추상 클래스를 상속하면
//	 일반적인 클래스는 추상메서드를 오버라이딩해서 완성해야 된다.
class Ex07_Cat extends Ex07_Animal {
	@Override
	public void sound() {
		System.out.println("야옹~야옹");
	}
}

// 2. 추상클래스가 추상클래스를 상속하면 오버라이딩을 하지않는다.
//	  객체 생성 못함( 사용하기 위해서는 나중에는 일반 클래스가 상속받아야 한다.
abstract class Ex07_Dog extends Ex07_Animal {
	String addr = "제주도";
}

abstract class Ex07_Cow extends Ex07_Animal {
	@Override
	public void sound() {
		// TODO Auto-generated method stub

	}

	public abstract void like();
}

abstract class Ex07_Chicken extends Ex07_Animal {
	public abstract void sleep();
}

//일반클래스는 무조건 추상메서드 구현 해야 된다. (오버라이드 해야 된다.)
class Ex07_MyDog extends Ex07_Dog {
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}

class Ex07_MyCow extends Ex07_Cow {
	@Override
	public void like() {
		System.out.println("뛰어놀기");
	}
}
