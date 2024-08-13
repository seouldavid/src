package com.ict.day12;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Ex12 coffee = new Ex12("커피",1800);
		Ex12 ion = new Ex12("이온",2300);
		Ex12 cola = new Ex12("콜라",2100);
		Ex12[] arr = { coffee, ion, cola };
		int tmp = arr[0].getPrice() ;
		for (int i = 1; i < arr.length; i++) {		
			if (arr[i].getPrice() < tmp) {
				tmp =arr[i].getPrice();
			}
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.print("금액 투입 >> ");
		int input = scan.nextInt();
		
		//금액으로 오름차순 정렬해서 맨 잎에 있는 가격이 가장 작은 가격, 맨 뒤에 있는 가격이 큰 가격
		if (input < tmp) {
			System.out.println("금액이 부족합니다.");
		} else {
			
		System.out.println("선택 가능한 음료 : ");
		for (int i = 0; i < arr.length; i++) {
			if (input >= arr[i].getPrice()) {
				System.out.println((i + 1) + "." + arr[i].getName() + "(" + arr[i].getPrice() + "원)");
			}
		}
		System.out.println();

		while (input > 0) {
			System.out.println("음료 선택 >> ");
			int choice = scan.nextInt();

			// 입력한 숫자가 0보다는 크고 배열 갯수보다는 작아야 한다.
			// 잔돈이 음료수 값보다는 커야 한다
			if (choice < 1 || choice > arr.length || input < arr[choice - 1].getPrice()) {
				continue;
			}
			Ex12 drink = arr[choice - 1];
			input = input - drink.getPrice();

			System.out.println(drink.getName() + "을 선택하셨습니다.");
			System.out.println("남은 잔돈: " + input + "원");
			
			//남은 잔돈으로 더 구매할 수 있는 음료 표시
			boolean payChk = false;
			for (int i = 0; i < arr.length; i++) {
				if (input >= arr[i].getPrice()) {
					if (!payChk) {
						System.out.println("남은 금액으로 구매 가능한 음료: ");
					}
					System.out.println((i+1) + "." + arr[i].getName() + "(" + arr[i].getPrice() + "원)");
					payChk = true;
				}
			}
			if (!payChk) {
				break;
			}
			
			//추가 구매 여부 확인
			System.out.println("더 구매할까요(y/n)? ");
			String str = scan.next();
			
			if (str.equalsIgnoreCase("y")) {
				continue;
			} else {
				break;
			}
		}
		System.out.println("감사합니다.");
		System.out.println("잔돈 : " + input + "원");
		}

		

	}
}
