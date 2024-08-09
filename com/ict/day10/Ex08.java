package com.ict.day10;

public class Ex08 {
	public static void main(String[] args) {
		Ex07 minsu = new Ex07();
		Ex07 heejin = new Ex07();
		Ex07 sumi = new Ex07();
		Ex07 yoon = new Ex07();
		
		System.out.println("minsu-id : " + minsu.id);
		System.out.println("minsu-id : " + heejin.id);
		System.out.println("minsu-id : " + sumi.id);
		System.out.println("minsu-id : " + yoon.id);
		System.out.println("----------------------");
		
		System.out.println("minsu-nextId : "+ Ex07.nextId);
		System.out.println("minsu-nextId : "+ minsu.nextId);
		System.out.println("minsu-nextId : "+ Ex07.nextId);
		System.out.println("minsu-nextId : "+ Ex07.nextId);
		System.out.println("minsu-nextId : "+ Ex07.nextId);
	}
}
