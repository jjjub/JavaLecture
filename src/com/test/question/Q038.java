package com.test.question;

import java.util.Scanner;

public class Q038 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int odd = 0, even = 0;
		int countOdd = 0, countEven = 0;
		System.out.print("입력 횟수: ");
		int num = sc.nextInt();
		for(int i=0; i < num; i++){
			System.out.print("숫자: ");
			int n1 = sc.nextInt();
			if(n1 % 2 == 0) {
				even += n1;
				countEven++;
			}else {
				odd += n1;
				countOdd++;
			}
		
		}
		System.out.printf("짝수 %d개의 합: %d\n", countEven, even);
		System.out.printf("홀수 %d개의 합: %d\n", countOdd, odd);
	}//main


}
