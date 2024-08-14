package com.ict.day13;

//상속관계 (is a 관계) : 
//자식클래스가 부모클래스의 멤버필드와 멤버메서드를 아무런 제약없이 마음대로 사용할 수 있는 클래스들 간의 관계
//				포유류 (부모)		   : 공통적인 부분
//					|
// 		사람, 강아지, 고양이, 고래 (자식) : 각자 나름대로 특징이 존재함
//
//
// 형식) 자식클래스 extends 부모클래스
// 특징) 모든 클래스는 하나의 부모클래스를 갖고 있다.
//		없으면 Object 클래스가 부모클래스이다.(생략되어있음)
//		모든 클래스는 Object 클래스를 부모 클래스로 가지고 있다.
//		다중 상속을 지원하지 않는다.(부모클래스가 하나만 존재한다.)
public class Ex04_Sub extends Ex04_Sup {
	String name = "홍반장";
	int age = 14;
	private double weight = 81.9;

	public Ex04_Sub() {
		// 첫줄에 상속관계일때 부모클래스 생성자를 호출하는 예약어가 있음(생략되어있음)
		System.out.println("자식클래스생성자 : " + this);
	}

	public void play() {
		//변수의 우선순위
		//지역변수 > 전역변수(this) > 부모변수(super)
		String name = "홍두께";
		System.out.println(name);		
		System.out.println(this.name);	//홍반장
		System.out.println(super.name);	//홍길동

		System.out.println(age);		//14
		System.out.println(this.age);	//14
		System.out.println(super.age);	//14
		
		System.out.println(addr); //몰랐던 부분
		System.out.println(this.addr);
		System.out.println(super.addr);
		
		// 자기자신의 private은 접근가능
		System.out.println(weight);		//81.9
		// 부모변수라도 private 이면 접근 불가
		//System.out.println(super.dog)
	}
}
