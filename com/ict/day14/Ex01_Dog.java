package com.ict.day14;

public class Ex01_Dog extends Ex01_Animal {
	
	//부모가ㅓ 가진 메서드를 가져와서 자식 클래스가 부모 클래스의 메서드를 가져와서
	//마음대로 변경해서 사용하는 것을 오버라이딩(재정의)라고 한다.
	
//	@Override
	public void sound() {
		System.out.println("멍멍!");
	}
}
