package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ex22_swtich {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 
switch (조건){
    case 값:
        구현부;
        break;
    [case 값:
        구현부;
        break;] x N
    [default:
       	구현부;
        break;] - 생략가능
}
```
		 
		 */
		
//		m1();
//		m2();
//		m3();
		m4();
		//if문 문제 -> switch문 문제
	}

	private static void m4() {
		int num = 10;
		
		if(num > 0) {
			System.out.println("양수");
		}else {
			System.out.println("음수");
		}
		
		//에러
//		switch(num > 0) {
//			case true:
//				System.out.println("양수");
//				break;
//			case false:
//				System.out.println("음수");
//				break;
//		}
	}

	private static void m3() {
		// 요구사항] 사용자 월 입력 > 해당월의 마지막 일?
		int lastDay = 0; //마지막 일
		int month = 5;
		
		// aaa: Label > 코드의 위치를 설명하는 용도 > 표지판
		switch (month) {
			case 1:case 3:case 5:case 7:
			case 8:case 10:case 12:
				lastDay = 31;
				break;
			case 4: case 6: case 9: case 11:
				lastDay = 30;
				break;
			case 2 :
				lastDay = 28;
				break;
		}
		System.out.printf("%d월은 %d일까지 있습니다.\n", month, lastDay);
	}

	private static void m2() throws IOException {
		// 요구사항] 자판기
		// 메뉴출력 > 음료 선택 > 가격출력
		// 가격 변동 > 앞으로 평생 콜라와 사이다의 가격을 동일하게 판매
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("==================");
		System.out.println("      자판기");
		System.out.println("==================");
		System.out.println("1. 콜라");
		System.out.println("2. 사이다");
		System.out.println("3. 박카스");
		System.out.println("===================");
		System.out.print("번호선택: ");
		
		String input = reader.readLine();
		
//		if( input.equals("1")) {
//			System.out.println("700원입니다.");
//		}else if(input.equals("2")) {
//			System.out.println("700원입니다.");
//		}else if(input.equals("3")) {
//			System.out.println("500원입니다.");
//		}else {
//			System.out.println("선택하신 음료는 없습니다.");	//유효성 검사는 else보다 if로 따로 빼서
//		}
		
		if( input.equals("1") || input.equals("2")) {
			System.out.println("700원입니다.");
		}else if(input.equals("3")) {
			System.out.println("500원입니다.");
		}else {
			System.out.println("선택하신 음료는 없습니다.");	//유효성 검사는 else보다 if로 따로 빼서
		}
		
		switch (input) {
			case "1":			
			case "2":
			System.out.println("700원입니다.");
			break;
			case "3":
			System.out.println("500원입니다.");
			break;
			default:
				System.out.println("음료 없음");
				break;
		}
		
	}

	private static void m1() {
		//요구사항] 숫자를 1개 입력받아 한글로 출력하시오.
		//1 > "하나"
		//2 > "둘"
		
		int num = 1;
		
		if (num == 1) {
			System.out.println("하나");
		}else if (num == 2) {
			System.out.println("둘");
		}else if (num == 3) {
			System.out.println("셋");
		}
		
		switch (num) {
			case 1:
				System.out.println("하나");
				break;
			case 2:
				System.out.println("둘");
				break;
			case 3:
				System.out.println("셋");
				break;
		}
		
	}

}
