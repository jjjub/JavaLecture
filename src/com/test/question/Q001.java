package com.test.question;

import java.util.Scanner;

public class Q001 {

	public static void main(String[] args) {
		
		//문제 1.
		Scanner scanner = new Scanner(System.in);
		int age;
		System.out.print("당신의 태어난 해: ");	//레벨출력
		int birth=scanner.nextInt();	//사용자로부터 입력받음
		
		age = 2024 - birth; //연산(현재 해 - 사용자가 태어난 해)
		System.out.printf("나이 : %d", age); // 결과 출력
		
		scanner.close();
	}
}
