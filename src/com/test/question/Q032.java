package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q032 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("들어온 시간: ");
		System.out.print("시: ");
		int inHour = sc.nextInt();
		System.out.print("분: ");
		int inMinute = sc.nextInt();
		
		System.out.println("들어온 시간:");
		System.out.print("시:");
		int outHour = sc.nextInt();
		System.out.print("분:");
		int outMinute = sc.nextInt();
		
		Calendar in = Calendar.getInstance();
		in.set(Calendar.HOUR_OF_DAY, inHour);
		in.set(Calendar.MINUTE, inMinute);
		
		Calendar out = Calendar.getInstance();
		out.set(Calendar.HOUR_OF_DAY, outHour);
		out.set(Calendar.MINUTE, outMinute);
		
		long time = out.getTimeInMillis() - in.getTimeInMillis();
		long charge = (((time / 1000 / 60) - 30 ) / 10) * 2000; 
		
		System.out.printf("주차 요금은 %,d원입니다.", charge);
		sc.close();
	}
}
