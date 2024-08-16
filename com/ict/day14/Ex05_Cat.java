package com.ict.day14;
//this : 객체 안에서 자기자신을 지정할때 사용하는 예약어
//super : 객체안에서 부모클래스를 지정할때 사용하는 예약어
//this(): 자기자신의 생성자를 호출할때 사용한다.
//		반드시 생성자 첫줄에 있어야 한다.
//super() :자식 클래스의 생성자에서 부모클래스의 생성자를 호출 할 때 사용
// 반드시 자식 클래스의 첫줄에 있어야 한다.
public class Ex05_Cat extends Ex05_Animal {
	String name = "동물";
	int age = 0;
	String addr = "서울";
	// 기본 생성자
	public Ex05_Cat() {
		System.out.println("자식 기본생성자 :" + this);
		System.out.println();
		System.out.println(age);
		System.out.println(addr);
		System.out.println();
		System.out.println(super.age);
	}
		
	}
	

