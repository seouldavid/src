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

//ObjectOutputStream : 객체 출력 스트림
//writeOject() : 객체 직렬화 메서드
public class Ex07_Output {
	public static void main(String[] args) {
		//1. VO를 객체로 만들자
		Ex07_VO vo1 = new Ex07_VO("고길동",35,70.6,true);
		Ex07_VO vo2 = new Ex07_VO("희동이",3,30.12,false);
		Ex07_VO vo3 = new Ex07_VO("둘리",24,45.6,true);
		Ex07_VO vo4 = new Ex07_VO("마이콜",21,67.2,false);
		Ex07_VO vo5 = new Ex07_VO("도우너",13,24.6,true);
		
		//2.파일 저장위치 지정
		Path path = Paths.get("D:", "davidlee", "util", "0823-4.txt");
		String pathName = path.toString();
		File file = new File(pathName);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			//3. 여러개의 객체를 컬렉션(ArrayList)에 모으자.
			List<Ex07_VO> list = new ArrayList<Ex07_VO>();
			list.add(vo1);
			list.add(vo2);
			list.add(vo3);
			list.add(vo4);
			list.add(vo5);
			
			//4. 객체 직렬화
			oos.writeObject(list);
			oos.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bos.close();
				fos.close();
				oos.close();
			} catch (Exception e2) {
			}
		}
	}
}
