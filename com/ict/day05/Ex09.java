package com.ict.day05;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 숫자를 입력받아서 홀,짝 판별하자 (계속할까요?(1.yes,2.no))
		exit: while (true) {
			System.out.println("숫자 입력: ");
			int su = scan.nextInt();
			String str = "";

			if (su % 2 == 0) {
				str = "짝수";
			} else {
				str = "홀수";
			}
			System.out.println(su + "는 " + str + "입니다.");
			while (true) {
				System.out.println("계속할까요?(1.yes,2.no) : ");
				int num = scan.nextInt();
				if (num == 1) {
					continue exit;
				} else if (num == 2) {
					break exit;
				} else {
					System.out.println("숫자는 1과 2만 선택하세요.");
					continue;
				}
			}

		}

	}

}
