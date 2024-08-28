package com.ict.day22;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Ex01_Server {
	private static List<Ex01_ClientHandler> clients = new ArrayList<>();
	public static void main(String[] args) {
		ServerSocket server = null;
		try {
			server = new ServerSocket(8000);
			System.out.println("서버 대기중 ...");
			
			while (true) {
				Socket socket = server.accept();
				Ex01_ClientHandler handler = new Ex01_ClientHandler(socket);
				clients.add(handler);
				handler.start();
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				server.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	// 메세지 보내는 메소드
	public static void sendMessage(String msg) {
		for (Ex01_ClientHandler k : clients) {
			k.sendMessage(msg);
		}
	}
	
	// 종료 시키는 메소드 (ArrayList 에서 해당 객체를 제거하는 메서드)
	public static void removeClient(Ex01_ClientHandler handler) {
		clients.remove(handler);
		System.out.println(handler.getNickName() + "클라이언트다 연결 종료");
	}
	
	
}
