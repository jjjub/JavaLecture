package com.test.question;

import java.util.Scanner;

public class Q004 {

	public static void main(String[] args) {
		double length;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("사용자가 페달을 밟은 횟수: ");
		int cycle = scanner.nextInt();
		length = cycle * (2 * 3.14 * 0.3302);
		
		System.out.printf("사용자가 총 %,d회 페달을 밟아 자전거가 총 %,.2fm를 달렸습니다.", cycle, length);

	}

}
