package com.ict.day16;

public class Ex06_Main {

	public static void main(String[] args) {
		// 배열 6자리 채우기 (중복 안됨)
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			int su = (int) (Math.random() * 9) + 1;
			System.out.println(su);
			arr[i] = su;
			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
	}

}
