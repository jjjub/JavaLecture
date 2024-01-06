package com.test.question;

import java.util.Scanner;

public class Q015 {

	public static void main(String[] args) {
		int apple;
		Scanner sc = new Scanner(System.in);
		System.out.print("맑은 날: ");
		int sunny = sc.nextInt();
		System.out.println("흐린 날: ");
		int foggy = sc.nextInt();
		apple = getApple(sunny, foggy);
		System.out.printf("사과가 총 %d개 열렸습니다.", apple);
	}

	private static int getApple(int sunny, int foggy) {
		int length;
		int apple;
		length = sunny * 5 + foggy * 2;
		if(length > 100) {
			apple = (length - 100)/10;
		}else {
			apple = 0;
		}
		return apple;
	}

}
