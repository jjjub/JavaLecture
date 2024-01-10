package com.test.question;

import java.util.Scanner;

public class Q080 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String txt ="";
		System.out.print("문장 입력: ");
		txt = sc.nextLine();
		
		
		System.out.print("역순결과: ");
		for(int i=txt.length()-1; i>=0; i--) {
			System.out.print(txt.charAt(i));
		}
		sc.close();
	}

}
