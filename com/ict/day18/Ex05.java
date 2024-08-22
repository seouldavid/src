package com.ict.day18;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

//스트림은 지연이 될 수있스므로 Buffer(임시기억) 이용해서 지연 현상을 해결한다
//BufferedInputStream, BufferedOutputStream, //혼자서 사용 안됨
public class Ex05 {
	public static void main(String[] args) {
		Path path = Paths.get("D:", "davidlee", "util", "0822-2.txt");
		String pathName = path.toString();
		File file = new File(pathName);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream(file);
			//체인방식
			bos = new BufferedOutputStream(fos);
			
			String msg = "한국 ict 인재개발원 \n5강의장\nJavastudy";
			
			byte[] b =msg.getBytes();
			bos.write(b);
			bos.flush();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				//bos 먼저 close 추천
				bos.close();
				fos.close();
			} catch (Exception e2) {
				
			}
		}
		
	}
}
