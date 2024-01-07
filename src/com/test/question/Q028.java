package com.test.question;

import java.util.Scanner;

public class Q028 {

	public static void main(String[] args) {
		String oper = "";
		Scanner sc =  new Scanner(System.in);
		System.out.print("첫번째 숫자:");
		int n1 = sc.nextInt();
		System.out.print("두번째 숫자:");
		int n2 = sc.nextInt();
		System.out.print("연산자:");
		oper = sc.next();
		
		if (oper == "+") {
			System.out.printf("%d + %d = %d", n1,n2, n1+n2);
		}else if(oper == "-") {
			System.out.printf("%d - %d = %d", n1,n2,n1-n2);
		}else if (oper == "*") {
			System.out.printf("%d x %d = %d", n1,n2,n1*n2);
		}else if (oper == "/") {
			System.out.printf("%d / %d = %0.1d", n1, n2, (double)n1/n2);
		}else if (oper == "%") {
			System.out.printf("%d / %d = %d", n1, n2, n1 % n2);
		}else {
			System.out.println("연산이 불가능합니다.");
		}
		sc.close();

	}

}
