package com.ict.day19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//OutputStreamWriter : 바이트 출력 스트림(기계)을 문자 출력 스트림(사람)으로 변환해주는 역할 
//					   파일에 텍스트를 쓰거나 네트워크를 통해 문자 데이터 전송할때 사용
//					   ** 문자를 바이트로 변환하여 출력하는 클래스.
//InputStreamReader :	바이트 입력 스트림(기계)를 문자 입력 스트림(사람) 으로 변환
//						바이트로된 데이터를 특정 인코딩 방식을 읽어서 문자열로 변환
//						** 바이트를 문자로 변환하여 읽어들이는

public class Ex06 {
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("원하는 문자: ");
//		String msg = scan.next();
//		System.out.println("메세지 : " + msg);
		
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			osw = new OutputStreamWriter(System.out);
			bw = new BufferedWriter(osw);
			bw.write("원하는 문자: ");
			bw.flush();
			
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			String msg = br.readLine();
			
			bw.write("받은 문자 : " + msg);
			bw.flush();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				osw.close();
				bw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
