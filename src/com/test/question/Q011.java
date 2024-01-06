package com.test.question;

import java.util.Scanner;

public class Q011 {

	public static void main(String[] args) {
		String result = "";
		Scanner sc =new Scanner(System.in);
		System.out.println("첫번쨰 숫자를 입력하시오.: ");
		int n1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하시오.: ");
		int n2 = sc.nextInt();
		
		result = add(n1, n2); 
		System.out.println(result);

		result = subtract(n1, n2);
		System.out.println(result);

		result = multiply(n1, n2);
		System.out.println(result);

		result = divide(n1, n2);
		System.out.println(result);

		result = mod(n1, n2);
		System.out.println(result);
		
		sc.close();
	}

	private static String mod(int n1, int n2) {
		double sum;
		sum = n1 % n2;
		String str  = n1 + " % " + n2 + " = " + sum;
		return str;
	}

	private static String divide(int n1, int n2) {
		double sum;
		sum = n1 / n2;
		String str  = n1 + " / " + n2 + " = " + sum;
		return str;
	}

	private static String multiply(int n1, int n2) {
		int sum;
		sum = n1 * n2;
		String str  = n1 + " x " + n2 + " = " + sum;
		return str;
	}

	private static String subtract(int n1, int n2) {
		int sum;
		sum = n1 - n2;
		String str  = n1 + " - " + n2 + " = " + sum;
		return str;
	}

	private static String add(int n1, int n2) {
		int sum;
		sum = n1 + n2;
		String str  = n1 + " + " + n2 + " = " + sum;
		return str;
	}

	
}
