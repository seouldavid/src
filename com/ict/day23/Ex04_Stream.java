package com.ict.day23;

import java.util.Random;
import java.util.stream.IntStream;

public class Ex04_Stream {
	public static void main(String[] args) {
		//임의의 수: 난수 스트림 만들기
		//			ints(),longs(), doubles() 메서드들이 각각 스트림의 난수 발생 메서드
		//			intStream,LongStream,DoubleStream를 생성해서 난수 제공
		IntStream intStream = new Random().ints(); //무한(제한이 없음) 스트림
//		intStream.forEach(i -> System.out.println(i));
		// 무한 스트림으로 무한반복 그래서 보통 limit (갯수)사용해서 유한 스트림으로 변경한다.
		intStream.limit(5).forEach(i-> System.out.println(i)); //5개만 출력
		System.out.println();
		
		IntStream intStream02 = new Random().ints(5);
		intStream02.forEach(i-> System.out.println(i));
		System.out.println();
		
		//범위 지정
		IntStream intStream03 = new Random().ints(5, 10); // 5~9까지 수에서 랜덤으로
		intStream03.limit(5).forEach(i-> System.out.println(i));
		System.out.println();
		
		IntStream intStream04 = new Random().ints(7,5, 10); // (갯수 시작 끝)
		intStream04.forEach(i-> System.out.println(i));
		System.out.println();
		
	}
}
