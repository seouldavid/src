package com.ict.day12;

public class Ex06 {

	public static void main(String[] args) {
		// Ex01에는 생성자가 없을때에는 기본생성자로 객체 생성
		// 이때는 홍길동, 24, 충청도

		Ex01 test = new Ex01();
		System.out.println("--Ex01--");
		System.out.print(test.getName());
		System.out.print(test.getAge());
		System.out.print(test.getAddr());
		System.out.println();

		// Ex02 기본생성자를 명시적으로 정의하였다.
		// 이때는 기본생성자가 메서드처럼 실행된다.
		Ex02 test2 = new Ex02();
		System.out.println("--Ex02--");
		System.out.print(test2.getName());
		System.out.print(test2.getAge());
		System.out.print(test2.getAddr());
		System.out.println();

		// Ex03에 생성자가 있는데 기본생성자는 없으므로
		// 기본 생성자로는 객체 생성할 수 없다.
		// 즉,인자가 있는 생성자로 실행해야 된다.
		// Ex03 test3 = new Ex03();
		Ex03 test3 = new Ex03("David");
		System.out.println("--Ex03--");
		System.out.print(test3.getName());
		System.out.print(test3.getAge());
		System.out.print(test3.getAddr());
		System.out.println();
		
		Ex04 test4 = new Ex04("마이콜", 27, "제주도");		
		System.out.println("--Ex04--");
		System.out.print(test4.getName());
		System.out.print(test4.getAge());
		System.out.print(test4.getAddr());
		System.out.println();
		
		Ex05 test5 = new Ex05(1004,"서울");		
		System.out.println("--Ex05-1--");
		System.out.print(test5.getAge());
		System.out.print(test5.getAddr());
		System.out.println();

		Ex05 test6 = new Ex05("함경도","임꺽정");		
		System.out.println("--Ex05-2--");
		System.out.print(test6.getAddr());
		System.out.print(test6.getName());
		System.out.println();

	}

}
