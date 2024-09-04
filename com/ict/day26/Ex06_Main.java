package com.ict.day26;

import java.util.Scanner;

public class Ex06_Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("선택하세요");
        System.out.println("1.customer 테이블 전체 데이터 보기");
        System.out.println("2.customer 테이블 특정 데이터 보기");
        System.out.println("3.customer 테이블 데이터 삽입");
        System.out.println("4.customer 테이블 특정 데이터 삭제");
        System.out.println("5.customer 테이블 특정 데이터 수정");
        System.out.print(">>>>>>>>>>>>>>>>   ");
        
        int menu = scan.nextInt();
        switch (menu) {
		case 1: Ex06_DAO.getInstance().getSelectAll(); break;
		case 2: 
			System.out.println("custid: ");
			int custid = scan.nextInt();
			Ex06_DAO.getInstance().getSelectOne(custid);
			break;
		case 3: 
			System.out.println("삽입할 정보를 입력하세요");
			System.out.println("이름 : ");
			String name = scan.next();
			
			System.out.println("주소 : ");
			String address = scan.next();
			
			System.out.println("전화번호 : ");
			String phone = scan.next();
			Ex06_DAO.getInstance().getInsert(name, address, phone);
			break;
		case 4: 
			System.out.println("삭제할 custid: ");
			custid = scan.nextInt();
			Ex06_DAO.getInstance().getDelete(custid);
			break;
		case 5:
			System.out.println("업데이트할 custid 지정: ");
			custid = scan.nextInt();
//			if (!Ex06_DAO.getInstance().isInTable(custid)) {
//				System.out.println("지정하신 custid가 없습니다.");
//				break;
//			}
			System.out.println("새로운 name 입력: ");
			name = scan.next();
			System.out.println("새로운 address 입력: ");
			address = scan.next();
			System.out.println("새로운 phone 입력: ");
			phone = scan.next();
			Ex06_DAO.getInstance().getUpdate(custid, name, address, phone);
			break;
		default:System.out.println("1~5 숫자를 입력하시오."); break;
		}
	}

}
