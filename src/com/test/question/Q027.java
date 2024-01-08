package com.test.question;

import java.util.Scanner;

public class Q027 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 : ");
		String c1 = sc.next();
		
		if( c1.equals("F") || c1.equals("f")) {
			System.out.println("Father");
		}else if(c1.equals("M") || c1.equals("m")) {
			System.out.println("Mother");
		}else if(c1.equals("S") || c1.equals("s")) {
			System.out.println("Sister");
		}else if(c1.equals("B") || c1.equals("b")) {
			System.out.println("Brother");
		}else {
			System.out.println("입력한 문자가 올바르지 않습니다.");
		}
		sc.close();
				

	}

}
