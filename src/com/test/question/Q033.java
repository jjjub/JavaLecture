package com.test.question;

import java.util.Scanner;

public class Q033 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 입력: ");
		int year = sc.nextInt();
		String result;
		if(year % 4 != 0) {
			result ="평년";
		}else if(year % 100 != 0) {
			result ="윤년";
		}else if(year % 400 != 0) {
			result ="평년";
		}else {
			result ="윤년";
		}
		
		System.out.printf("%d년은 '%s'입니다.", year, result);
		sc.close();
	}

}
