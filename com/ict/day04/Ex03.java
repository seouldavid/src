package com.ict.day04;

public class Ex03 {
	public static void main(String[] args) {
//		 다중if문
//		 형식 ) if(조건식1){
//		 조건식1이 참일때 실행;
//		 조건식1이 참일때 실행;
//		 }else if(조건식2){
//		 조건식1에는 거짓, 조건식2에는 참일때 실행 ;
//		 조건식1에는 거짓, 조건식2에는 참일때 실행 ;
//		 }else if(조건식2){
//		 조건식1,2에는 거짓, 조건식3에는 참일때 실행 ;
//		 조건식1,2에는 거짓, 조건식3에는 참일때 실행 ;
//		 }else{
//		 조건식1,2,3이 모두 거짓인 경우 실행;
//		 }
		//

		// int k1의 점수가 90이상 A학점, 80이상이면 B학점 ,70이상이면 C학점, 나머지 F학점
		int k2 = 87;
		String res = "";
		if (k2 >= 90) {
			res = "A학점";
		} else if (k2 >= 80) {
			res = "B학점";
		} else if (k2 >= 70) {
			res = "C학점";
		} else {
			res = "F학점";
		}
		System.out.println("결과는 : " + res);
		// char k3가 A이거나 a이면 아프리카 B이거나 b이면 브라질 C이거나 c이면 캐나다 나머지 한국
		char k3 = 'k';
		String res3 = " ";
		if (k3 == 'A' || k3 == 'a') {
			res3 = "아프리카";
		} else if (k3 == 'B' || k3 == 'b') {
			res3 = "브라질";
		} else if (k3 == 'C' || k3 == 'c') {
			res3 = "캐나다";
		} else {
			res3 = "한국";
		}
		System.out.println("결과는 : " + res3);

		// menu가 1이면 카페모카 3500, 2이면 카페라떼 4000 3이면 아메리카노 3000 4이면 과일주스 3500이다.
		// 친구와 2잔을 10000내고 먹었다. 잔돈은 얼마인가? (단,부가세 10% 포함, 친구와 같은 음료만 선택가능)
		
		int menu = 2;
		int price = 0;
		int total = 10000;

		if (menu == 1) {
			price = (int) (3500 * 1.1 * 2);
		} else if (menu == 2) {
			price = (int) (4000 * 1.1 * 2);
		} else if (menu == 3) {
			price = (int) (3000 * 1.1 * 2);
		} else {
			price = (int) (3500 * 1.1 * 2);
		}
		total = total - price;
		System.out.println("결과는 : " + total);

		// 나이가 8살미만이면 1000원, 초등학생(14미만)이면 2000원, 중,고등학생(20살미만)은 2500
		// 그 이상은 3000원 인 입장료이다.
		// 출력 : 당신의 입장료는 XXXX입니다.
		
		int age = 22;
		int charge = 0;
		if (age < 8) {
			charge = 1000;
		} else if (age < 14) {
			charge = 2000;
		} else if (age < 20) {
			charge = 2500;
		} else {
			charge = 3000;
		}
		System.out.println("당신의 입장료는 : " + charge + "입니다.");
	}

}
