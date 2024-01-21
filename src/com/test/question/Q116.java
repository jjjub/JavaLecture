package com.test.question;

import java.io.File;
import java.util.ArrayList;

public class Q116 {

	public static void main(String[] args) {

		String path1 = "E:\\filedirec\\동일 파일\\MusicA";
		String path2 = "E:\\filedirec\\동일 파일\\MusicB";
		
		File dir1 = new File(path1);
		File dir2 = new File(path2);
		
		File[] list1 = dir1.listFiles();
		File[] list2 = dir2.listFiles();
		
		ArrayList<File> result = new ArrayList<File>();
		
		for(File file1: list1) {
			for(File file2 : list2) {
				if(file1.getName().equals(file2.getName())) {
					result.add(file1);
				}
			}
		}
		for(File file : result) {
			System.out.println(file.getName());
		}
	}

}
