package com.ict.day12;

public class Ex15 {

	public static void main(String[] args) {
		// Ex14 객체 생성할때 3살, 큰뿔소, 살아있는 객체 생성
		Ex14 test = new Ex14(true, 3, "큰뿔소");

		System.out.println("이름 : " + test.getName());
		System.out.println("나이 : " + test.getAge());
		if (test.isLive()) {
			System.out.println("생사여부 : 살아있음");
		} else {
			System.out.println("생사여부 : 죽었음");
		}
		// 큰뿔소 이름을 펭귄으로 변경하기
		test.setName("펭귄");
		System.out.println("이름 : " + test.getName());
		System.out.println("나이 : " + test.getAge());
		if (test.isLive()) {
			System.out.println("생사여부 : 살아있음");
		} else {
			System.out.println("생사여부 : 죽었음");
		}
	}

}
