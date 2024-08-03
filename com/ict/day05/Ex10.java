package com.ict.day05;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// 홀 짝 물어보고 짝수 횟수 구하고 전체횟수에서 퍼센트 구하기
		Scanner scan = new Scanner(System.in);
		int totalCount = 0;
		int EvenCount = 0;
		double per = 0.0;
		exit: while (true) {
			System.out.print("숫자 입력: ");
			int su = scan.nextInt();
			String str = "";

			if (su % 2 == 0) {
				str = "짝수";
				totalCount++;
				EvenCount++;
			} else {
				str = "홀수";
				totalCount++;
			}
			System.out.println(su + "는 " + str + "입니다.");

			while (true) {
				System.out.print("계속할까요?(1.yes,2.no) : ");
				int num = scan.nextInt();
				if (num == 1) {
					continue exit;
				} else if (num == 2) {
					System.out.println("전체횟수: " + totalCount);
					System.out.println("짝수횟수: " + EvenCount);
					per =  (double) (  EvenCount / totalCount) * 100 ;
					System.out.println("짝수 나온 퍼센트: " +(int) (per * 1000)/1000.0 + "%");
					System.out.println("수고하셨습니다.");
					break exit;
				} else {
					System.out.println("숫자는 1과 2만 선택하세요.");
					continue;
				} 
			}

		}

	}

}
