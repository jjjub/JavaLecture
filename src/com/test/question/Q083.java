package com.test.question;

import java.util.Scanner;

public class Q083 {

	public static void main(String[] args) {
		int countMp3 = 0;
		int countJpg = 0;
		int countJava = 0;
		int countHwp = 0;
		int countDoc = 0;
		int index = 0;
		String file = "";
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			
			System.out.print("파일명: ");
			file = sc.nextLine();

			index = file.indexOf(".");

			if (file.substring(index).equals(".mp3")) {
				countMp3++;
			} else if (file.substring(index).equals(".jpg")) {
				countJpg++;
			} else if (file.substring(index).equals(".java")) {
				countJava++;
			} else if (file.substring(index).equals(".hwp")) {
				countHwp++;
			} else if (file.substring(index).equals(".doc")) {
				countDoc++;
			}
		}
		System.out.println("mp3 :" +countMp3 + "개");
		System.out.println("jpg :" +countJpg + "개");
		System.out.println("java :" +countJava + "개");
		System.out.println("hwp :" +countHwp + "개");
		System.out.println("doc :" +countDoc + "개");
		
		sc.close();
	}

}
