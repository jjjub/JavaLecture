package com.test.question;

import java.util.Scanner;

public class Q012 {

	public static void main(String[] args) {
		String result = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int n = sc.nextInt();
		result = getNumber(n); 
		System.out.printf("입력하신 숫자 '%d'는(은) '%s'입니다.\n", n, result);
		
		sc.close();

	}

	private static String getNumber(int n) {
		String result = "";
		if (n % 2 == 0) {
			result = "짝수";
		} else {
			result = "홀수";
		}
		return result;
	}

	

}
