package com.ict.day02;

public class Ex08 {

	public static void main(String[] args) {
		// 카페모카 3500이다.
		//친구와 둘이서 10000원 내고 주문했다.
		//잔돈은 얼마인가? (단, 부가세 10% 포함한다.)
		int mocaPrice = 3500;
		int total = 10000;
		int spare = (int) (total - mocaPrice * 2 * 1.10);
		System.out.println("잔돈은: " + spare + " 입니다.");
		
	}

}
