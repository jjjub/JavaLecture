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
		String result ="";
		for(int i=start; i<=last; i++) {
			
			sum += i;
			result += i;
			if(i <last) {
				result += "+";
			}
			
		}
		System.out.println(result + " = " + sum);
	}

}

