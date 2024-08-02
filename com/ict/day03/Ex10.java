package com.ict.day03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// int k1이 "A 학점",80이상이면 "B학점",70 이상이면 "C학점",나머지 "F학점"
		int k1 = 1;
		String str = (k1 >= 90) ? "A학점" : (k1 >= 80) ? "B학점" : (k1 >= 70) ? "C학점" : "F학점";
		System.out.println(str);

		// char k2가 대문자인지, 소문자인지, 숫자, 기타문자 인지 판별하자.
		char k2 = 'ㅁ';

		str = (k2 >= 'A' && k2 <= 'Z') ? "대문자"
			: (k2 >= 'a' && k2 <= 'z') ? "소문자"
			: (k2 >= '0' && k2 <= '9') ? "숫자" : "기타문자";
		System.out.println(str);

	}

}
