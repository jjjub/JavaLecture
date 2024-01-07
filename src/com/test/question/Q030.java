package com.test.question;

import java.util.Scanner;

public class Q030 {

	public static void main(String[] args) {
		int c1 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 :");
		c1 = sc.nextInt();
		if (c1 >= 65 && c1 <= 90) {
			System.out.printf("%s 의 대문자는 %s입니다.", c1, c1 - 32);
		} else if (c1 >= 97 && c1 <= 127) {
			System.out.printf("%s 의 대문자는 %s입니다.", c1, c1 + 32);
		} else {
			System.out.println("영문자만 입력하세요.");
		}
	}

}
