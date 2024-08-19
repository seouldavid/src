package com.ict.day15;

//열거형(enum) : 상수 (static final을 하나의 객체로 인식하고 여러개 의 상수 객체들을 한 곳에 모아둔 하나의 묶음
enum Lesson{
	JAVA,JSP,SPRING, HTML;
}

public class Ex03_enum {
	static final int KOR = 90;
	
	public static void main(String[] args) {
		System.out.println(KOR);
		
		Lesson k = Lesson.JAVA;
		System.out.println(k); // 객체
		
		System.out.println(Lesson.HTML);
	}
	
}
