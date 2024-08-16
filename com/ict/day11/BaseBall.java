package com.ict.day11;

import java.util.Scanner;

public class BaseBall {
	
	//중복체크 메서드입니다
	public static boolean checkOverlap(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				return true;
			}
		}
		return false;
	}
	

	public static void main(String[] args) {
		//변수 및 배열 초기화
		Scanner scan = new Scanner(System.in);
		int strikeNum = 0;
		int ballNum = 0;
		int outNum = 0;
		int[] genNums = new int[3];
		int tmp;
		boolean chk;

		int cnt = 0;
		
		
		//배열에 난수를 생성할때까지 반복합니다 
		for (int i = 0; i < genNums.length; i++) {
			do {
				tmp = (int) (Math.random() * 9) + 1;
			} while (checkOverlap(genNums, tmp));
			genNums[i] = tmp;

		}

		while (true) {
			int[] guessNums = new int[3];
			for (int i = 0; i < guessNums.length; i++) {
				 do {
					
					System.out.print((i + 1) + "번째 숫자 입력:");
					tmp = scan.nextInt();
					chk = checkOverlap(guessNums, tmp);
					
					if (tmp > 9 || tmp < 0) {
						
						System.out.println("1-9 사이 숫자를 입력하여 주십시오.");
						chk = true;
					} 
					
					if (chk) {
						System.out.println("입력된 숫자가 중복되었습니다.");
					}
					
				} while (chk);
				 
				 
				guessNums[i] = tmp;
			}

			for (int i = 0; i < guessNums.length; i++) {
				for (int j = 0; j < guessNums.length; j++) {
					if (genNums[i] == guessNums[j]) {
						if (i == j) {
							strikeNum++;
						} else if (i != j) {
							ballNum++;
						}
					}

				}
			}

			int accuracy = strikeNum + ballNum;
			outNum = 3 - accuracy;

			cnt++;
			System.out.println(cnt + "회차: " + strikeNum + "S" + ballNum + "B" + outNum + "O" + "입력한 수: " + guessNums[0]
					+ guessNums[1] + guessNums[2]); // + " 컴퓨터 수:(디버깅용)" + genNums[0] + genNums[1] + genNums[2]);
			if (strikeNum == 3) {
				System.out.println("3 스트라이크! 게임을 종료합니다.");
				break;
			}
			strikeNum = 0;
			ballNum = 0;

		}

	}

}
