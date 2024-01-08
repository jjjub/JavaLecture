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
		System.out.printf( "%s입니다.", getResult(kor, eng, math));

	}
	
	//시험 결과계산 메서드
	private static String getResult(int kor, int eng, int math) {
		String result;
		if (avg(kor, eng, math) < 60 || kor < 40 || eng < 40 || math <40) {
			result ="불합격";
		}else {
			result ="합격";
		}
		return result; //결과값 반환
	}

	// 평균 구하는 메서드
	private static double avg(int kor, int eng, int math) {
		double avg = (kor + eng + math)/3;
		return avg;
		
	}

}
