package com.ict.day11;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// Ex10을 객체로 만들어서 배열에 넣자
		Ex09 coffee = new Ex09();
		coffee.setName("커피");
		coffee.setPrice(1800);

		Ex09 ion = new Ex09();
		ion.setName("이온");
		ion.setPrice(2300);

		Ex09 cola = new Ex09();
		cola.setName("콜라");
		cola.setPrice(2100);

		Ex09[] arr = { coffee, ion, cola };

		Scanner scan = new Scanner(System.in);
		System.out.print("금액 투입 >> ");
		int input = scan.nextInt();

		System.out.println("선택 가능한 음료 : ");
		for (int i = 0; i < arr.length; i++) {
			if (input >= arr[i].getPrice()) {
				System.out.println((i + 1) + "." + arr[i].getName() + "(" + arr[i].getPrice() + "원");
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
			Ex09 drink = arr[choice - 1];
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
