

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

// SAX(Simple API for XML) 파싱 
// : 이벤트 기반 파서로, XML 문서를 순차적으로 읽으며 특정 이벤트(시작태그, 끝태그, 텍스트)를 처리한다.
//   장점) 메모리 사용이 적으며, 큰 XML 문서 처리에 적합
//   단점) 문서의 구조를 기억하지 않으며, 무작위 접근이 불가능 
//        또한, 데이터를 저장하거나 처리하는데 있어 복잡할 수 있다.  
public class Ex02_SAX {
	
	 static FileWriter fw = null;
	 static BufferedWriter bw = null;
	 
	public static void main(String[] args) {
		Path path = Paths.get("E:", "nohssam02","util", "0826-3.txt");
		String pathName = path.toString();
		File file = new File(pathName);
		
		HttpURLConnection conn = null;
		InputStream is = null;
		try {
			URL url = new URL("http://www.kma.go.kr/XML/weather/sfc_web_map.xml");
			conn = (HttpURLConnection)url.openConnection();
			is = conn.getInputStream();
			
			// 파일 저장
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			// 익명내부클래스 타입 
			DefaultHandler handler = new DefaultHandler() {
				StringBuffer sb2 = new StringBuffer();
				StringBuffer txt = new StringBuffer();
				boolean isLocal = false;
				String attr1 = "";
				String attr2 = "";
				@Override
				public void startElement(String uri, String localName, String qName, Attributes attributes)
						throws SAXException {
					// TODO Auto-generated method stub
					super.startElement(uri, localName, qName, attributes);
				}

			};
			
			// SAX 파서 생성
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			InputSource inputSource = new InputSource(new InputStreamReader(is));
			saxParser.parse(inputSource, handler);
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				conn.disconnect();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}