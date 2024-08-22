package com.ict.day18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex07_bear {

	public static void main(String[] args) {
		Path path = Paths.get("D:", "davidlee","bear.jpg");
		Path path2 = Paths.get("D:", "davidlee","util","bear_copy1.jpg");
		String fileName = path.toString();
		String fileName2 = path2.toString();
		File file = new File(fileName);
		File file2 = new File(fileName2);
		BufferedInputStream bis =null;
		BufferedOutputStream bos =null;
		try {
			bis= new BufferedInputStream(new FileInputStream(file));
			
			bos= new BufferedOutputStream(new FileOutputStream(file2));//buffered why?
			//배열방식
//			byte[] code = new byte[(int)(file.length())];
//			bis.read(code);
//			bos.write(code);
			//while 방식1
//			while (true) {
//				int c = bis.read();
//				System.out.println(c);
//				if (c==-1) {
//					break;
//				}
//				bos.write(c);
//				bos.flush();
//			}
			int c =0;
			while ((c = bis.read()) != -1) {
				bos.write(c);
				bos.flush();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();
				bis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		


	}

}
