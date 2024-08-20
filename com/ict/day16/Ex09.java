package com.ict.day16;

import java.util.HashSet;

public class Ex09 {

	public static void main(String[] args) {
		int bonus = 0;
		for (int i = 0; i < 5; i++) {
			HashSet<Integer> lottoSet = new HashSet<Integer>();

			while (lottoSet.size() < 7) {
				int number = (int) (Math.random() * 45) + 1;
				lottoSet.add(number);
				if (lottoSet.size() == 1) {
					bonus = number ;
				}
			}
			lottoSet.remove(bonus);


			System.out.println("Lotto Set " + (i + 1) + ": " + lottoSet + " + Bonus: " + bonus);
			lottoSet.clear();
		}

	}

}