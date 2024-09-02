package com.ict.day24;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Ex05_Stream {
	public static void main(String[] args) {
		Ex05_VO p1 = new Ex05_VO("둘리", 40, 100);
		Ex05_VO p2 = new Ex05_VO("마이콜", 20, 100);
		Ex05_VO p3 = new Ex05_VO("희동이", 13, 50);

		List<Ex05_VO> list = new ArrayList<Ex05_VO>();
		list.add(p1);
		list.add(p2);
		list.add(p3); 

		// 컬렉션으로 처리

		System.out.println("=== 고객명단 순서대로 출력 ===");
		int sum = 0;
		for (Ex05_VO k : list) {
			System.out.println(k.toString());
			sum += k.getPrice();
		}
		System.out.println("총 비용은 " + sum + " 입니다.");
		System.out.println("=== 나이가 20이상인 고객의 명단 출력(입력순) ===");
		ArrayList<Ex05_VO> arrLst = new ArrayList<Ex05_VO>();
		for (Ex05_VO k : list) {
			if (k.getAge() >= 20) {
				System.out.println(k.toString());
				arrLst.add(k);
			}
		}
		System.out.println("=====================================");

		
		
		
		// 스트림으로 처리
		System.out.println("=== 고객명단 순서대로 출력 ===");
		list.stream().forEach(i -> System.out.println(i));
		int sum2 = list.stream()
					   .map(i -> i.getPrice())
					   .reduce((i, j) -> i + j)
					   .get();
		System.out.println("총 비용은 " + sum2 + " 입니다.");
		System.out.println("=== 나이가 20이상인 고객의 명단 출력(입력순) ===");
		list.stream().filter(i -> i.getAge() >= 20)
			   .forEach(i -> System.out.println(i));
		System.out.println("=== 나이가 20이상인 고객의 명단 출력(나이순) ===");
		list.stream().filter(i -> i.getAge() >= 20)
			   .sorted(Comparator.comparing(Ex05_VO::getAge))
			   .forEach(i -> System.out.println(i));
		
		System.out.println("=====================================");
		Stream<Ex05_VO> stream = list.stream();
		stream
		.filter(i -> i.getAge() >= 20)
		.map(i -> i.getName())
		.sorted()
		.forEach(i -> System.out.println(i));
	}
}
