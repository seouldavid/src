package com.ict.day08;

public class Ex03 {

	public static void main(String[] args) {
		 int[][] arr = new int[5][8];
	        
	        // 1명의 모든 정보가 들어간다.(String이라 안됨)
	        //        번호,국어,영어,수학, 총점, 평균, 학점, 순위
	        int[] p1 = {1, 90, 90, 90, 270, 90, 'A', 1 };
	        int[] p2 = {2, 80, 80, 80, 240, 80, 'B', 1 };
	        int[] p3 = {3, 100, 100, 100, 300, 100, 'A', 1 };
	        int[] p4 = {4, 85, 85, 85, 255, 85, 'B', 1 };
	        int[] p5 = {5, 70, 70, 70, 210, 70, 'C', 1 };
	        
	        arr[0] = p1 ;
	        arr[1] = p2 ;
	        arr[2] = p3 ;
	        arr[3] = p4 ;
	        arr[4] = p5 ;
			// 순위
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (arr[i][5] < arr[j][5] ) {
						arr[i][7]++;
					}
				}
			}   
			// 정렬
			int[][] arr2 = new int[5][8];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (arr[j][7] == i+1) {
						arr2[i] = arr[j];
					}
				}
			}
//			int[] tmp = new int[8];
//			for (int i = 0; i < arr.length-1; i++) {
//				for (int j = 0; j < arr.length; j++) {
//					if(arr[i][7] > arr[j][7]) {
//						tmp = arr[];
//					}
//					
//				}
//			}
			// 출력
			System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t학점\t순위");
			for (int i = 0; i < arr2.length; i++) {
				for (int j = 0; j < arr2[i].length; j++) {
					if(j == 6) {
						System.out.print((char)(arr2[i][j]) + "\t");
						continue;
					}
					System.out.print(arr2[i][j] + "\t");
				}
				System.out.println();
			}
		
	}

}
