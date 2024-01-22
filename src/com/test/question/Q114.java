package com.test.question;

import java.io.File;
import java.util.HashMap;

public class Q114 {

	public static void main(String[] args) {
		String path = "C:\\Users\\user\\Downloads\\파일 디렉토리 문제\\확장자별 카운트";
		File file = new File(path);
		File[] list = file.listFiles();
		HashMap<String, Integer>count = new HashMap<String, Integer>();
		String type="";
		
		
		for(File files : list) {
			type = files.getName().substring(files.getName().lastIndexOf("."));
			
			if( count != null) {
				count.put(type, 1);
			}else {
				count.put(type, count.get(type)+1);
			}
		}
		
		System.out.println(count);
		

	}

}
