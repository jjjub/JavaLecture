package com.test.question;

public class Q057 {

	public static void main(String[] args) {
		for(int i=1; i<=100; i+=10) {
			int sum=0;
			for(int j=1; j<=i+9; j++) {
				sum+=j;
			}
			System.out.printf("1 ~ %3d: %5d\n", i, sum);
		}

	}

}
