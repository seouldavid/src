package com.ict.day15;

public class Ex08_Main {
	public static void main(String[] args) {
		//별도로 객체 생성할 수없다.
//		Inner02 t1 = new Inner02();
		
		//멤버 내부 클래스 처럼 생성 할 수 없다.
//		Ex08_Local t1 = new Ex08_Local();
//		Inner02 t2 = t1.new Inner02();
		
		//메서드 안에 존재하기 때문에 메서드를 실행해야 된다.
		Ex08_Local t1 = new Ex08_Local();
		//t1.play();
		
	}
}
