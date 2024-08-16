package com.ict.day14;

import java.util.Scanner;

public class Ex03_Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("선택하세요(1.강아지, 2.고양이) >> ");
		int su = scan.nextInt();
		if (su == 1) {
			Ex03_Dog dog = new Ex03_Dog();
			dog.sound();
			dog.play();
			dog.like();
		} else if (su == 2) {
			Ex03_Cat cat = new Ex03_Cat();
			cat.sound();
			cat.play();
			cat.like();
		}
		System.out.println();
		//부모클래스로 선언
		Ex03_Animal animal = null;
		if (su == 1) {
			animal = new Ex03_Dog();//up casting
			Ex03_Dog ani = (Ex03_Dog)(animal); //down casting
			ani.play();
		} else if (su == 2) {
			animal = new Ex03_Cat();
			Ex03_Cat ani = (Ex03_Cat)(animal);
			ani.play();
		}
		
		//오버라이드 메서드 호출
		animal.sound();
		//부모 메서드 호출
		animal.like();
		//자식 클래스가 가지고 있는 메서드는 호출 불가(단점)
//		animal.play();
}

}
