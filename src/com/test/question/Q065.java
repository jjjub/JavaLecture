package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q065 {

	public static void main(String[] args) {

		int max = 0;
		int min = 0;
		int[] og = new int[20];
		
		int num;

		Scanner sc = new Scanner(System.in);
		System.out.print("최대 범위: ");
		max = sc.nextInt();
		System.out.print("최소 범위: ");
		min = sc.nextInt();
		int[] result = new int[20];
		
		for (int i = 0; i < 20; i++) {
			num = (int) (Math.random() * 20) + 1;	
			og[i] = num;							//ok
			if (num <= max && num >= min) {
				result[i] = num;
			}
		}
		System.out.println("원본: " + Arrays.toString(og));
		System.out.println("결과: " + Arrays.toString(result));

	}

}
