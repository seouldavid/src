package com.ict.day17;

//두개의 스레드를 생성하여 척번째 스래드의 출력을 1-100까지 출력하고,
// 두번째 스레드의 출력은 101-200까지(synchronized 사용)
public class Ex14 implements Runnable {
	int x = 0;

//	@Override
//	public synchronized void run() {
//		for (int i = 0; i < 100; i++) {
//			System.out.println(Thread.currentThread().getName() + " : " + ++x);
//		}
//	}
	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 100; i++) {
				System.out.println(Thread.currentThread().getName() + " : " + ++x);
			}
		}
	}
}
