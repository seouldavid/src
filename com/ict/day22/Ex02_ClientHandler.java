package com.ict.day22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Ex02_ClientHandler extends Thread {
	Socket socket;
	private BufferedReader in;
	private BufferedWriter out;
	private String nickName;

	public Ex02_ClientHandler(Socket socket) {
		this.socket = socket;
		try {
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			nickName = in.readLine();
			Ex02_Server.sendMessage(nickName + "님이 채팅창에 입장했습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		// 클라이언트에게 받은 메서드
		String msg ;
		try {
			while ((msg = in.readLine()) != null) {
				if (msg.equalsIgnoreCase("exit")) {
					break;
				}
				Ex02_Server.sendMessage(nickName + " : " + msg);
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				Ex02_Server.sendMessage(nickName + "님이 채팅방을 나갔습니다.");
				in.close();
				out.close();
				socket.close();
			} catch (Exception e2) {
			}
		}

	}

	// 보내는 메서드
	public void sendMessage(String msg) {
		try {
			out.write(msg + "\n");
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public String getNickName() {
		return nickName;
	}
}
