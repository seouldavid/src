package com.ict.day04;

public class Ex07 {

	public static void main(String[] args) {
		// 중첩 for문안에 또다른 for문
		//

		for (int i = 1; i < 10; i++) {
			System.out.println("구구단-" + i);
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
		String paper = "";
		paper = paper + ("구구단-2" + "\n");
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				paper = paper + (i + "*" + j + "=" + (i * j) + "\t");
			}

			paper = paper + "\n";
		}
		System.out.print(paper);

		paper = "";
		paper = paper + ("구구단-3" + "\n");
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				paper = paper + (j + "*" + i + "=" + (i * j) + "\t");
			}
			paper = paper + "\n";
		}
		System.out.println(paper);

		paper = "";
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				paper = paper + "0 ";
			}
			paper = paper + "\n";
		}
		System.out.println(paper);

		paper = "";
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (j == i) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}


	}

}
