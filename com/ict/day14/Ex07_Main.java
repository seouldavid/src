package com.ict.day14;

public class Ex07_Main {
	public static void main(String[] args) {
//		Ex07_Animal animal = new Ex07_Animal();
		int[] arr1 = new int [3];
		int[] arr2 = arr1;
		arr1[1] = 11;
		arr1[2] = 5 ;
		System.out.println(arr1[1]);
		System.out.println(arr2[1]);
		System.out.println(arr1[2]);
		System.out.println(arr2[2]);
		
		
		int n = 5;
		int n1 = n;
		n= n+1;
		System.out.println(n1);
		System.out.println(n);
	}
}
