package com.ict.day12;
	
public class Ex04 {
	//생성자 : 클래스를 객체로 만들때 한번 호출되는 특수한 메서드.
	//  	 예) 클래스이름 참조변수 = new 생성자([인자])
	// 목적 : 멤버필드(변수와 상수)의 초기값 설정
	// 		 다른 메서드 처럼 초기값 설정 이외도 사용할 수 있다.
	// 특징 : 클래스 이름 = 저장이름 = 생성자 이름
	//		 반환형이 없는 메서드 같다.
	// 		 생성자가 없으면 자바컴파일러에서 자동으로 기본 생성자를 이용해서 객체 생성한다.
	//		 기본생성자란 인자가 없느 생성자를 말한다. (기본 생성자 = 클래스 이름())
	//		 생성자를 있으면 있는 생성자를 이용해서 객체생성을 해야한다.
	//		 생성자에서 메서드를 호출할 수 있다.
	//		 생성자 오버로딩 가능하다.
	//		 하나의 클래스에 여러개의 생성자를 만들 수 있다.
	//		 (단, 인자의 수와 자료형이 달라야 한다.)
	//		 생성자는 다른 생성자를 호출 할 수도 있다.
	//
	
	
	private String name = "홍길동";
	private int age = 24;
	private String addr = "충청도";
	
	public Ex04(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public Ex04(String name) {
		this.name = name; 
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
