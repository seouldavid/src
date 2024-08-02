package com.ict.day05;

public class Ex07 {
	public static void main(String[] args) {
		// 다중 for 문일때 break 와 continue

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 2) {
					break;
				}
				System.out.println("i = " + i + ", j=" + j);

			}
		}

		System.out.println();

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 2) {
					break;
				}
				System.out.println("i = " + i + ", j=" + j);

			}
			System.out.println();
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 2) {
					break;
				}
				System.out.println("i = " + i + ", j=" + j);
				
			}
			System.out.println();
		}
		
		
	}
}
