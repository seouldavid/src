package com.ict.day20;
// 파싱: 데이터를 특정한 형식으로 분석하고 구조화 하는 과정
//		데이터를 분해 분석해서 원하는 형태로 추출 , 조립, 가공 하는 작업
//
// xml/json 파싱: xml이나 json 형식의 데이터를 파싱하여 프로그래밍 언어의 객체로 변환하는 작업
//				이를 통해서 프로그램이 데이터를 더 쉽게 처리할 수 있다. 

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

// HTML : Hyper Text markup Language => 하이퍼 텍스트 마크업 언어
// 		  Hyper Text => 하이퍼 링크를 통해 한 문서에서 다른 문서로 이동할 수 있더록 하는
//						초월적인(Hyper) 글(Text)
//		  Markup Language => 문서나 데이터의 구조를 명기하는 언어
//							 문서가 화면에 표시되는 형식을 나타내거나
//							 데이터의 논리적인 구조를 명시하기 위한 규칙들을 정의한 언어
//		 => 태그들로 이루어진 문서
//		 => <시작태그 속성="값" 속성="값"> 텍스트 </끝태그>
//		 
// XML : eXtensible Markup Language => 확장된 마크업 언어
// 		 HTML과 달리 미리 정의된 태그가 없는 마크업 언어
//		 사용저가 태그를 만들어서 사용하면 된다.
//		 데이터를 저장, 검색, 공유할 수 있는 형식으로 저장할 수 있는 강력한 방법

// DOM(Document Object Modeling) 방식 : 웹 브라우저가 태그를 해석하고 표현하는 방식

public class Ex01_DOM2 {
	public static void main(String[] args) {
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		Path path = Paths.get("D:", "davidlee", "util", "0823-7.txt");
		String pathName = path.toString();
		File file = new File(pathName);
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		HttpURLConnection conn = null;
		try {
			URL url = new URL("http://www.kma.go.kr/XML/weather/sfc_web_map.xml");
			conn = (HttpURLConnection) url.openConnection();
			
			is = conn.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while ((msg = br.readLine()) != null) {
				sb.append(msg);
			}
			// 화면에 출력
			// System.out.println(sb.toString());
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			//파싱하기
			// 1. 데이터를 파싱하기 위해서 저장
			InputSource in = new InputSource(new StringReader(sb.toString()));
			
			//2. DOM 방식으로 파서(parser) 만들기 (팩토리 패턴, 빌드 패턴)
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(in);
			
			//원하는 태그찾기
			//NodeList => 배열로 취급하자
			NodeList locals =document.getElementsByTagName("local");
			//추출 데이터를 저장하기 위해 필요
			StringBuffer sb2 = new StringBuffer();
			for (int i = 0; i < locals.getLength(); i++) {
				//텍스트 추출
				String txt =locals.item(i).getFirstChild().getNodeValue();
				//속성 추출
				String attr1 = ((Element)locals.item(i)).getAttribute("ta"); 
				String attr2 = ((Element)locals.item(i)).getAttribute("desc"); 
				
				sb2.append(txt + "\t");
				sb2.append(attr1 + "\t");
				sb2.append(attr2 + "\n");
				
			}
			System.out.println("도시\t온도\t상태");
			System.out.println(sb2.toString());
			//지금은 파일로 저장, 나중에는 파싱한 내용을 DB에 저장
			bw.write(sb.toString());
			bw.flush();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				bw.close();
				fw.close();
				isr.close();
				is.close();
				br.close();
				conn.disconnect();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		
	}
}
