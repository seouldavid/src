package com.ict.day19;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

//FileOutputStream => 1byte 씩 처리, write(int c),write(byte[] b); 아스키코드
//								
// FileWriter      => 2byte 씩 처리, write(int c),write(char[] c), writ(String str); 유니코드
public class Ex01 {
	public static void main(String[] args) {
		Path path = Paths.get("D:", "davidlee", "util", "0823-1.txt");
		String pathName = path.toString();
		File file = new File(pathName);
		
		try(FileWriter fw = new FileWriter(file);) {
			
			
			String str = "안녕하세요\nHello\n123123\n\n";
			fw.write(str);
			//fw.write(str, 시작index, 길이);
			fw.write(str, 6, 5);
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
