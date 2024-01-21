package com.test.question;

import java.io.File;

public class Q113 {

	public static void main(String[] args) {
		
		String path ="E:\\filedirec\\음악 파일\\Music";
		File dir = new File(path);
		
		File[] list = dir.listFiles();
		
		for(int i=0; i<list.length; i++){
			File temp = new File(path + "\\"+ String.format("[%03d]%s", i, list[i].getName()));
			list[i].renameTo(temp);
		}
		
		
	}

}
