package com.test.question;

import java.util.Scanner;

public class Q086 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String result ="";
		System.out.print("숫자 :");
		String num = sc.nextLine();
		
		for(int i=num.length(); i>=3; i--) {
			result = "," + num.substring(num.length()-3, num.length());	
			
			
		}
		System.out.println(result);

	}

}
