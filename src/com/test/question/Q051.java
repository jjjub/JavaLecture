package com.test.question;

import java.util.Scanner;

public class Q051 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("행: ");
		int row = sc.nextInt();
		for(int i=0; i<row; i++) {
			for(int j=0; j<row-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<(i*2)+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
