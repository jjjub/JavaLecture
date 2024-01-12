package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q067 {
//못함
	public static void main(String[] args) {
		int list[] = { 5, 6, 1, 3, 2, 8, 7, 4, 10, 9 };
		String result = "";
		Scanner sc = new Scanner(System.in);

		System.out.print("삽입 위치: ");
		int index = sc.nextInt();
		System.out.print("값: ");
		int value = sc.nextInt();

		for (int i = list.length -1; i < index; i--) {
			list[i] = list[i + 1];
		}
		list[index] = value;

		for (int j = list.length; j < index; j++) {
			if (j == 1) {
				result += "[" + list[j];
			} else {
				result += "," + result;

			}
			result +="]";
		}
		sc.close();
		System.out.println("원본 :" + Arrays.toString(list));
		System.out.println("결과" + result);

	}

}
