package com.test.java;

import java.nio.file.FileSystemNotFoundException;

public class Ex06_Output {
	
	public static void main(String[] args) {
		/*
		- System.out.println(값); // 클래스.필드.메서드(인자);
        - println 메서드
		- print line > 값을 행단위로 출력한다. > 값을 출력한 뒤 엔터를 친다.
		- System.out.print(값);
  		- print 메서드
  		- 값을 출력하고 엔터를 안친다.
		*/
		
		//성적표 출력하기
		String name1 ="홍길동";
		int kor1 = 100;
		int eng1 = 90;
		int math1 = 80;
		
		String name2 ="아무개";
		int kor2 = 95;
		int eng2 = 98;
		int math2 = 87;
		System.out.println("==============================");
		System.out.println("            성적표");
		System.out.println("==============================");
		System.out.println("[이름]\t[국어]\t[영어]\t[수학]");
		System.out.println("------------------------------");
		System.out.print(name1);
		System.out.print("\t ");
		System.out.print(kor1 + "\t  ");
		System.out.print(eng1 + "\t  ");
		System.out.print(math1 + "\r\n");
		System.out.print(name2 + "\t  " + kor2 + "\t  " + eng2 + "\t  " + math2);
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		//요구사항) "안녕하세요. 홍길동님" 문장을 출력하시오.
		String name = "홍길동"; // 사용자가 키보드로 입력한 이름
		System.out.println("안녕하세요." + name + "님.");
		System.out.printf("안녕하세요. %s님\n", name);
		
		//요구사랑)"안녕하세요. 홍길동님. 안녕히가세요. 홍길동님."
		System.out.println("안녕하세요. " + name + "님. " + "안녕히가세요. " + name + "님.");
		System.out.printf("안녕하세요. %s님. 안녕히가세요. %s님.", name, name);
		
		System.out.println("");
		System.out.printf("문자열: %s\n", "문자열");
		System.out.printf("정수: %d\n", 100);
		System.out.printf("실수: %f\n", 3.14);
		System.out.printf("문자: %c\n", 'A');
		System.out.printf("논리: %b\n", true);
		System.out.println("");
		
		int num = 123;
		System.out.printf("[%d]\n", num);
		System.out.printf("[%10d]\n", num);
		System.out.printf("[%-10d]\n", num);
		
		double num2 = 3.14;
		
		System.out.println(num2);
		System.out.printf("%f\n", num2);
		System.out.printf("%.2f\n", num2);
		System.out.printf("%.1f\n", num2);
		System.out.printf("%.0f\n", num2);
		System.out.printf("%.3f\n", 3.4567);
		System.out.println("");
		
		int price = 1234567;
		
		System.out.printf("금액: %d원\n", price);
		System.out.printf("금액: %,d원\n", price);
		
		double num3 = 1234567.7890123;
		System.out.printf("[%,20.2f]\n", num3);
		
		//메뉴판 출력 > 열 정렬
		System.out.println("==========================");
		System.out.println("         음료가격");
		System.out.println("==========================");
		System.out.printf("콜라:\t\t%,6d원\n", 2500);
		System.out.printf("스무디: \t\t%,6d원\n", 3500);
		System.out.printf("사이다: \t\t%,6d원\n", 500);
		System.out.printf("아메리카노: \t%,6d원\n", 15000);
		
		
		
		
		
		
		
		
	}
}
