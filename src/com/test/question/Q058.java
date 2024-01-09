package com.test.question;

public class Q058 {

	public static void main(String[] args) {
		for(int i=1; i<=100; i+=10) {
			int sum=0;
			for(int j=i; j<=i+9; j++) {
				sum+=j;
			}
			System.out.printf("%d ~ %3d: %5d\n", i,  i+9, sum);
		}

	}
	

}

