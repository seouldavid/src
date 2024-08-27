package com.ict.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Ex03_Client {
	public static void main(String[] args) {
		Socket socket = null;

		OutputStream os = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;

		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;

		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("데이터 입력 : ");
			String msg = scan.nextLine();

			// 서버 주소와 서버 포트
			socket = new Socket("192.168.0.35", 7777);
			
			os = socket.getOutputStream();
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
			
//			String msg = bw.write(msg);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {

			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}
