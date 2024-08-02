package com.ict.day03;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. 숫자를 받아서 해당 숫자가 홀수인지 짝수인지 판별하자.
		System.out.print("숫자입력: ");
		int k1 = scan.nextInt();
		String str = (k1 % 2 == 0) ? "짝수" : "홀수";
		System.out.println("결과: " + str);

		// 2. 점수를 받아서 해당점수가 80 이상이면 합격 아니면 불합격
		System.out.print("시험점수 입력: ");
		int k2 = scan.nextInt();
		str = k2 >= 80 ? "합격" : "불합격";
		System.out.println("결과: " + str);

		// 3. 근무시간 받아서 8시간 이상이면 8시간 까지는 9860이고
		// 8시간 초과한 시간은 1.5배
		System.out.print("근무시간 입력: ");
		int hour = scan.nextInt();
		int income = 9860;
		int total = (hour > 8) ? income * 8 + (int) ((hour - 8) * income * 1.5) : income * 8;
		System.out.println("결과: " + total);

//		//.
//		System.out.print("문자 입력: ");
//		char k4 = scan.next().charAt(0);
//		str = (k4 >= 'A' && k4 <= 'Z') ? "대  문자" : "대문자 아님";
//		System.out.println("결과: " + str);
		// 4. 두 수를 입력받아서 큰수를 출력하자.
		System.out.println("첫번째 수: ");
		int num1 = scan.nextInt();
		
		System.out.println("두번째 수: ");
		int num2 = scan.nextInt();
		
		int bigger = (num1 > num2) ? num1 : num2;
		System.out.println(num1 + "와 " + num2 + "중 " + bigger + "(이)가 더 큽니다.");

	}

}
