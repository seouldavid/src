package com.ict.day16;

public class Ex01 {
/*
 제네릭과 컬렉션을 (자료구조)
 제네릭 : 컬렉션이 어떤 객체들로 이루어졌는지 표시하기위한 객체 타입
 컬렉션 : 객체들을 모아서 저장,관리하는 인터페이스들을 말한다.
 
 변수 - > 하나의 데이터만 저장할 수 있다.
 배열 -> 같은 종류에 자료형을 여러개 묶어서 저장할 수있다.
 		단점: 크기를 미리 지정해야함
 클래스 -> 다양한 종류의 자료형을 저장할 수있다.
 
 ** 객체(클래스)를 모아서 처리하는 방법: 컬랙션, 객체형 배열
    
    형식) 컬랙션<제네릭>
    API : <T> => 객체 타입, <E> =>요소(Element), 컬랙션 안에서 존재하는 객체 하나 하나를 뜻한다.
    	  <K,V> => Key(키), Value(데이터), Key를 호출하면 value가 나온다.
    	  
   	최상위 클래스 : Collection<E>, Map<K,V>
   	Collection 을 상속받은 인터페이스 : Set<E>, List<E>, Queue<E>
   	
   	add(E e) : boolean => 해당 컬랙션에 인자로 받은 요소를 추가, 성공하면 true, tlfvogkaus ㄹ민ㄷ
   	addAll(Collection <? extends E> c) : boolean
   	 		=> 특정 컬랙션에 있는 모든 요소들을 다른 컬랙션에 추가
   	clear() : void => 모든 요소 제거(삭제)
   	contains(Object o) : boolean => 인자로 들어온 객체가 해당당 컬랙션에 포함되어 있으면 true, 없으면 false
   	isEmpty():boolean => 컬랙션 안이 비어있으면 true
   	remove(Object o) : boolean => 인자로 들어온 객체가 삭제되면 true
   	size() : int => 컬렉션안에 존재하는 요소(element)의 수
   	toArray() : Object[] => 컬랙션을 배열로 만들어준다.
   				Arrays.asList() => 배열을 ArrayList 컬랙션으로 만들어준다.
   	iterator() : Iterator<E> => 컬랙션안에 존재하는 요소들을 순서대로 접근하기 위해서
   								iterator 객체를 반환한다.
   								컬랙션안에 존재하는 요소를 하나씩 꺼내서 작업할때 사용 (for문 사용가능)
 */
}
