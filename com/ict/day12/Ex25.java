package com.ict.day12;

import java.util.Calendar;

public class Ex25 {

	public static void main(String[] args) {
		// Calendar 클래스 
		// 현재 날짜 시간을 가져오기
		Calendar now = Calendar.getInstance();
		//System.out.println(now);
		System.out.println(now.getTime());
		
		//년월일시분초
		System.out.println(now.get(Calendar.YEAR)+ "년");
		System.out.println((now.get(Calendar.MONTH) +1) + "월");
		System.out.println(now.get(Calendar.DATE)+ "일");
		System.out.println(now.get(Calendar.DAY_OF_MONTH)+ "일");
		System.out.println(now.get(Calendar.HOUR)+ "시");   			// 12시간제
		System.out.println(now.get(Calendar.HOUR_OF_DAY)+ "시");		// 24시간제
		System.out.println(now.get(Calendar.MINUTE)+ "분");
		
		//AM = 0 , PM = 1
		int k = now.get(Calendar.AM_PM);
		if (k == 0) {
			System.out.println("AM" + now.get(Calendar.HOUR) + "시");
		} else if (k ==1) {	
			System.out.println("PM" + now.get(Calendar.HOUR) + "시");
		}
		
		int k2 = now.get(Calendar.DAY_OF_WEEK);
		switch (k2) {
		case 1 : System.out.println("일요일");break;
		case 2 : System.out.println("월요일");break;
		case 3 : System.out.println("화요일");break;
		case 4 : System.out.println("수요일");break;
		case 5 : System.out.println("목요일");break;
		case 6 : System.out.println("금요일");break;
		case 7 : System.out.println("토요일");break;
		}
		
		// set 메서드로 날짜 설정
		Calendar now2 = Calendar.getInstance();
		now2.set(Calendar.YEAR, 2023);
		now2.set(Calendar.MONTH, 11);
		now2.set(Calendar.DAY_OF_MONTH, 25);
		System.out.println(now2.getTime());
	}

}
