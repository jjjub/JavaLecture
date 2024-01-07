package com.test.question;

import java.util.Scanner;

public class Q027 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 : ");
		String c1 = sc.next();
		
		if( c1 == "F" || c1 == "f") {
			System.out.println("Father");
		}else if( c1 == "M" || c1 == "m") {
			System.out.println("Mother");
		}else if(c1 == "S" || c1 == "s") {
			System.out.println("Sister");
		}else if(c1 == "B" || c1 == "b") {
			System.out.println("Brother");
		}else {
			System.out.println("입력한 문자가 올바르지 않습니다.");
		}
		sc.close();
				

	}

}
