package com.test.question;

import java.util.Scanner;

public class Q040 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자: ");
		int start = sc.nextInt();
		System.out.print("마지막 숫자: ");
		int last = sc.nextInt();
		String result = "";

		int sum = 0;
		for (int i = start; i <= last; i++) {
			if (i % 2 == 0) {
				sum += i;
				System.out.printf("-%d", i);
			} else {
				sum -= i;
				System.out.printf("+%d", i);
			}
		}System.out.printf("= %d", sum);
	}

}
