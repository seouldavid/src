package com.ict.day11;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		exit: while(true) {
			int numberGen = (int) (Math.random() * 13) + 1;
			System.out.println(numberGen);
			System.out.print("높음, 비김, 낮음 선택 하시오:");
			String guess = scan.next();
			if (guess.equals("높음")) {
				if (numberGen > 7) {
					System.out.println("정답");
				} else {
					System.out.println("땡");
				}
			} else if (guess.equals("비김")) {
				if (numberGen == 7) {
					System.out.println("정답");
				} else {
					System.out.println("땡");
				}
			} else if (guess.equals("낮음")) {
				if (numberGen < 7) {
					System.out.println("정답");
				} else {
					System.out.println("땡");
				}
			}
			while(true) {
				System.out.print("retry? yes or no");
				String choice = scan.next();
				if(choice.equalsIgnoreCase("yes")) {
					System.out.println("수고하셨습니다");
					continue exit;
				} else if(choice.equalsIgnoreCase("no")) {
					break exit;
				} else {
					System.out.println("input error");
					continue;
				}
				 
			}
			

			
		}
		
		
	}
}
