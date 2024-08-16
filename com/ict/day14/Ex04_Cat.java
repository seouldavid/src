package com.ict.day14;
//final 변수 = 상수 = 데이터 변경 금지
//final 메서드 = 오버라이딩 방지 = 부모 클래스메서드 변경 금지
//final 클래스 = 상속금지 (자식클래스 생성금지)
public class Ex04_Cat extends Ex04_Animal {

	public void play() {
		age = age + 10;
		System.out.println(age); //12
	}

	
	public void play2() {
//		System.out.println("잠자기");
//		 final 변수 = 상수 => 데이터변경 금지
		// month = month +10
	}
	
	@Override
	public void sound() {
		System.out.println("야옹~ 야옹~");
	}
	//부모클래스 메서드에 final 있으면 
	// 오버라이드 할 수 없다
//	@Override
//	public void sleep() {
//		System.out.println("15시간 이상 잠을 잔다");
//	}
	
}
