package com.test.question;

import java.util.Scanner;

public class Q050 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행: ");
		int row = sc.nextInt();
		
		int i, j;
		for (i = 1; i <= row; i++) {
			for (j = 0; j < row -i; j++) {
				System.out.print(" ");
			}
			for (j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}

