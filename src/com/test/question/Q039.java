package com.test.question;

import java.util.Scanner;

public class Q039 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자: ");
		int start = sc.nextInt();
		System.out.print("종료 숫자: ");
		int last = sc.nextInt();
		int sum = 0;
		for(int i=start; i<=last; i++) {
			sum+=i;
			System.out.printf("%d + ",i);
		}
		System.out.printf(" \b\b = %d", sum);
	}

}

