package com.ict.day15;

//상수와 추상 메서드
interface Ex10 {
	int DATA = 1000;

	public void printData();

}

class Ex10_Test implements Ex10 {

	@Override
	public void printData() {
		// TODO Auto-generated method stub
		int data1 = DATA + 100;
		System.out.println("data1 : " + data1);
	}
}

class Ex10_Test2 {
	public void play() {
		new Ex10() {

			@Override
			public void printData() {
				int data2 = DATA + 100;
				System.out.println("data2 : " + data2);
			}

		}.printData(); // 내부 클래스 끝
	}// 메서드 끝
}

class Ex10_Test3 {
	public void prn(Ex10 ex) {
		ex.printData();
	}
}