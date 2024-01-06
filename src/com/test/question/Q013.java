package com.test.question;

import java.util.Scanner;

public class Q013 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 :");
		int kor = sc.nextInt();
		System.out.print("영어 :");
		int eng = sc.nextInt();
		System.out.print("수학 :");
		int math = sc.nextInt();
		getResult(kor, eng, math);

	}

	private static String getResult(int kor, int eng, int math) {
		if (getAvg(kor, eng, math) < 60) {
			
		}
		return null;
		// TODO Auto-generated method stub
		
	}

	private static double getAvg(int kor, int eng, int math) {
		double avg = (kor + eng + math)/3;
		return avg;
		
	}

}
