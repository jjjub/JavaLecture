package com.test.java;

public class Ex02_Variable {
	
	public static void main(String[] args) {
		
		int kor;
		kor = 100;
		System.out.println(kor);
		byte eng;
		eng = 90;
		System.out.println(eng);
		eng = 95;
		System.out.println(200);
		
		// 수학 점수 > 80
		byte math;
		math = 80;
		System.out.println(math);
		int n1; // 선언 > 선언 직후 > 비어있는 상태 >null
		n1 = 100; //초기화
		int n2 = 200; //선언 + 초기화
		int n3;
		int n4;
		int n5, n6;
		int n15, n16=10, n17, n18, n19= 20;
		
		//지도 좌표
		double x1; //우리집의 x좌표
		double y1; //우리집의 y좌표
		
		double x2, y2; // 친구집의 x,y좌표
		
		double x3, //마트 x좌표
			   y3; //마트 y좌표
		
		//학교 x좌표
		double x4;
		//학교 y좌표
		double y4;
		// 변수는 값을 가지고 있지 않은 상태에서는 어느 용도로든 사용이 불가능하다.
		int m;
		m=19;
		System.out.println(m);
		
		final double pi = 3.14;
		
	}
}
