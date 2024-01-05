package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex21_if {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * 
		 * if (조건식){ 
		 * 	문장 
		 * }
		 * 
		 * if (조건식){
		 *  문장; 
		 * } else{
		 * 
		 *  문장 
		 * }
		 * 
		 * if (조건식){ 문장; } else if(조건{ 문장 }
		 * 
		 * 
		 * 
		 * if(조건식){
		 *  문장;
		 * } else if(조건식){
		 *  문장;
		 * } else{
		 * 	문장
		 * }
		 * 
		 * 
		 * 
		 * 
		 */
		//m1();
//		m2();
//		m3();
//		m4();
		m5();
	}

	
	
	private static void m5() throws NumberFormatException, IOException {
		// 성적(0~100) 입력 > 합격/불합격
		// 유효성 검사
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("성적 :");
		
		int score =Integer.parseInt(reader.readLine());
		
		//1. 합격
		//2. 불합격
		// -----------분리-----------
		//3. 잘못 입력(유효성)
		
		if (score >= 60 && score <=100) {
			System.out.println("합격");
		} else if (score >= 0  && score < 60) {
			System.out.println("불합격");
		} else {
			System.out.println("점수는 0~100 이내로 입력하세요.");
		}
		
		
		
		if(score >= 0 && score <= 100) { //중첩if문
			if (score >= 60) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
		} else {
			System.out.println("점수는 0~100 이내로 입력하세요.");
		}
		
		
		
	}



	private static void m4() throws IOException {
		// 심리 테스트
		int sum = 0; //누적 변수
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("1. 어떤 개발툴을 선호합니까?");
		System.out.println("a. 메모장");	//+1
		System.out.println("b. 이클립스");//+3
		System.out.println("c. 인텔리제이");//+5
		System.out.print("선택:");
		
		String seq = reader.readLine();
		
		if(seq.equals("a")) {
			sum = 1;
		}else if (seq.equals("b")) {
			sum = 3;
		}else if(seq.equals("c")) {
			sum =5;
		}
		
		
		System.out.println("2. 어떤 프로그래밍 언어을 선호합니까?");
		System.out.println("a. Java");	//+7
		System.out.println("b. C#");//+3
		System.out.println("c. Kotlin");//+2
		System.out.print("선택:");
		
		
		seq = reader.readLine();

		if (seq.equals("a")) {
			sum += 7;
		} else if (seq.equals("b")) {
			sum += 3;
		} else if (seq.equals("c")) {
			sum += 2;
		}
		
		
		
		System.out.println("3. 하루에 얼마나 코딩을 합니까?");
		System.out.println("a. 4시간");	//+7
		System.out.println("b. 2시간");//+3
		System.out.println("c. 1시간");//+2
		System.out.print("선택:");
		
		
		seq = reader.readLine();

		if (seq.equals("a")) {
			sum += 7;
		} else if (seq.equals("b")) {
			sum += 3;
		} else if (seq.equals("c")) {
			sum += 2;
		}
		
		System.out.println("설문이 완료되었습니다.");
		System.out.println("[결과]");
		
		if(sum >10) {
			System.out.println("당신은 개발자의 자질이 있습니다.");
		} else if(sum >6) {
			System.out.println("개발자가 되려면 조금 더 노력하세요.");
		} else {
			System.out.println("다른거 하세요.");
		}
	}



	private static void m3() throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("기상 시간(시): ");
		int hour =Integer.parseInt(reader.readLine());
		
		if(hour < 6) {
			System.out.println("지하철을 타고 출근한다.");
		} else if (hour >6 && hour <7) {
			System.out.println("버스를 타고 출근한다.");
		} else if(hour >= 7 && hour <8) {
			System.out.println("택시를 타고 출근한다.");
		} else {
			System.out.println("병가를 낸다.");
		}
		
		
		if(hour < 6) {
			System.out.println("지하철을 타고 출근한다.");
		} else if (hour <7) {   //위에서 물어본 중복내용 생략가능 hour>=6
			System.out.println("버스를 타고 출근한다.");
		} else if(hour <8) {
			System.out.println("택시를 타고 출근한다.");
		} else {
			System.out.println("병가를 낸다.");
		}
		
		
	}

	
	
	private static void m2() throws NumberFormatException, IOException {
		//나이 입력 판단
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("나이 입력: ");
		
		int age =Integer.parseInt(reader.readLine());
		String result = (age >= 18)? "성인": "미성년자";
		System.out.println(result);
		if(age >= 18) {
			System.out.println("성인");
		}else {
			System.out.println("미성년자");
		}
		
	}

	private static void m1() {
		int num = 0;
		if(num >0) {
			System.out.println("num은 양수입니다.");
		}
		
		if(num >0) {
			System.out.println("num은 양수입니다.");
		} else {
			System.out.println("num은 음수입니다.");
		}
		
		if(num > 0) {
			System.out.println("양수");
		} else if(num <0) {
			System.out.println("음수");
		} else {
		System.out.println("영");
		}
	}






}
