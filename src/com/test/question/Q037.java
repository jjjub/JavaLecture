package com.test.question;

import java.util.Scanner;

public class Q037 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			sum+=i;
		}
		System.out.printf("1 ~ %d = %d", num, sum);
		sc.close();
	}

}
