package com.test.question;

import java.util.Scanner;

public class Q003 {

	public static void main(String[] args) {
		float celsius, fahrenheit;
		Scanner scanner = new Scanner(System.in);
		System.out.print("섭씨(℃): ");
		celsius = scanner.nextFloat();
		fahrenheit = 9/5F * celsius + 32F;
		
		System.out.printf("섭씨 %.1f℃는 화씨 %.1f℉입니다.", celsius, fahrenheit);
		
		scanner.close();

	}

}
