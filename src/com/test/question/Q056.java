package com.test.question;

import java.util.Scanner;

public class Q056 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result1 = "";
		String result2 = "";
		String same = "";
		System.out.print("첫번째 숫자: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int num2 = sc.nextInt();
		

		result1 = getMeasure(num1);	//약수 문자열
		result2 = getMeasure(num2);	
		
		for (int i = 1; i <= ((num1 > num2) ? num1 : num2); i++) {	//1~ num1과num2중 더 큰수만큼 반복
			if (num1 % i == 0 && num2 % i == 0) {	//i로 num1과num2 모두 나머지가 0이면
				if (i == 1) { 	//문자열에 담기
					same += i;
				} else { // 나머지 수는 ,포함
					same += ", " + i;
				}
			}
		}
		
		System.out.printf("%d의 약수 : %s", num1, result1);
		System.out.println();
		System.out.printf("%d의 약수 : %s", num2, result2);
		System.out.println();
		System.out.printf("%d와 %d의 공약수 : %s", num1, num2, same);
		
	}

	private static String getMeasure(int num) {
		String measure = ""; // 약수를 담기 위한 문자열
		for (int i = 1; i <= num; i++) { // 약수만큼 반복
			if (num % i == 0) {
				if (i == 1) { // 첫번째수는 , 생략
					measure += i;
				} else { // 나머지수는 ,포함
					measure += ", " + i;
				}
			}
		}
		return measure; // 약수 문자열 리턴
	}

}
