package com.test.question;

public class Q072 {

	public static void main(String[] args) {
		int[][] list = new int[5][5];
		int num = 1;
		
		for (int i = 0; i<list.length; i++) {
			for (int j = 0; j<list[0].length; j++) {
				list[j][i] = num;
				num++;
			}
		}
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[0].length; j++) {
				System.out.printf("%d\t", list[i][j]);
			}
			System.out.println();
		}
	}
}
