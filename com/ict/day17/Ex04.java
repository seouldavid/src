package com.ict.day17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// 대한민국, 캐나다, 영국, 스위스 의 수도가 각각 HashMap에 저장시키고
		// 원하는 나라를 입력하면 해당 나라의 수도를 출력되게 하시오
		Map<String, String> country = new HashMap<String, String>();
		country.put("한국", "서울");
		country.put("캐나다", "어타와");
		country.put("영국", "런던");
		country.put("스위스", "베른");
		Scanner scan = new Scanner(System.in);
		esc: while (true) {

			System.out.print("나라입력 >>");
			String countryInput = scan.next();
			if (country.containsKey(countryInput)) {
				System.out.println(countryInput + "의 수도는 " + country.get(countryInput) + "입니다.");
			} else {
				System.out.println("다시 입력하세요");
				continue;
			}
			while (true) {
				System.out.print("계속할까요(y/n) >>");
				String retryInput = scan.next();
				if (retryInput.equalsIgnoreCase("y")) {
					continue esc;
				} else if (retryInput.equalsIgnoreCase("n")) {
					break esc;
				} else {
					System.out.println("다시 입력해 주세요.");
					continue;
				}
				
			}
		}
	}
}
