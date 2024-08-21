package com.ict.day17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex03 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("이름", "홍길동");
		map.put("나이", "24");
		map.put("주소", "함경도");
		map.put("취미", "운동");
		
		System.out.println(map.get("이름"));
		System.out.println(map.get("취미"));
		System.out.println(map.get("주소"));
		System.out.println();
		
		//출력하기
		for (String string : map.keySet()) {
			System.out.println(string +" : " + map.get(string));
		}
		System.out.println("================");
		
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.println(string +" : " + map.get(string));
		}

	}

}
