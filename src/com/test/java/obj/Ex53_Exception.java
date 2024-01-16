package com.test.java.obj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

import com.test.java.Ex08_BufferedReader;

public class Ex53_Exception {

	public static void main(String[] args) {
		/*
		 
		 
		 
		 예외, Exception
		 - 런타임 오류
		 - 컴파일 발견(x) > 실행 중 발견(O)
		 - 개발자 미리 예측 > 사전 조치
		 
		 예외 처리, Exception Handling
		 1. 제어문 사용
		 2. 전용 처리 구문 try catch문
		 
		 
		 
		 */
//		m1();
//		m2();
//		m3();
//		m4();
		//중앙집중식
		//메인에서는 미루기 금지
		try {
//			m5();
//			m6();
		} catch (Exception e) {
			
		}
		m7();
	}

	private static void m7() {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
//		try {
//			System.out.print("입력: ");
//			int input = Integer.parseInt(reader.readLine());
//		} catch (Exception e) {
//			//catch에 뭐라도 좀 넣어
//			System.out.println(3124124);
//		}
		
		try {
			
		} catch (Exception e) {
			System.out.println("Ex53_Exception.m7");
			e.printStackTrace();
		}
		
		System.out.println("종료");
	}

	private static void m6() throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String input = reader.readLine();
	}

	private static void m5() throws Exception{
		
		// 예외 미루기
		// 특정 메서드에서 발생한 예외를 해당 메서드가 직접 처리하지 않고, 그 예외 처리의 책임을 메서드를 호출한 쪽으로 넘기는 기술
		
		int n = 0;
		System.out.println(100 / n);
	}

	private static void m4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자: ");
		int num = sc.nextInt();
		
		
		try {
			//비지니스 코드 영역
			System.out.println(100/num);
			return;
		}catch (Exception e) {
			// 예외처리 영역
			System.out.println("예외처리");
		} finally {
			// 자원 해ㅔ 영역
			// 성공 or 실패 > 무조건 실행하는 영역
			System.out.println("finally");
			sc.close(); //자원 해제 > Clean-Up Code
		}
		
		
	}

	private static void m3() {
	try {
		int num = 10;
		System.out.println(100/num);//throw new ArithmeticException()
		
		int[] nums = {10,20,30};
		System.out.println(nums[0]);//new ArrayIndexOutOfBoundsException()
		
		Random rnd = new Random();
		System.out.println(rnd.nextInt());//new NullPointerException();
		
		Object o = new Object();
		Random temp = (Random)o;
		
		
	}
	
	catch (ArithmeticException  e) {//자식객체 다른 에외객체와 형제 > 다운캐스팅못함
		System.out.println("0으로 나누기 > 김대리 연락");	
		
	}catch (ArrayIndexOutOfBoundsException e) {
		
		System.out.println("배열 첨자 오류 > 박과장 연락");
		
	}catch (NullPointerException e) {
		
		System.out.println("널 참조 > 최대리 연락");
		
	}catch (Exception e) {	//모든 예외객채의 부모객체 > 모드 예외 처리 가능
//		System.out.println(e.getMessage());	//if문의 else역할
//		if(e.getMessage().equals(""))
		System.out.println("에외처리");
	}
		
	}
	private static void m2() {
		
		int num = 0;
		try {
		System.out.println(100/num);
		}catch(Exception e) {
			System.out.println("0으로 나누기 > 김대리 연락");
		}
		
		int[] nums = {10,20,30};
		
		try {
			System.out.println(nums[5]);			
		}catch(Exception e) {
			System.out.println("배열 첨자 오류 > 박과장 연락");
		}
		
		Random rnd = null;
		
		try {
		System.out.println(rnd.nextInt());
		}catch (Exception e) {
			System.out.println("널 참조 > 최대리 연락");
		}
		
	}

	private static void m1() {
		
		//요구사항] 숫자를 입력받아 처리를 하시오.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자: ");
		
		int num = sc.nextInt();
		
		
		//try문 > 감시 >>에러가 발생하는지 계속 검사
		//catch문 > 예외처리
		//예외 조건
		if (num != 0) {
			//비지니스코드(업무코드)
			System.out.printf("100 / %d = %d\n", num, 100/num);

		} else {
			//예외 처리 코드
			System.out.println("0을 입력하지 마시오.");
		}
		
		try {			
			System.out.println(111);
			System.out.printf("100 / %d = %d\n", num, 100/num);
			System.out.println(222);
		}catch(Exception e){		
			//e: 예외 객체
			//발생한 예외에 대한 여러가지 정보를 제공하는 객체
//			System.out.println(e.getMessage());
			e.printStackTrace();
			//예외 처리 코드
			System.out.println("0을 입력하지 마시오.");
		}
		
		
		System.out.println("종료");
		
		
		
	}

}


















