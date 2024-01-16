package com.test.question;

public class Q075 {

	public static void main(String[] args) {
		int[][] list = new int[5][5];
		int num = 0;
		
		for(int i=0; i<list.length-1; i++) {
			for(int j=0; j<list.length-1; j++) {
				
				
				list[i][j] = num;
				list[i][4] += num;
				list[4][j] += num;	
				list[4][4] += num;
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
