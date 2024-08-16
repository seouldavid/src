package team4_1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int[] compNums = T1.randNumGenerator();
		while(true) {
			T2 module2 = new T2();
			int[] userNums = module2.getUser();
			
			T3 m3 = new T3(compNums,userNums);
			int strikes = m3.getStrikeNum();
			int balls = m3.getBallNum();
			int outs = m3.getOutNum();
			System.out.println();
			if (strikes == 3) {
				System.out.println("3스트라이크! 다시하시겠습니까? y/n");
				String choice = scan.next();
				if (choice.equals("y")) {
					continue;
				} else {
					break;
				}
			}
			System.out.println("입력한 수: "+userNums[0]+userNums[1]+userNums[2]+" 결과: "+strikes + " 스트라이크/ "+ balls + " 볼/ " + outs + "아웃" 
					+"컴퓨터 수: "+compNums[0]+compNums[1]+compNums[2]);
			
		
		}
		
	}
}
