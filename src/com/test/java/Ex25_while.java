package com.test.java;

public class Ex25_while {

	public static void main(String[] args) {
		
		
		/*
		 
		 	while문, do while문
		 	if문을 계속해서 반복하는 느낌
		 	if(조건식){
		 		구현부;
		 	}
		 	
		 	while(조건식){
		 		구현부;
		 	}
		 
		 */
		m1();
	}

	private static void m1() {
		// 요구사항)1~10까지 출력하시오.
		for(int i=1; i<=10; i++) {	//초기식; 조건식; 증감식;
			System.out.println(i);
		}
		System.out.println();
		
		int num = 1;
		while(num <= 10) { //조건식
			System.out.println(num);
			num++;
		}
		
		
	}
	
	

}
