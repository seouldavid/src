package com.ict.day11;

public class Ex01 {
	//인자를 기본자료형으로 전달받음
	//값 호출
	//원본 값이 변경되지 않음
	public int play01(int k) {
		System.out.println("넘어온 값 : " + k);
		++k;
		return k;
	}
	// 인자를 배열, 객체로 전달 받음
	// 참조 호출( call by Reference)
	// 원본 값이 변경됨
	public void play02(int[] k) {
		System.out.println("넘어온 값 : " + k);
		for (int i = 0; i < k.length; i++) {
			k[i] = k[i] + 1;
		}
	}

}
