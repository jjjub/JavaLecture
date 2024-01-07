package com.test.question;

import java.util.Scanner;

public class Q031 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력:");
		int n1 = sc.nextInt();
		System.out.print("숫자 입력:");
		int n2 = sc.nextInt();
		System.out.print("숫자 입력:");
		int n3 = sc.nextInt();
		System.out.print("숫자 입력:");
		int n4 = sc.nextInt();
		System.out.print("숫자 입력:");
		int n5 = sc.nextInt();
		
		int even = 0;
		int odd = 0;
		
		if( n1 % 2 == 0) {
			even += 1;
		} else { 
			odd += 1;
		}
		
		if( n2 % 2 == 0) {
			even += 1;
		} else { 
			odd += 1;
		}
		
		if( n3 % 2 == 0) {
			even += 1;
		} else { 
			odd += 1;
		}
		
		if( n4 % 2 == 0) {
			even += 1;
		} else { 
			odd += 1;
		}
		
		if( n5 % 2 == 0) {
			even += 1;
		} else { 
			odd += 1;
		}
	
		
		System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.\n", even, odd);
		System.out.printf("홀수가 짝수보다 %d개 더 많습니다.", odd - even);
		sc.close();
	}

}
