package com.test.question;

import java.util.Scanner;

public class Q043 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int random = (int) (Math.random() * 10) + 1; // 1~10사이
		int i;
		System.out.println("컴퓨터가 1~10 사이의 숫자를 1개 생각했습니다.");

		Scanner sc = new Scanner(System.in);

		for (i = 1; i <= 10; i++) {
			System.out.print("숫자: ");
			int clientNum = sc.nextInt();
			if (clientNum == random) {
				System.out.println("맞았습니다.");
				System.out.println();
				break;
			} else {
				System.out.println("틀렸습니다.");
			}

		}
		System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.\n", random);

		if (i > 10) {
			System.out.println("모든 기회를 실패했습니다.");
		} else {
			System.out.printf("정답을 맞추는데 시도한 횟수는 %d회입니다.\n", i);
		}
		System.out.println();
		System.out.println("프로그램을 종료합니다.");
	}
}
