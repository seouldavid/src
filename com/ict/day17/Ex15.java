package com.ict.day17;

public class Ex15 implements Runnable {
	   int x = 0;

	@Override
	public synchronized void run() {
		for (int i = 1; i < 101; i++) {
//			notify();
			System.out.println(Thread.currentThread().getName() + " : " + ++this.x);
			if (x % 50 ==0) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else if(x % 50 ==1) {
				notifyAll();
				System.out.println(Thread.currentThread().getName()+"가동 중");
			}
		}
		this.notifyAll();
		System.out.println("노티파이");
	}	
}	
