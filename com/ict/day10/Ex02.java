package com.ict.day10;

public class Ex02 {

	public static void main(String[] args) {
		Ex01 t = new Ex01();
		//정보 가져오기
		String name = t.name;
		int sum = t.sum;
		System.out.println("이름 :" + name);
		System.out.println("합 :" + sum);
		
		//정보 변경하기
		t.name = "둘리";
		t.sum = 300;
		//가져오기
		name = t.name;
		sum = t.sum;
		
		System.out.println("이름 :" + name);
		System.out.println("합 :" + sum);
		
		//메서드를 이용해서 sum 내용 변경하기
		t.play01();
		
		// 메서드를 이용해서
		int sum2 = t.play02();
		System.out.println("합: " + sum2);
		
	}

}
