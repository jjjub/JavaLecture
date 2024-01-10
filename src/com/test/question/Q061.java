package com.test.question;

import java.util.Scanner;

public class Q061 {

	public static void main(String[] args) {
		int[] nums = new int[5];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<nums.length; i++) {
			System.out.print("숫자 :");
			nums[i] = sc.nextInt();
		}
		for(int j=nums.length-1; j>=0; j--) {
			System.out.printf("nums[%d] = %d\n", j, nums[j]);
		}
		sc.close();
	}

}
