package com.test.question;

import java.util.Scanner;

public class Q002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//사용자로부터 숫자 2개를 입력 받는다.
		System.out.print("첫번쨰 숫자: ");
		int n1 = sc.nextInt();
		System.out.print("두번쨰 숫자: ");
		int n2 = sc.nextInt();
		
		int resultPlus = n1 +n2; //덧셈연산
		int resultMinus = n1 - n2; //빼기연산
		int resultMultiply = n1 * n2; //곱하기연산
		double resultDivide = (double)n1 / n2; //나누기연산
		int resultRemainder = n1 % n2; // 나머지연산
		System.out.printf("%d + %d = %d \n", n1, n2, resultPlus); //덧셈연산 출력
		System.out.printf("%d - %d = %d \n", n1, n2, resultMinus); //뺴기연산 출력
		System.out.printf("%d * %d = %d \n", n1, n2, resultMultiply); //곱하기연산 출력
		System.out.printf("%d / %d = %.1f \n", n1, n2, resultDivide); //나누기연산 출력
		System.out.printf("%d %% %d = %d \n", n1, n2, resultRemainder); //나머지연산 출력
		
		sc.close(); //스캐너 종료
	}
	
}
