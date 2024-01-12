package com.test.question;

import java.util.Scanner;

public class Q087 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단어:");
		String str = sc.nextLine();

		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char capital = str.charAt(i);

			if (capital >= 'A' && capital <= 'b') {
				result += " ";
			}
			result += capital;
		}
		System.out.println("결과:" + result);
		sc.close();
	}

}
