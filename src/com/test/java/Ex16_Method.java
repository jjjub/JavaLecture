package com.test.java;

public class Ex16_Method {

	public static void main(String[] args) {
		
		
	//public static void hello()
	//void > 반환타입
	//hello > 메서드명 > 메서드명은 캐멀 표기법
	//() > 인자리스트
		int num = test();
		System.out.println(CheckNumber(9));
		getNum();

	}
	
	public static void getName() {
		String name = "홍길동";
		return; //빈 리턴문 > 강제로 메서드 종료
	}
	
	public static int getNum() {
		int num = 100;
		System.out.println("메서드 종료");
		return num;
		
		
	}
	
	
	public static String CheckNumber(int num) {
		return num % 2 == 0 ? "짝수" : "홀수";
	}
	
	public static int test() {
		
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
		
		
	}
}
