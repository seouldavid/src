package com.ict.day15;

public class Ex09_Static {
	String name = "홍길동";
	int age = 24;
	private String addr = "제주도";
	static String phone = "010-7979-7979";

	public Ex09_Static() {
		System.out.println("외부 : " + this);
	}

	public void sound() {
		System.out.println("외부클래스의 메서드");
	}

	public static void prn() {
		System.out.println("외부클래스의 static 메서드");
	}
	
	// 내부클래스의 멤버가 static이면 클래스도 static으로 만들어야 한다.
	public static class Inner03 {
		static int room = 3;

		public static void play() {
//			System.out.println(name);
//			System.out.println(age);
//			System.out.println(addr);
//			sound();
			System.out.println(room);
			System.out.println(phone);
			prn();
		}
		public static void play2() {
			System.out.println(room);
			System.out.println(phone);
			prn();
		}
	}

}
