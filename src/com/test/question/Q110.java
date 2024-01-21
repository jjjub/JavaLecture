package com.test.question;

import java.io.File;

public class Q110 {

	public static void main(String[] args) {

		String path = "E:\\class\\java\\file\\test.txt";
		String type = "";
		File dir = new File(path);
		type = dir.getName();
		if (dir.exists()) {
			System.out.printf("파일명: %s\n", dir.getName());
			System.out.printf("%s 파일\n", type.substring(type.length() - 3, type.length()));
			System.out.println(getSize(dir.length()));
			
		}
		

	}

	private static String getSize(long length) {
		// 파일 크기 단위 조정
		if(length < 1024) {
			return String.format("파일 크기 : %db", length);
		}else if(length < 1024 * 1024){
			return String.format("파일 크기 : %.1fkb", length/1024);
		}else if(length < 1024 * 1024 * 1024){
			return String.format("파일 크기 : %.1fmb", length/1024/1024);
		}else if(length < 1024 * 1024 * 1024*1024){
			return String.format("파일 크기 : %.1fg", length/1024/1024/1024);
		}else {
			return String.format("파일 크기 : %.1ft", length/1024/1024/1024/1024);
		}
		
	}

}
