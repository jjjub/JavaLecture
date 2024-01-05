package com.test.question;

import java.util.Scanner;

public class Q002 {
	public static void main(String[] args) {
		//스캐너 생성
		Scanner scanner = new Scanner(System.in);
		
		//라벨 출력
		System.out.println("너비를 입력하시오. : ");
		//값 받기
		int width = scanner.nextInt();
		System.out.println("높이를 입력하시오. : ");
		int height = scanner.nextInt();
		
		//연산
		int area = width*height;
		int round = width*2+height*2;
		System.out.printf("사각형의 넓이는 : %d입니다.",area);
		System.out.printf("사각형의 둘레는 : %d입니다.",round);
		scanner.close();
				
	}
}
