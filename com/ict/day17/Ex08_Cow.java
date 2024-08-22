package com.ict.day17;

public class Ex08_Cow implements Runnable {
//	public void start() {
//		for (int i = 0; i < 100; i++) {
//			System.out.println("음메~ : " + Thread.currentThread().getName());
//		}
//	}


	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("음메~ : " + Thread.currentThread().getName());

		}
	}
}
