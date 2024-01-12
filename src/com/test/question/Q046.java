package com.test.question;

import java.util.Scanner;

public class Q046 {

	public static void main(String[] args) {
		int num = 0;
		int i;
		String result = "";
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < 10; i++) {
			System.out.print("숫자 :");
			num = sc.nextInt();
			result += getKorean(num);
		}
		System.out.println(result);
		sc.close();

	}

	private static String getKorean(int num) {
		String korean = "";
		switch (num) {
		case 1:
			korean= "일";
			break;
		case 2:
			korean= "이";
			break;
		case 3:
			korean= "삼";
			break;
		case 4:
			korean= "사";
			break;
		case 5:
			korean= "오";
			break;

		case 6:
			korean= "육";
			break;

		case 7:
			korean= "칠";
			break;

		case 8:
			korean= "팔";
			break;

		case 9:
			korean= "구";
			break;

		}
		return korean;

	}

}
