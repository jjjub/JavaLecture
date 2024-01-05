package com.test.java;

import java.io.BufferedReader; //클래스 임포트
import java.io.IOException;
import java.io.InputStreamReader;
//Ctrl + shift + o > 필요한 클래스 모두 임포트
public class Ex08_BufferedReader {

	public static void main(String[] args) throws IOException {
		
		//요구사항) 사용자에게 문자 1개를 입력 받아 화면에 출력하시오.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		// A(65) ~ Z(90)
		//a(97) ~ z(122)
		//0(48) ~ 9(57)
		// \r(13)
		// \n(10)
		// 스페이스(32)
		// 탭(9)
		
		//완성형 vs 조합형
		//가(44032) ~ 힣(55203)
		
		System.out.print("입력: ");
		int code = reader.read();
		System.out.println(code);
		
		
	    //자료형			변수명	
		//콘솔로부터 키보드값을 입력받을 수 있는 도구
//		System.out.print("문자 입력> ");
//		int code = reader.read();
//		
//		System.out.println(code);
//		System.out.printf("%c\n", code);
		
		//이름 입력
//		System.out.print("이름 임력: ");
//		String name = reader.readLine();//입력된 라인 전체를 읽기
//		System.out.printf("안녕하세요. %s님\n", name);
//		
//		//나이 입력
//		System.out.print("나이를 입력하세요: "); // 20(X) ㅡ> "20"
//		String age = reader.readLine();
//		System.out.printf("%s님의 나이는 %s살 입니다.", name, age);
		
		
		//요구사항) 사용자로부터 2개의 숫자를 입력받아 두 수를 더하시오.
		System.out.print("첫번째 숫자: ");
		String input1 = reader.readLine(); // "10"
		
		System.out.print("두번째 숫자: ");
		String input2 = reader.readLine();
		
		//문자열 > (변환) > 숫자
//		// Interger.parseInt()
//		Byte.parseByte()
//
//		Short.parseShort()
//
//		Long.parseLong()
//
//		Float.parseFloat()
//
//		Double.parseDouble()
//
//		Boolean.parseBoolean()
//		int num1 = Integer.parseInt(input1); // "10" > 10
//		int num2 = Integer.parseInt(input2);
//		
//		System.out.println(input1 + input2);
//		System.out.println(num1 + num2);
		
		double num1 = Double.parseDouble(input1);
		double num2 = Double.parseDouble(input2);
		System.out.println(num1 + num2);
		
		
	}

}
