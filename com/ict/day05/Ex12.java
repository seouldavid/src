package com.ict.day05;

public class Ex12 {

	public static void main(String[] args) {
		// 배열의 선언과 생성을 한번에 하자.
		// 자료형[] 이름 = new 자료형[배열크기]
		char[] ch = new char[4];
		
		//데이터 저장
		ch[0] = 'a';
		ch[1] = 65;
		ch[2] = 'y';
		ch[3] = 97;
		
		//데이터 저장
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
	}

}
