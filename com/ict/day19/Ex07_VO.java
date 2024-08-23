package com.ict.day19;

import java.io.Serializable;

//객체의 정보를 담을 수 있는 멤버 변수로 구성
//VO(Value Object) : 데이터를 저장하는 객체
//DTO(Data Transfer Object) : 데이터 전송을 위해 사용하는 객체
//									(get,set 모두 존재)
// 1. Serializable 인터페이스 구현 (추상메서드 없다)
//		모든 멤버필드가 객체 직렬화가 된다.
//		만약 특정 멤버를 제외 시키려면 멤바 앞에 transient 예약어 사용
//		transient 사용한 멤버는 String =>null, int => 0, double =>0.0, boolean =>false
public class Ex07_VO implements Serializable {
	private String name;
	private int age;
	private double weight ;
	private boolean gender ;
	
	public Ex07_VO() {
		// TODO Auto-generated constructor stub
	}
	
	public Ex07_VO(String name, int age, double weight, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
}
