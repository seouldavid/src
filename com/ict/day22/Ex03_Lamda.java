package com.ict.day22;

//함수형 인터페이스를 만들자
//@FunctionalInterface 사용하면 반드시 추상메서드 하나만
@FunctionalInterface
interface MyFunction{
	public int max(int a,int b);
//	public int min(int a,int b);
}

public class Ex03_Lamda {
	public static void main(String[] args) {
		//익명객체
		MyFunction f = new MyFunction() {
			@Override
			public int max(int a, int b) {
				
				return a>b ? a:b;
			}
		};
		int result = f.max(3, 5);
		System.out.println(result);
		System.out.println("==========================================");
		MyFunction f2 = (a,b) -> a>b ? a:b;
		result = f2.max(3, 5);
		System.out.println(result);
		
	}
}
