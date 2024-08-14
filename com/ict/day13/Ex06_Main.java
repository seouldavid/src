package com.ict.day13;

public class Ex06_Main {
	public static void main(String[] args) {
		Ex06_Sup test1 = new Ex06_Sup();
		test1.sound();
		System.out.println();
		
		Ex06_Sub test2 = new Ex06_Sub();
		test2.play();
		test2.sound();
		
		Ex06_Sup test3 = new Ex06_Sub();
		//부모클래스 메서드는 사용가능
		test3.sound();
		System.out.println(test3.name);
		//객체타입이 Ex06_Sup로 선언되었으므로
		//test3.play(); 
		
		//객체타입이 Ex06_Sup로 선언되었으므로
		//Ex06_Sub는 멤버필드와 멤버 메서드는 사용불가
		//test3.play()
		//System.out.pri ntln(test3.addr);
		//컴파일 오류
		// 자식 클래스 = 부모클래스
		//Ex06_Sub test4 = new Ex06_Sup();
		
	}

	
}
