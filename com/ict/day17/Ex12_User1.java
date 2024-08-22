package com.ict.day17;

public class Ex12_User1 extends Thread{
	private Ex12_Calculator calculator;

	public Ex12_Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Ex12_Calculator calculator) {
		//Thread 스레드 이름지정
		this.setName("User1");
		this.calculator = calculator;
	}
	@Override
	public synchronized void run() {
		calculator.setMemory(100);
	}
}
