package com.ict.day19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Stream;

//URLConnection 클래스 : 원격지 서버 자원의 결과와 원격지 서버의 헤더 정보를 가져올 수 있다.

public class Ex12 {
	public static void main(String[] args) {
		Optional stre = Stream.of(1,2,3,4).reduce((i,j)-> i+j);

		Path path = Paths.get("D:", "davidlee", "util", "0823-7.txt");
		String pathName = path.toString();
		File file = new File(pathName);
		
		//웹 사이트 정보 읽어오기
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		//파일에 저장하려면
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			URL url = new URL("http://www.kma.go.kr/XML/weather/sfc_web_map.xml");
//			URLConnection conn =url.openConnection();
		    HttpURLConnection conn =(HttpURLConnection) url.openConnection();
		    is = conn.getInputStream();
		    isr = new InputStreamReader(is);
		    br = new BufferedReader(isr);
		    //한줄 읽어서 저장하기
		    String msg = null;
		    //msg를 append()를 이용해서 누적 저장하기
		    StringBuffer sb = new StringBuffer();
		    while ((msg = br.readLine()) != null) {
				sb.append(msg+"\n");
			}
		    System.out.println(sb);
		    
		    //파일로 저장하기
		    fw = new FileWriter(file);
		    bw = new BufferedWriter(fw);
		    bw.write(sb.toString());
		    bw.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
