package com.ict.day17;

public class Ex13 implements Runnable {
	int x =0;
	
	//임계영역 : 멀티스레드에 의해 공유자원이 참조될 수 있는 코드의 범위
	//		  실행중인 스레드는 다른 스레드에게 제어권을 빼앗길 수 있는 문제가 발생한다,
	//		  이러한 문제를 해결하기 위한 방법이 동기화 이다.
	
	// 동기화란 먼저 차지하고 있는 스레드가 끝날때까지 다른 스레드가 제어권을 빼앗을 수 없게 락을 걸어 버린다.
	// 방법은  해당 메서드 반환형 앞에 synchronized 예약을 붙인다.
	
	//동기화 처리할때 현재 실행중인 스레드를 강제로 대기상태로 변경시키는 메서드 => wait()
	// wait()된 스레드 풀어주지 않으면 다시준비 상태로 가서 다시 실행 해야 하는데 실행 못한다.
	// wait()된 스레드 풀어주는 메서드는 notify(),notifyAll()
	//
	@Override
	public synchronized void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(++x + ":" + Thread.currentThread().getName());
			if (x==10) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
			} else {
				notify();
			}
		}
	}
}
