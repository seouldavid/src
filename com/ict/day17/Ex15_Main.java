package com.ict.day17;


public class Ex15_Main {
	public static void main(String[] args) {
		Ex15 run = new Ex15();
		Thread t1 =new Thread(run,"a");
		Thread t2 =new Thread(run,"b");
		t1.start();
		t2.start();
	}
}
