package com.test.question;

import java.util.Scanner;

public class Q030 {

	public static void main(String[] args) {
		char c1;
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 :");
		c1 = sc.nextLine().charAt(0);
		if (c1 >= 'A' && c1 <= 'Z') {
			System.out.printf("%c 의 소문자는 %c입니다.", c1, c1 + 32);
		} else if (c1 >= 'a' && c1 <= 'z') {
			System.out.printf("%c 의 대문자는 %c입니다.", c1, c1 - 32);
		} else {
			System.out.println("영문자만 입력하세요.");
		}
		sc.close();
	}

}

