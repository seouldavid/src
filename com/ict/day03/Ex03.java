package com.ict.day03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// import : 해당 클래스를 사용하기 위해서 패키지 위치를 표시
		//			모든 클래스를 import 하는 것은 아님
		// java.lang에 있는 클래스는 import를 하지않음

		// import 하는 방법 : 1) 클래스 읾에서 ctrl+ 스페이스 바
		// 2) 컨트롤 + 쉬프트 + o
		// 키보드에 입력된 정보를 받아서 저장하자
		Scanner scan = new Scanner(System.in);

		// 입력버퍼에 있는 입력 정보를 string으로 만든다.
		System.out.print("이름: ");
		String name = scan.next();
		System.out.println("입력한 이름: " + name);

		System.out.print("나이: ");
		// 입력 버퍼에 있는 입력 정보를 int로 만든다.
		int age = scan.nextInt();
		System.out.println("입력한 나이: " + age);
		
		System.out.print("키: ");
		//입력버퍼에 있는 입력 정보를 double로 만든다.(nextDouble())
		double height = scan.nextDouble();
		System.out.println("입력한 키: " + height);
		
		
		System.out.println("수고하셨습니다.");

	}

}
