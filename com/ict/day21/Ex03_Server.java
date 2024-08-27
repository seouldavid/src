package com.ict.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
//에코 서버 : 클라이언트가 보낸 정보를 다시 클라이언트로 보낸다.
public class Ex03_Server {
	public static void main(String[] args) {
		ServerSocket server = null;
		Socket socket = null;
		
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		OutputStream os = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		try {
			server = new ServerSocket(7777);
			System.out.println("서버 대기중...");
			
			//클라이언트가 요청하기 전까지 블록킹 된다.
			//클라이언트가 요청을 하면 해당 요청을 담당하는 socket 생성된다.
			socket = server.accept();
			
			//클라이언트가 보낸 정보를 받기 위해 입력 스트림 받기
			is = socket.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			//서버에 접속한 ip 주소 얻기
			String ip = socket.getInetAddress().getHostAddress();
			String msg = br.readLine();
			System.out.println(ip +":"+msg);
			//받은 메세지를 다시 보낸다.
			os = socket.getOutputStream();
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
			bw.write(msg);
			bw.flush();
			
			
		} catch (Exception e) {
		} finally {
			try {
				os.close();
				osw.close();
				bw.close();
				is.close();
				isr.close();
				br.close();
				socket.close();
				server.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}
