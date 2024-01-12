package com.test.question;

public class Q055 {

	public static void main(String[] args) {

		for (int j = 2; j <= 100; j++) {
			int sum = 0;
			String measure = ""; // 약수들을 담기 위한 문자열

			for (int i = 1; i < j; i++) { // 수-1만큼 반복
				if (j % i == 0) {
					measure += i + ",";
					sum += i;
				}
			}
			if (sum == j) {
				System.out.printf("%d = [%s]\n", j, measure);
				sum = 0;

			}
		}

	}// main

}
