package com.test.question;

import java.io.File;

public class Q115 {

	public static void main(String[] args) {
		int count = 0;
		String path = "E:\\filedirec\\파일 제거";
		File file = new File(path);
		
		File[] list = file.listFiles();
		
		for(File files : list ) {
			if(files.length() == 0) {
				files.delete();
				count++;
			}
		}
		System.out.printf("총 %d개의 파일을 삭제했습니다.", count);
	}

}
