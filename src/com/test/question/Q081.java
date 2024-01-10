package com.test.question;

import java.util.Scanner;

public class Q081 {

	public static void main(String[] args) {
		String email ="";
		int index;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이메일: ");
		email = sc.next();
		
		index =email.indexOf("@");
		
		System.out.println("아이디" + email.substring(0, index));
		System.out.println("도메인" + email.substring(index+1));
		sc.close();
	}

}
