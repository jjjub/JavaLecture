package com.test.question;

import java.util.Scanner;

public class Q035 {

	public static void main(String[] args) {
		String name = "";
		int time = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		name = sc.next();
		System.out.print("횟수: ");
		time = sc.nextInt();
		
		for(int i=0; i<time; i++) {
			System.out.printf("%s님 안녕하세요~\n", name);
		}
		System.out.println();
		sc.close();
	}

}
