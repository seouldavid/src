package com.ict.day15;

//일반클래스가 인터페이스를 상속 받으면 무조건 오버라이드 해야 한다.
public class Ex01_Audio implements Ex01_Remote {

	private int volume;

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Audio를 끕니다.");
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
	}

	@Override
	public void setVolume(int volume) {
		if (volume > Ex01_Remote.MAX_VOLUME) {
			this.volume = Ex01_Remote.MAX_VOLUME;
		} else if (volume < Ex01_Remote.MIN_VOLUME) {
			this.volume = Ex01_Remote.MAX_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 tv 볼륨" + this.volume);
	}
}
