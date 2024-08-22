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

public class Ex07_cup {

	public static void main(String[] args) {
		Path path = Paths.get("D:", "davidlee","cup.jpg");
		Path path2 = Paths.get("D:", "davidlee","util","cup_copy.jpg");
		String fileName = path.toString();
		String fileName2 = path2.toString();
		File file = new File(fileName);
		File file2 = new File(fileName2);
		FileInputStream fis = null;
		BufferedInputStream bis =null;
		BufferedOutputStream bos =null;
		FileOutputStream fos = null;
		try {
			fis= new FileInputStream(file);
			bis= new BufferedInputStream(fis);
			
			fos= new FileOutputStream(file2);
			bos= new BufferedOutputStream(fos);//buffered why?
			byte[] code = new byte[(int)(file.length())];
			bis.read(code);
			bos.write(code);
			bos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
				bos.close();
				bis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		file.delete();


	}

}
