package com.test.java;

public class Ex19_Method {

	public static void main(String[] args) {
		
//		m1();
		//요구사항) 팩토리얼 메서드를 구현하시오.
		int n = 4;
		int result = factorial(n);
		printFactorial(n, result);
		
		
		printNumber();
		m2();
		m3(n);
		result = m4(4);
	}


	private static int m4(int i) {
		// TODO Auto-generated method stub
		return 0;
	}


	private static void m3(int n) {
		// TODO Auto-generated method stub
		
	}


	private static void m2() {
		// TODO Auto-generated method stub
		
	}


	private static void printFactorial(int n, int result) {
		System.out.printf("%d! = %d\n", n, result);
	}


	private static void printNumber() {
		System.out.println("하나");
		System.out.println("둘");
		System.out.println("셋");
	}
	
	
	public static void m1() { //재귀 메서드
		System.out.println("메서드1");
		m1(); // 재귀 호출
	}
	
	public static int factorial(int n) {
		
		return (n == 1) ? 1 : n*factorial(n - 1); 
	}

}
