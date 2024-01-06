package com.test.java;

import java.util.Calendar;
import java.util.Scanner;

public class Q021 {

	public static void main(String[] args) {
		int age;
		int year = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("태어난 년도 :");
		year = sc.nextInt();
		
		Calendar now = Calendar.getInstance();
		age = now.get(Calendar.YEAR) - year +1;
		System.out.printf("나이 : %d세", age);
		sc.close();
	}

}
