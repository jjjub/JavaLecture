package com.test.question;

import java.util.Scanner;

public class Q050 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("행: ");
		int row = sc.nextInt();
		int i, j, k;
		for (i = 0; i <= row; i++) {
			for (j = row; j >= i; j--) {
				System.out.print("");
			}
			for (j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
