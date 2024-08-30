package com.ict.day24;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex02_Stream {
	// map() : Stream 요소들을 변경한 새로운 Stream 를 반환 할때 주로 사용

	// map(함수형 인터페이스 = Function 을 인자 = 매개변수 => 람다식 사용) :
	// @FunctionalInterface
//    public interface Function<T, R> {
//        R apply(T t);
//    }
//    T는 입력 타입을 나타냅니다.
//    R은 반환 타입을 나타냅니다.
//    apply(T t) 메서드는 입력값을 받아서 지정된 로직을 수행하고 결과값을 반환하는 함수형 인터페이스
	public static void main(String[] args) {

		Stream<String> stream = Stream.of("Java", "jsp", "spring", "jquery");
		stream.map(i -> i.toUpperCase()).forEach(i -> System.out.println(i + " "));
		System.out.println();

		List<Ex02_VO> list = Arrays.asList(new Ex02_VO("park", 20), 
											new Ex02_VO("kim", 19), 
											new Ex02_VO("goh", 24),
											new Ex02_VO("lee", 21),
											new Ex02_VO("kang", 19));
		Stream<Ex02_VO> stream2 = list.stream();
		stream2.map(i-> i.getName()).forEach(i->System.out.println(i));
		

	}
}
