package com.ict.day21;

import java.net.Socket;

public class Ex04_ClientHandler extends Thread {
	private Socket socket;
	
	public Ex04_ClientHandler(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		
	}
}
