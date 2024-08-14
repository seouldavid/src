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
		now2.set(Calendar.YEAR, 2024);
		now2.set(Calendar.MONTH, 7);
		now2.set(Calendar.DAY_OF_MONTH, 13);
		System.out.println(now2.getTime());
		
		//January 1, 1970 00:00:00.000 => 밀리초로 계산 한 값 => 1/1000
		System.out.println(now.getTimeInMillis());
		System.out.println(System.currentTimeMillis());
		
		//현재 시간
		Calendar now3 = Calendar.getInstance();
		//두 날짜 차이 구하기
		long diff = now3.getTimeInMillis()- now2.getTimeInMillis();
		System.out.println(diff/(60*60*24*1000));
		
		now3.add(Calendar.DATE, 1);
		System.out.println(now3.getTime());
	}

}
