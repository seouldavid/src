package com.ict.day22;

interface A {
	void m(); // 파라미터X, 리턴값X
}

interface B {
	void m(String str); // 파라미터O, 리턴값X
}

interface C {
	String m(); // 파라미터X, 리턴값O
}

interface D {
	int m(int x, int y); // 파라미터O, 리턴값O
}

public class Ex04_Lamda {

	public static void main(String[] args) {
		//추상 메서드를 완성 시키자
		A a = () -> System.out.println("하이");
		B b = str -> System.out.println(str);
		C c = () -> "하이";
		D d = (x,y) -> x+y;
		
		//실행 방법
		a.m();
		b.m("호이");
		System.out.println(c.m());
		System.out.println(d.m(1, 2));
	}

}
