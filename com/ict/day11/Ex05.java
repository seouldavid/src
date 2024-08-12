package com.ict.day11;

public class Ex05 {
	private String name;
	private int price;
	
	//getter : private 데이터를 메서드를 통해서 전달
	//setter : private 데이터를 메서드를 통해서 변경
	
	//name 전달
	public String getName() {
		return name;
	}
	//price 전달
	public int getPrice() {
		return price;
	}
	//name 변경
	public void setName(String name) {
		//지역변수와 전역변수의 이름이 같으면 지역변수가 우선 순위가 높아서 지역변수만 사용하게 된다.
		//전역변수를 사용하려면 변수 앞에 this를 붙인다. (this.변수이름)
		this.name = name;
	}
	//price 변경
	public void setPrice(int price) {
		this.price = price;
	}
}
