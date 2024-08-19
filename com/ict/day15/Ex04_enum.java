package com.ict.day15;

enum Type {
	MARKING, RUNNING, TRACKING, HIKING;
}

public class Ex04_enum {
	String name;
	int size;
	Type type;

	public static void main(String[] args) {
		// main()도 static이므로 static 변수, 상수만 사용가능
//		System.out.println(name);
		// main() 에서 인스턴스 변수를 사용하기 위해서는 무조건 객체 생성해야 한다.
		Ex04_enum shoes = new Ex04_enum();
		System.out.println(shoes.name);
		System.out.println(shoes.size);
		System.out.println();
		
		shoes.name = "나이키";
		shoes.size = 275;
		shoes.type =Type.RUNNING;
		
		System.out.println(shoes.name);
		System.out.println(shoes.size);
		System.out.println(shoes.type);
	name(Type.HIKING);
		
	}
	public static void name(Type t) {
		System.out.println(t);
	} 

}
