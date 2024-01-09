package com.test.question;

public class Q053 {
	public static void main(String[] args) {
		int i, j;
		getMultiplication(i = 2, j = 5); //2단 ~ 5단
		System.out.println();
		System.out.println();
		getMultiplication(i = 6, j = 9); //6단 ~ 9단
	}// main

	private static void getMultiplication(int i, int j) {
		int k, m;
		for (k = 1; k <= 9; k++) {	
			int count = 0;	// 한행에 4번 연산하기 위한 카운트
			for (m = i; m <= j; m++) {
				System.out.printf("%2d x %2d = %2d   ", m, k, m * k); //출력 숫자 x 숫자 = 숫자 %2d = 정렬
				count += 1;	// 출력 후 카운트 누적
				if (count == 4) {	//누적 카운트 = 4가 되면 다음 줄로 이동
					System.out.println();
				}
			}
		}
	}
}

