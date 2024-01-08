package com.test.question;

public class Q041 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while(sum <= 1000) {
			sum += i;
			System.out.printf("%d +", i);
			i++;
		}
		System.out.printf("\b\b= %d", sum);

	}

}
