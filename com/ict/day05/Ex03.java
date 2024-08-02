package com.ict.day05;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 숫자를 입력받아서 홀,짝 판별하자 (계속할까요?(1.yes,2.no))
		while (true) {
			System.out.println("숫자 입력: ");
			int su = scan.nextInt();
			String str = "";

			if (su % 2 == 0) {
				str = "짝수";
			} else {
				str = "홀수";
			}
			System.out.println(su + "는 "+ str + "입니다.");
			System.out.println("계속할까요?(1.yes,2.no) : ");
			int num= scan.nextInt();
			if (num==2) {
				break;
			} 
		}
	}
}
