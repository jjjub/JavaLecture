package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q023 {
	public static void main(String[] args) {
		int fatherYear, fatherMonth, fatherDate;
		long fatherTime, daughterTime;
		int daugtherYear, daugtherMonth, daugtherDate;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("아빠 생일(년):");
		fatherYear=sc.nextInt();
		System.out.printf("아빠 생일(월):");
		fatherMonth=sc.nextInt();
		System.out.printf("아빠 생일(일):");
		fatherDate=sc.nextInt();
		System.out.printf("딸 생일(년):");
		daugtherYear=sc.nextInt();
		System.out.printf("딸 생일(월):");
		daugtherMonth=sc.nextInt();
		System.out.printf("딸 생일(일):");
		daugtherDate=sc.nextInt();
		
		Calendar fatherBirth = Calendar.getInstance();
		fatherBirth.set(fatherYear, fatherMonth, fatherDate);
		
		Calendar daugtherBirth = Calendar.getInstance();
		daugtherBirth.set(daugtherYear, daugtherMonth, daugtherDate);
		
		fatherTime = fatherBirth.getTimeInMillis();
		daughterTime = daugtherBirth.getTimeInMillis();
		
		System.out.printf("아빠는 딸보다 총 %,d일을 더 살았습니다.", (daughterTime - fatherTime) / 1000 / 60 / 60 /24);
		sc.close();
	}
}
