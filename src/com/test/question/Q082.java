package com.test.question;

import java.util.Scanner;

public class Q082 {

	public static void main(String[] args) {

		String txt = "";
		String result = "";
		int sum = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자: ");
		txt = sc.nextLine();
		
		for(int i=0; i<txt.length(); i++) {
			sum += txt.charAt(i) - 48;
			if(i==0) {
			result += txt.charAt(i);
			}else {
				result += "+"+txt.charAt(i);
			}
		}
		System.out.printf("%s = %d", result, sum);
		sc.close();
	}

}
