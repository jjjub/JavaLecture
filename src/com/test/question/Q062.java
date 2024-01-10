package com.test.question;

import java.util.Scanner;


public class Q062 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수: ");
		int student = sc.nextInt();
		String[] name = new String[student];
		for(int i=0; i<student; i++) {
			System.out.printf("학생명: ");
			name[i] = sc.next();
		}
		
		System.out.printf("입력한 학생은 총 %d명 입니다.\n", student);
		for(int j=0; j<student; j++) {
			System.out.printf("%d. %s\n", j+1, name[j]);
		}
			


	}

}
