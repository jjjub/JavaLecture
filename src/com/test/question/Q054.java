package com.test.question;

public class Q054 {

	public static void main(String[] args) {
		int i, j;
		for (i = 2; i <= 100; i++) {	//2 ~ 100까지 검사
			int count = 0;	//count = 나누어 떨지는 횟수
			for (j = 1; j <= i; j++) { //대상의 수만큼 반복
				if (i % j == 0) {	//만약 나누어 떨어지면
					count++;		// 카운트 증가
				}
			}
			if (count == 2) {	//나누어 떨어진 횟수가 2라면 소수
				System.out.print(i + ",");	//출력 "숫자, "
			}
		}
	}
}
