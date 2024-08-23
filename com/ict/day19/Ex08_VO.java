package com.ict.day19;

import java.io.BufferedWriter;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.OutputStreamWriter;
import java.io.Serializable;

// 2. Externalizable
public class Ex08_VO implements Externalizable{
	private String name;
	private int age;
	private double weight;
	private boolean gender;

	public Ex08_VO() {
	}
	
	public Ex08_VO(String name, int age, double weight, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// 직렬화 대상 멤버 넣기
		// 만약에 넣지 않으면 직렬화 대상에서 제외
		//writeExternal, readExternal 배치 순서도 같게
		out.writeObject(name);
		out.writeObject(age);
		out.writeObject(weight);
		out.writeObject(gender);
	}
	
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// 역 직렬화 대상 멤버 넣기
		name = (String) in.readObject();
		age =  (int) in.readObject();
		weight =  (double) in.readObject();
		gender =  (boolean) in.readObject();
		
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
