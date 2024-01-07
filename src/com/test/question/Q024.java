package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q024 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("음식을 받기 워하는 시각");
		System.out.print("시: ");
		int hour = sc.nextInt();
		System.out.print("분: ");
		int minute = sc.nextInt();
		
		Calendar now = Calendar.getInstance();
		now.set(Calendar.HOUR_OF_DAY, hour);
		now.set(Calendar.MINUTE, minute);
		
		now.add(Calendar.MINUTE, -10);
		System.out.printf("짜장면 : %d시 %d분\n", now.get(Calendar.HOUR_OF_DAY), now.get(Calendar.MINUTE));
		
		now.add(Calendar.MINUTE, -8);
		System.out.printf("치킨 : %d시 %d분\n", now.get(Calendar.HOUR_OF_DAY), now.get(Calendar.MINUTE));
		
		now.add(Calendar.MINUTE, -7);
		System.out.printf("피자 : %d시 %d분\n", now.get(Calendar.HOUR_OF_DAY), now.get(Calendar.MINUTE));
	}

}
