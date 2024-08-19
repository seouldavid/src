package com.ict.day13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex01 {

	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();
		LocalDate today = LocalDate.now();
		LocalTime timeNow = LocalTime.now();
		System.out.println(dateTime);
		System.out.println(today);
		System.out.println(timeNow);
		
//		System.out.println(today.plusDays(3));
//		System.out.println(timeNow.plusHours(5));
//		LocalDate today1 = today.plusDays(70);
//		
//		System.out.println(today.withYear(1));
		LocalDate date = LocalDate.parse("2020-02-20");
		
	}

}
