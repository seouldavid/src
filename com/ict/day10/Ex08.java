package com.ict.day10;

public class Ex08 {
	public static void main(String[] args) {
		Ex07 minsu = new Ex07();
		Ex07 heejin = new Ex07();
		Ex07 sumi = new Ex07();
		Ex07 yoon = new Ex07();
		
		System.out.println("minsu-id : " + minsu.id);
		System.out.println("heejin-id : " + heejin.id);
		System.out.println("sumi-id : " + sumi.id);
		System.out.println("yoon -id : " + yoon.id);
		System.out.println("----------------------");
		
		minsu.setId();
		System.out.println("minsu-nextId : " + Ex07.nextId);
		System.out.println("heejin-nextId : " + minsu.nextId);
		System.out.println("sumi-nextId : " + Ex07.nextId);
		System.out.println("yoon-nextId : " + Ex07.nextId);
	    
		minsu.setId();
		System.out.println("minsu-nextId : " + Ex07.nextId);
		System.out.println("heejin-nextId : " + minsu.nextId);
		System.out.println("sumi-nextId : " + Ex07.nextId);
		System.out.println("yoon-nextId : " + Ex07.nextId);
		
		minsu.setId();
		System.out.println("minsu-nextId : "+ Ex07.nextId);
		System.out.println("heejin-nextId : "+ minsu.nextId);
		System.out.println("sumi-nextId : "+ Ex07.nextId);
		System.out.println("yoon-nextId : "+ Ex07.nextId);
		
	}
}
