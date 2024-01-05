package com.test.question;

import java.util.Scanner;

public class Q010 {

	public static void main(String[] args) {
		digit(1);
		digit(12);
		digit(321);
		digit(5678);
		digit(98765);
	}

	private static void digit(int num) {
		if (num >= 1000) {
			System.out.println(num);
		} else if (num < 10) {
			System.out.printf("%04d\n", num); // 한자리
		} else if (num < 100) {
			System.out.printf("%04d\n", num); // 두자리
		} else {
			System.out.printf("%04d\n", num); // 세자리
		}

	}

}
