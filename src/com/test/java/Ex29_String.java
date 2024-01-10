package com.test.java;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ex29_String {

	public static void main(String[] args) {
		// 

		/*
		 
		 
		 
		 
		 */
//		m1();
//		m2();
//		m3();
//		m4();
//		m5();
//		m6();
//		m7();
//		m8();
//		m9();
//		m10();
//		m11();
//		m12();
//		m13();
//		m14();
		m15();
		

	}

	private static void m15() {
		// 문자열 분리
		// String[] split(String delimiter)
		String txt = "홍길동|아무개|하하하|호호호|후후후";
		//정규 표현식
		String[] list = txt.split("\\|"); //구분자는 사라짐

		for(int i=0; i<list.length; i++) {
			System.out.println("이름: " + list[i]);
		}
		
		
		
		
		
		
		
		
		
	}

	private static void m14() {
		// 문자열 치환(바꾸기)
		// String replace(String old, String new)
		String txt = "안녕하세요. 홍길동입니다.";
		
		System.out.println(txt.replace("홍길동", "아무개"));
		
		String content = "게시판 글을 씁니다. 바보야!!";
		String word ="바보";
		
		//masking
		System.out.println(content.replaceAll(word, "**"));
		
		txt = "    하나    둘    셋    ";
		System.out.println(txt.trim());
		System.out.println(txt.replace(" ", ""));
		System.out.println(txt.replace("하나", ""));
		
		
		
		
		
	}
	
	
	
	

	private static void m13() {
		
		// 문자열 검색
		// indexOf
		// lastIndexOf
		// boolean contains(String s)
		
		String txt = "안녕하세요. 홍길동입니다.";
		if(txt.indexOf("홍길동") >-1) {
			System.out.println("O");
		}
		
		if(txt.contains("홍길동")) {
			System.out.println("O");
		}


		
		
		
	}

	private static void m12() {
		// 문자열 추출
		// String substring(int beginIndex, int endIndex)
		// String substring(int beginIndex)
		// beginIndex: 포함(inclusive)
		// endIndex: 미포함(exclusive)
		
		String txt = "가나다라마바사아자차카타파하";
		
		System.out.println(txt.substring(3, 7));	//3~7까지의 범위 추출
		System.out.println(txt.substring(3));	//3
		
		System.out.println(txt.charAt(4));	//char > 문자코드값
		System.out.println(txt.substring(4,5));	//String
		System.out.println();
		
		String jumin = "970410-2098765";
		
		//성별
		System.out.println(jumin.charAt(7)=='1' ? "남자" : "여자");
		System.out.println(jumin.substring(7, 8).equals("1")?"남자":"여자");
		
		//몇년생
		System.out.println("" + jumin.charAt(0) + jumin.charAt(1));
		System.out.println(jumin.substring(0,2));
		
		//몇월생
		System.out.println(jumin.substring(2, 4));
		
		//몇일생
		System.out.println(jumin.substring(4, 6));
		System.out.println();
		
		//파일 경로
		String path = "C:\\clss\\code\\java\\Hello.java";
		//1.파일명 추출 > hello.java
		int index = path.lastIndexOf("\\");
		String fileName = path.substring(index + 1);
		System.out.println(fileName);
		
		//2. 파이령 > 확장자 없는 파일명 추출 > Hello
		index = fileName.lastIndexOf(".");
		String filenameWithoutExtension = fileName.substring(0, index);
		System.out.println("순수 파일명: " + filenameWithoutExtension);
		
		//3. 확장자만 추출 > .java
		String extension =fileName.substring(index);
		System.out.println("확장자: " + extension);
		
		
		
		
	}

	private static void m11() {
		// 문자열 검색
		// 문자열내에서 원하는 문자(열)을 검색> 발견된 위치(index) 반환
		
		// int indexOf(char c)
		// int indexOf(String c)
		// int indexOf(char c, int beginIndex)
		// int indexOf(String c, in beginIndex)
		
		// int lastIndexOf(char c)
		// int lastIndexOf(String c)
		// int lastIndexOf(char c, int beginIndex)
		// int lastIndexOf(String c, in beginIndex)
		
		
		String txt = "홍길동 자바 아무개 자바 테스트";
		
		System.err.println(txt.indexOf("자바"));	 //4
		System.err.println(txt.indexOf("자바", 6)); 	//11
		
		System.out.println(txt.lastIndexOf("자바"));
		System.out.println(txt.lastIndexOf("자바",10));
		
		
		
		
		
	}

	private static void m10() {
		// 패턴 검색
		//boolean starsWith(String word)
		//boolean endsWith(Stirng word)
		
		String name = "홍길동";
		
		//이 사람이 '홍'씨?
		System.out.println(name.charAt(0) =='홍');
		System.out.println(name.indexOf('홍') == 0);
		System.out.println(name.startsWith("홍"));
		
		//'동'으로 끝나는지
		System.out.println(name.charAt(name.length()-1) =='동');
		System.out.println(name.indexOf('동') == name.length() -1);
		System.out.println(name.endsWith("동"));
		
		//자원 경로
		String path = "C:\\clss\\code\\java\\Hello.java";
		//위의 자원이 자바 소스 파일인가
		if(path.endsWith(".java")) {
			System.out.println("O");
		}else {
			System.out.println("X");
		}
		
		
	}

	private static void m9() {
		
		//문자열 대소문자 변경
		//String toUpperCase();	대문자로 변경
		//String toLowerCase();	소문자로 변경
		
		String content = "오늘 수업하는 과목은 Java입니다.";
		String word = "java";
		System.out.println(content.toUpperCase());
//		System.out.println(content.toLowerCase());
		System.out.println(word.toUpperCase());
		
		
		//대소문자 구분(Case sensitive)
		//정확도 높음
		//검색율 낮음
		//메서드 체이닝
		//메서드().메서드().메서드().
		//대소문자 구분 X(Case insensitive)
		//검색율 높음
		//정확도 높음
		if(content.toUpperCase().indexOf(word.toUpperCase()) > -1) {
			System.out.println("검색 결과 O");
		}else {
			System.out.println("검색 결과 X");
		}
		
		
	}

	private static void m8() {
		// 게시파 글쓰기 > 금지어!
		String stop = "바보";	//금지어
		String content = "안녕하세요. 저는 자바를 배우는 학생입니다.";
		
		if (content.indexOf(stop) > -1) {
			System.out.println("금지어 금지!");
		}else {
			System.out.println("글쓰기 처리!");
		}
		
		String[] stops = {"바보", "멍청이", "메롱", "ㅂㅏㅂㅗ"};
		
		for(int i=0; i<stops.length; i++) {
			if(content.indexOf(stops[i])>-1) {
				System.out.println("금지어 발견");
				break;
			}
		}
		System.out.println("종료");
	}

	private static void m7() {
		// 문자열 검색
		// 문자열내에서 원하는 문자(열)을 검색> 발견된 위치(index) 반환
		// int indexOf(char c)
		// int indexOf(String c)
		// int indexOf(char c, int beginIndex)
		// int indexOf(String c, in beginIndex)
		
		String txt ="안녕하세요. 홍길동입니다.";
		int index =-1;
		
		index = txt.indexOf('하');	//'하'가 발견된 위치 저장 2
		System.out.println(index);
				
		index = txt.indexOf('홍');	//7
		System.out.println(index);
		
		index = txt.indexOf('강');	//-1
		System.out.println(index); 

		index = txt.indexOf("홍길동");	//7
		System.out.println(index); 
		
		
		txt = "안녕하에요. 홍길동입니다. 반갑습니다. 홍길동입니다. 안녕히가세요. 홍길동입니다.";
		
		index = txt.indexOf("홍길동");
		System.out.println(index); 
		
		index = txt.indexOf("홍길동", index + 3);
		System.out.println(index); 
		
		index = txt.indexOf("홍길동", index + 3);
		System.out.println(index); 
		
		
		
		
		
	
	
	}

	private static void m6() {
		// 문자열 공백 제거
		//String trim()
		//문자열에 존재하는 공백(whitespce > 스페이스, 탭, 개행)을 제거하는 메서드
		//문자열에 시작과 끝에 존재하는 공백 문자를 제거한다.
		String txt = "     하나     둘     셋     ";
		
		System.out.printf("[%s]\n", txt);
		System.out.printf("[%s]\n", txt.trim());
	}

	private static void m5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단어: ");
		String word = sc.nextLine();
		
		if(isValid(word)) {
			System.out.println("소문자 O");
		}else {
			System.out.println("소문자 X");
		}
		
		
	}

	private static boolean isValid(String word) {
		
		for(int i=0; i<word.length(); i++) {
			char c = word.charAt(i);
			if (c < 'a' || c > 'z') {
				return false;
			}
		}
		
		return true;
	}

	private static void m4() {
		// 영어 소문자로만
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단어: ");
		String word = sc.nextLine();
		
		//java
		//java2
		//Java
		
//		System.out.println(word.charAt(0));
//		System.out.println(word.charAt(1));
//		System.out.println(word.charAt(2));
		
		for (int i =0; i<word.length(); i++) {
			char c = word.charAt(i);
			boolean result = true;
			
//			if(c >= 'a' && c <= 'z') {
//				System.out.println("소문자 O");
//			}else {
//				System.out.println("소문자 X");
//			}
			
			//유효성 검사는 잘못된 것을 찾는 조건을 만든다.
			if(c < 'a' || c > 'z') {
				System.out.println("소문자 x");
				result = false;
				break;
			}
			
			System.out.println(result);
			if(result) {
				System.out.println("소문자O");
			}else {
				System.out.println("대문자");
			}
		}
		
		
		
		
	}

	private static void m3() {
		
		//주민등록번호 입력
		//ex) 970110-1234567
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호 입력('-'필수): ");
		String jumin = sc.nextLine();
		
		if(jumin.charAt(6) == '-') {
			System.out.println("올바른 주민번호");
		}else {
			System.out.println("잘못된 주민번호");
		}
		
		
		
		
	}

	private static void m2() {
		
		
		//문자열 추출
		// - char charAt(int index)
		// - 원하는 위치의 문자를 추출하는 메서드
		
		String txt ="안녕하세요. 홍길동입니다.";
		
		char c =txt.charAt(4);
		System.out.println(c);

//		c =txt.charAt(15);		범위 벗어나면 err
//		System.out.println(c);
		
		//마지막 문자
		c= txt.charAt(txt.length() - 1);
		System.out.println(c);
	}

	private static void m1() {
		// 문자열 생성
		//1. 리터럴
		//2. 객체 생성
		String str1 = "홍길동";	//리터럴
		String str2 = new String("홍길동");//객체생성
		
		//문자열 == 문자의 집합
		// String == char[]
		
		//문자열 길이
		// int length()
		String txt = "홍길동";
		System.out.println(txt.length());	//3
		System.out.println("자바".length());	//2
		System.out.println("ABC한글123!@#".length());	//11
		
		//요구사항] 사용자 입력 > 문자수
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문장 입력: ");
		String statement = sc.nextLine();
		
		System.out.printf("%s > %d문자\n", statement, statement.length());
		
		
		//유효성 검사
		//이름 입력
		// 2~5자
		
		System.out.print("이름: ");
		String name = sc.nextLine();
		
		if(name.length() >=2 && name.length() <= 5) {
			System.out.println("올바른 이름");
		}else {
			System.out.println("이름을 2~5자 이내로 입력하세요.");
		}
		
		
		
	}

}
