package com.test.question;

import java.util.Scanner;

public class Q036 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자:");
		int firstNum = sc.nextInt();
		System.out.print("종료 숫자:");
		int lastNum = sc.nextInt();
		System.out.print("증감치:");
		int plus = sc.nextInt();
		
		for(int i=firstNum; i<=lastNum; i+=plus) {
			System.out.printf("%d\n", i);
		}

	}

}
