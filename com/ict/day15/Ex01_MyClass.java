package com.ict.day15;

public class Ex01_MyClass {
	Ex01_Remote rc;
	
	//생성자
	public Ex01_MyClass() {
		// TODO Auto-generated constructor stub
		rc = new Ex01_TV();
		rc.turnOn();
		rc.setVolume(5);
	}
	public Ex01_MyClass(Ex01_Remote rc) {
		// TODO Auto-generated constructor stub
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
}
