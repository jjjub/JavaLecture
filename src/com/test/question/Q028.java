package com.test.question;

import java.util.Scanner;

public class Q028 {

	public static void main(String[] args) {
	
		Scanner sc =  new Scanner(System.in);
		System.out.print("근무 년수:");
		int year = sc.nextInt();
		
		if(year > 0) {
			if(year <5) {
				System.out.printf("%d년차 초급 개발자입니다.\n", year);
				System.out.printf("앞으로 %d년 더 근무하면 중급 개발자입니다.", 5 - year);
			}else if(year < 10) {
				System.out.printf("%d년차 중급 개발자입니다.\n", year);
				System.out.printf("당신은 %d년전까지 초급 개발자였습니다.\n", year - 4);
				System.out.printf("앞으로 %d년더 근무하면 중급 개발자입니다.", 10 - year);
			}else if(year >= 10) {
				System.out.printf("%d년차 고급 개발자입니다.\n", year);
				System.out.printf("당신은 %d년전까지 초급 개발자였습니다.", year - 9);
			}
		}else {
			System.out.println("입력한 값이 올바르지 않습니다. 1이상의 값을 입력하시오.");
		}
		sc.close();

	}

}
