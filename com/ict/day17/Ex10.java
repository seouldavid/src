package com.ict.day17;

public class Ex10 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i < 51; i++) {
			System.out.println("run " + Thread.currentThread().getName());
		}
	}
}
