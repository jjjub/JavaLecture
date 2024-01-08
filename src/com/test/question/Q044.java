package com.test.question;

import java.util.Scanner;

public class Q044 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result ="";
		int sum = 0;
		int i;
		while (sum < 100) {
			System.out.print("숫자: ");
			i = sc.nextInt();
			if (i % 2 == 0) {
				result += "+"+i;
				sum += i;
			} else {
				result += "-"+ i;
				sum -= i;

			}
		}
		System.out.printf("%s = %d", result, sum);
		sc.close();
	}

}
