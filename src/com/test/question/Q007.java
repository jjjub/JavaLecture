package com.test.question;

import java.util.Scanner;

public class Q007 {
	public static void main(String[] args) {
		char smallLetter , result;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력: ");
		smallLetter=sc.nextLine().charAt(0); //char형식으로 입력 받음
		
		int capitalCode =(int)smallLetter - 32; //변환(소문자 -> 대문자 아스키 코드)
		result = (char)capitalCode; //(대문자 아스키 코드 -> 대문자)
		
		
		System.out.printf("소문자 '%s'의 대문자는 '%s'입니다.",smallLetter, result);
		sc.close();
		//32차이
	}
}
