package com.ict.day19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex10 {

	public static void main(String[] args) {
		
		Path path = Paths.get("D:", "davidlee", "util", "0823-6.txt");
		String pathName = path.toString();
		File file = new File(pathName);
		System.out.println(file.exists());
		
		InputStream is = null;
		FileWriter fw = null;
		BufferedWriter bfw = null;
		PrintStream ps = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			URL url = new URL("https://comic.naver.com/index");
			is = url.openStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			fw = new FileWriter(file);
			bfw = new BufferedWriter(fw);
			ps = new PrintStream(file);
			String msg = null;
//			String result = null;
//			String result ="";
			//String 에 여러번 + 사용하면 메모리에 슬데 없는 공간이 만들어진다.
			//그것을 해결하기 위해서 Stringbuffer나 StringBuilder를 사용한다.
			//append()로 추가하면 된다.
			StringBuffer result = new StringBuffer();
			while ((msg=br.readLine()) != null) {
				System.out.println(msg);
//				bfw.write(msg);
//				bfw.newLine();
//				ps.println(msg);
				result=result.append(msg);
//				result = result + msg + "\n";
			}
//			bfw.write(result);
			
			//StringBuffer 사용하였으므로 .toString()이요애서 String으로 만들어준다.
			bfw.flush();
		} catch (Exception e) {	
		} finally {
			try {
				br.close();
				isr.close();
				is.close();
				fw.close();
				bfw.close();
				ps.close();
			} catch (Exception e2) {
			}
		}

	}

}
