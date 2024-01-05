package com.test.question;

import java.util.Scanner;

public class Q001 {

	public static void main(String[] args) {
		
		//문제 1.
		Scanner scanner = new Scanner(System.in);
		int age;
		System.out.print("당신의 태어난 해: ");
		int birth=scanner.nextInt();
		
		age = 2024 - birth;
		System.out.printf("나이 : %d", age);
		
		scanner.close();
	}
}
