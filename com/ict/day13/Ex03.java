package com.ict.day13;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

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

		// 현재가 지정된 날짜 이전 인지 체크
		boolean isBefore = now.isAfter(day3);
		System.out.println("지정한 날짜에 이전인가?" + isBefore);

		// 날짜와 시간 포멧
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String msg = now.format(formatter);
		System.out.println(msg);

		// 1. Date 클래스
		Date date = new Date();
		System.out.println(date);

		// 기본형태 변환
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		System.out.println(sdf.format(date));

		SimpleDateFormat sdf2 = new SimpleDateFormat("yy-M-d H:m:s");
		System.out.println(sdf2.format(date));

		// 년, 월 ,일 ,시 ,분 , 초, 요일 -> 시스템상의 년, 월 ,일 ,시 ,분 , 초,
		System.out.println(date.getYear() + 1900); // 현재년도 - 1900
		System.out.println(date.getMonth() + "월");
		System.out.println(date.getDate() + "일");
		System.out.println(date.getHours() + "시");
		System.out.println(date.getMinutes() + "분");
		System.out.println(date.getSeconds() + "초");

		int k = date.getDay();
		switch (k) {
		case 0:
			System.out.println("일요일");
			break;
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
			break;
		case 3:
			System.out.println("수요일");
			break;
		case 4:
			System.out.println("목요일");
			break;
		case 5:
			System.out.println("금요일");
			break;
		case 6:
			System.out.println("토요일");
			break;
		}
	}

}
