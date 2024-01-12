package com.test.java;

public class Ex17_LocalVariable {
	
	int b = 20; //멤버변수

	public static void main(String[] args) {
		
		int a = 10; //지역 변수
		int num = 100;
		checkNumber(num);
		aaa();

		
		if (num>0) {
			int b =10;
			System.out.println("b : "+b);
		}

	}//main
	
	public static void aaa() {
		int a = 10;
		bbb(a);
	}
	public static void bbb(int a) {
		System.out.println(a);
	}
	
	public static void checkNumber(int num) {
		
	}
	
	public static void test1() {
		int c = 30;
	}
	
	public static void test2() {
		int d = 40;
		int c = 50;
	}
}
