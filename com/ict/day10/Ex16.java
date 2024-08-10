package com.ict.day10;

public class Ex16 {

	public static void main(String[] args) {
		int s1 = Ex15.total;
		//static 이라도 private이면 접근 불가
		//int s2 = Ex15.sum;
		
		Ex15 test = new Ex15();
		String str1 = test.addr;
		String str2 = test.addr;
		
		int str3 = test.total;
		//int str4 = test.sum;
		
		//private 이면 직접 데이터를 가져오지 못하고 변경하지도 못함
		//Ex15.name = "둘리";
		//Ex15.sum = 957;
		
		
		//메서드에 접근해서 데이터 열기
		String name = test.getName();
		System.out.println("이름: " + name);
		
		int sum = test.getSum();
		System.out.println(sum);
		
		//메서드에 접근해서 데이터 변경
		//이름을 마이콜, sum을 975로 변경하고 확인하자
		test.setName("마이콜");
		test.setSum(975);
		
		name = test.getName();
		sum = test.getSum();
		System.out.println("이름: " + name);
		System.out.println(sum);
	}

}
