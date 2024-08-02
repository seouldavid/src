package com.ict.day02;

public class Ex05 {

	public static void main(String[] args) {
		// 이름이 홍길동인 사람인 사람의 성적이
		// 국어 90, 영어 80 ,수학 80이다.
		// 총점, 평균을 구하라
		// 화면에 출력은 이름, 총점 ,(소수점 첫째자리까지만 구하자)만 하자
		
		
		// 1.데이터 정보를 받아서 저장
		String name= "홍길동";
		int kor = 90;
		int eng = 80;
		int math =80;
		
		// 2.처리 = 비즈니스 로직
		// 총점과 평균(소수점 첫째자리)
		int sum = kor + eng + math;
		double average = sum / 3.0;
		average = (int)(average * 10) / 10.0;
		
		// 3. 화면 출력
		//이름, 총점, 평균
		System.out.println("이름: " + name);
		System.out.println("총점: " + sum);
		System.out.println("평점: " + average);
		

	}

}
