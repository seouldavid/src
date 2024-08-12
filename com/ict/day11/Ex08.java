package com.ict.day11;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		esc: while(true) {
			String aiTranslation ="";
			int aiChoice = (int)(Math.random()*3);
			
			System.out.print("가위, 바위, 보! :");
			String humanChoice = scan.next();
			
			if (aiChoice == 1) {
				aiTranslation = "가위";
			} else if (aiChoice == 0) {
				aiTranslation = "바위";
			} else {
				aiTranslation = "보";
			}	
			
			if (aiTranslation.equals(humanChoice) ) {
				System.out.println("무승부!");
			} else if ((aiTranslation.equals("가위") && humanChoice.equals("보")) || 
					(aiTranslation .equals("바위") && humanChoice.equals("가위"))||
					(aiTranslation.equals("보") && humanChoice.equals("바위"))  ) {
				System.out.println("ai 승!");
			} else {
				System.out.println("인간 승!");
			}
			while(true) {
				System.out.print("계속 할까요? (y/n)");
				String ans = scan.next();
				if (ans.equalsIgnoreCase("y")) {
					continue esc;
				} else if (ans.equalsIgnoreCase("n")) {
					break esc;
				} else {
					System.out.println("잘못 입력하셨습니다.");
					continue;
				} 
			}
		}
		

	}

}
