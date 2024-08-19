package com.ict.day15;

enum Type2 {
	WALK("워킹화", 250), RUN("러닝화", 250), TRACK("트레킹화", 250), HIKING("하이킹화", 250), GAME("게이밍화",230);

	private final String name;
	private final int size;

	private Type2(String name, int size) {
		this.name = name;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}
}

public class Ex05_enum {
	public static void main(String[] args) {
		//enum을 배열로 반환하는 매서드 : values()
		Type2[] arr = Type2.values();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName() + ":" + arr[i].getSize());
		}
	}
}
