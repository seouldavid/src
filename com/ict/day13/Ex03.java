package com.ict.day13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex03 {

	public static void main(String[] args) {
		// LocalDate 클래스는 날짜만 다루며, 시간이나 시간대 정보를 포함하고 있지 않다.
		// localTime 클래스는 시간만 다룬다.
		// localDateTime 클래스는 날짜와 시간 모두 처리하는 클래스
		
		// 날짜와 시간 가져오기
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재 날짜와 시간 : " + now);
		
		// 특정 날짜와 시간 설정
		LocalDateTime now2 = LocalDateTime.of(2024, 8, 10, 0, 0, 0);
		System.out.println("특정 날짜와 시간 : " + now2);
		
		LocalDateTime day3 = now.plusDays(7);
		System.out.println("일주일 후 : " + day3);
		
		LocalDateTime day4 = now.minusDays(7);
		System.out.println("일주일 전 : " + day4);
		
		//현재가 지정된 날짜 이전 인지 체크
		boolean isBefore = now.isAfter(day3);
		System.out.println("지정한 날짜에 이전인가?" + isBefore);
		
		// 날짜와 시간 포멧
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String msg = now.format(formatter);
		System.out.println(msg);	
	}

}
