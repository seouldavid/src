package com.ict.day05;

public class Ex05 {
	public static void main(String[] args) {
		// do-while문: while과 같은 반복문 (선 처리 후비교)
		// 최소 한번은 실행 한다.
		// 형식) 초기식;
//		 do{
//		 실행할 문장;
//		 실행할 문장;
//		 실행할 문장;
//		 증감식;
//		 }while(조건식);

		
		
		// 1-10까지 출력
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= 10);

		
		
		// 5단
		i = 1;
		System.out.println("\n5단");
		do {
			System.out.println("5*" + i + "=" + (5 * i));
			i++;
		} while (i < 10);
		
		
		
		// 1-10 홀수의 합, 짝수의 합 구하기
		int odd = 0;
		int even = 0;
		i = 1;
		do {
			if (i % 2 == 1) {
				odd = odd + i;
			} else {
				even = even + i;
			}
			i++;
		} while (i <= 10);
		System.out.println("\n홀수 합: " + odd);
		System.out.println("짝수 합: " + even);
		
		// 숙제 : 위 3개를 do-while(true) 코딩하기 
		
	}
}
