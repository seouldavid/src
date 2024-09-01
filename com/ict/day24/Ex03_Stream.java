package com.ict.day24;

import java.util.Optional;
import java.util.stream.Stream;

public class Ex03_Stream {
	public static void main(String[] args) {
		// 최종연산 : 실행하면 스트림이 닫히기 때문에 재사용 불가
		//findAny() : 아무거나 하나 반환 (입력 순서와 상관없다.)
		//findFirst() : 첫번째 요소 반환 (순서가 중요)
		
		//Optional : null 로 인해 발생할 수 있는 오류 방지,
		//			 값이 없을 때는 Optional.empty 를 반환
		Optional<String> op = Optional.of("Hello");
		System.out.println(op.get()); //hello
		
		op = Optional.empty();
		System.out.println(op);
		// isPresent() => 데이터가 있을 때 : true
		if (op.isPresent()) {
			System.out.println(op);
		}
		
		System.out.println("================");
		Stream<String> stream = Stream.of("Java","jsp","jquery","spring");
		Optional<String> res = stream.findAny();
		//데이터가 있을 때만 실행하자
		res.ifPresent(i-> System.out.println(i));
 
		stream = Stream.of("Java","jsp","jquery","spring",null);
		Optional<String> res2 = stream.findAny();
		res2.ifPresent(i-> System.out.println(i));
		
//		allMatch(조건식) : 모두 만족하면 true
//		   anyMatch(조건식) : 하나라도 만족하면 true
//		   nonMatch(조건식) : 모두 만족하지 않으면 true
		stream = Stream.of("java","Jsp","Jquery","Spring");
		
		// 모든 문자 대문자로 시작하는지 확인 : allMatch(조건식)
		boolean res3 = stream.allMatch(i-> Character.isUpperCase(i.charAt(0)));
		System.out.println("res3 : " + res3);
		
		//하나라도 첫글자가 대문자가 있는지 확인 : anyMatch(조건식)
		Stream<String> stream1 = Stream.of("java","Jsp","Jquery","Spring");
		boolean res4 = stream1.anyMatch(i-> Character.isUpperCase(i.charAt(0)));
		System.out.println("res4 : " + res4);
		System.out.println();
		
		
		Stream<String> stream2 = Stream.of("java","Jsp","Jquery","Spring");
		// "Python"이 아닌지 확인 : noneMatch(조건식) : 모두 만족하지 않으면 true
		boolean res6 = stream2.noneMatch(i-> i.equalsIgnoreCase("Python"));
		System.out.println("res6 : " + res6);
		System.out.println();
		
		
	}
}
