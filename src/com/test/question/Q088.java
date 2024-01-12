package com.test.question;

import java.util.Scanner;

public class Q088 {

	public static void main(String[] args) {
		String[] warn = {"바보", "멍청이"};
		int index =0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력: ");
		String input = sc.nextLine();
		
		for(int i=0; i<=input.length(); i++) {	//금지어 찾기
			//TODO 불린으로 바꿔달래
			while(input.indexOf(warn[i],index) > -1) {
				count++;
				index = warn.length+i;
			}
		}
		for (int i =0; i<warn.length; i++) {
			input = input.replace(warn[i], getMakedTest(warn[i]));
		}
		System.out.println(input);
		System.out.printf("금지어를 %d회 마스킹했습니다.", count);
	}

	private static String getMakedTest(String warn) {
		String masking = "";
		for(int i=0; i<warn.length(); i++) {
			masking += "*";
		}
		return masking;
	}

}
