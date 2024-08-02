package com.ict.day02;

public class Ex07 {

	public static void main(String[] args) {
		// 9630초는 몇시 몇분 몇초 일까요?
		int seconds = 9630;
		int h = 9360 / 3600;
		int m = (seconds % 3600) / 60;
		int s = ((seconds % 3600) % 60);
		System.out.println(seconds + "초는 : " + h + "시" + m + "분" + s + "초 입니다");
	}

}
