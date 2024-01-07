package com.test.question;

import java.util.Scanner;

public class Q025 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int big = 0, small =0;
		System.out.print("첫번째 숫자: ");
		int n1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int n2 = sc.nextInt();
		
		if(n1 > n2) {
			big = n1; 
			small = n2;
			System.out.printf("큰수는 %d이고, 작은수는 %d입니다. 두 숫자의 %d(가)이 차이납니다.", big, small, big - small);
		}else if(n1 < n2) {
			big = n2;
			small = n1;
			System.out.printf("큰수는 %d이고, 작은수는 %d입니다. 두 숫자의 %d(가)이 차이납니다.", big, small, big - small);
		}else {
			System.out.println("두 숫자는 동일합니다.");
		}
	
		
		
		
		
		sc.close();
	}
}
