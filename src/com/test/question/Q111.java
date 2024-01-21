package com.test.question;

import java.io.File;
import java.util.Scanner;

public class Q111 {

	public static void main(String[] args) {
	

		Scanner sc = new Scanner(System.in);
		
		System.out.print("폴더 : ");
		String path = sc.nextLine();
		
		System.out.print("확장자 : ");
		String type = sc.nextLine();
		
		File dir = new File(path);
		
		File[] list = dir.listFiles();
		for(int i = 0; i<list.length; i++) {
			if(list[i].getName().endsWith("."+type)) {
				System.out.println(list[i].getName());
			}
		}
		
		
		

	}

}
