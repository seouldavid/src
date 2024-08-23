package com.ict.day19;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Ex08_Output {
	public static void main(String[] args) {
		Ex08_VO vo1 = new Ex08_VO("aa", 10, 60, false);
		Ex08_VO vo2 = new Ex08_VO("bb", 15, 50, true);
		Ex08_VO vo3 = new Ex08_VO("cc", 18, 70, false);
		Ex08_VO vo4 = new Ex08_VO("dd", 16, 67, true);
		
		Path path = Paths.get("D:", "davidlee", "util", "0823-4.txt");
		String pathName = path.toString();
		File file = new File(pathName);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos =new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			List<Ex08_VO> list = new ArrayList<Ex08_VO>();
			list.add(vo1);
			list.add(vo2);
			list.add(vo3);
			list.add(vo4);
			oos.writeObject(list);
			oos.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				bos.close();
				oos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
