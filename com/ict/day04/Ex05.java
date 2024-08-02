package com.ict.day04;

public class Ex05 {

	public static void main(String[] args) {
		// switch 문: 다중 if문과 같은 분기문이다.
		// 			 if문은 조건식 즉 논리형,논리연산,비교연산자, 범위 일때 사용
		//			 switch문은 int char String일때 사용(long , 실수형은 사용 못함)
//		 형식) switch(인자값 = int,char,String){
//		 		case 조건값1: 인자값과 조건값1이 같은 경우에수행할 문장;
//							인자값과 조건값1이 같은 경우에 수행할 문장; break;
//		 		case 조건값2: 인자값과 조건값2이 같은 경우에수행할 문장;
//							인자값과 조건값2이 같은 경우에 수행할 문장; break;
//									.
//									.
//									.
//				default : 위에 있는 조건값이 모두 아닐때 (나머지) 실행할 문장;
//					      위에 있는 조건값이 모두 아닐때 (나머지) 실행할 문장;
//					
					
		//			}
//		주의사항: break가 없으면 다음 break를 만날때까지 아래 실행문을 실행한다.
//			   break 문의 역할은현재 switch 문이나 반복문을 탈출할때 사용
//			   default 는 생략가능
//			   
//	    int k1이 1이면 카페모카, 2 이면 카페라떼,3이면 아메리카노,4이면 과일쥬스
		int k1 =2;
		String res = "";
		switch (k1) {
		case 1: System.out.println("카페모카"); break;
		case 2: System.out.println("카페라떼"); break;
		case 3: System.out.println("아메리카노");break;
		case 4: System.out.println("과일쥬스"); break;
		}
		
		// char k2가 A이거나 a이면 아프리카 B이거나 b이면 브라질 C이거나 c이면 캐나다 나머지 한국
		int k2 = 'c';
		res =" ";
		switch (k2) {
		case 'A':res = "아프리카";break;
		case 'a':res = "아프리카";break;
		case 'B':res = "브라질";break;
		case 'b':res = "브라질";break;
		case 'C':res = "캐나다";break;
		case 'c':res = "캐나다";break;
		default: res = "한국";
		}
		System.out.println(res);
		
		int k3 = 'c';
		res =" ";
		switch (k3) {
		case 'A':res = "아프리카";
		case 'a':res = "아프리카";break;
		case 'B':res = "브라질";
		case 'b':res = "브라질";break;
		case 'C':res = "캐나다";
		case 'c':res = "캐나다";break;
		default:res = "한국";
		}
		System.out.println(res);
		
	    
		
	}

}
