package com.ict.day04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//메뉴판
String menuPan ="""		
>>>>>>>>>>>메뉴>>>>>>>>>>>>>
<<<<   1.카페모카 (3500) >>>>
<<<<   2.카페라떼 (4000) >>>>
<<<<   3.아메리카노(3000) >>>>
<<<<   4.과일주스 (4000) >>>>
>>>>>>>>>>>>>>>>>>>>>>>>>>>
""";
System.out.println(menuPan);
System.out.print("메뉴를 선택하세요 >>> ");
int menu = scan.nextInt() ;
System.out.print("주문 수량 >>> ");
int quantity = scan.nextInt() ;
System.out.print("입금할 금액 >>> ");
int spending = scan.nextInt() ;
int price = 0;

if (menu == 1) {
	price = (int) (3500 * 1.1 * quantity);
} else if (menu == 2) {
	price = (int) (4000 * 1.1 * quantity);
} else if (menu == 3) {
	price = (int) (3000 * 1.1 * quantity);
} else {
	price = (int) (3500 * 1.1 * quantity);
}
spending = spending - price;
System.out.println("잔돈은 : " + spending);
scan.close();
	}

}
