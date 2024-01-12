package com.test.java;

public class Ex03_Variable {
	public static void main(String[] args) {
		//모든 자료형 + 변수 생성하기
		
		//정수
		byte b1;
		b1 = 100; // 100 > 상우(=데이터) > 정수형 상수, 정수형 리터럴
		System.out.println(b1);
		// Type mismatch: cannot convert from int to byte
		// b1 = 128; 
		// b1 = -129;
		
		b1 = Byte.MAX_VALUE;//JDK에서 제공하는 상수
		System.out.println(b1);
		
		b1 = Byte.MIN_VALUE;
		System.out.println(b1);
		
		short s1;
		s1 = 100;
		System.out.println(s1);
		s1 = 128;
		System.out.println(s1);
		s1 = Short.MAX_VALUE;
		System.out.println(s1);
		
		int n1;
		n1 = 100;
		System.out.println(100);
		n1 = 1000000000;
		System.out.println(n1);
		n1 = Integer.MAX_VALUE;
		System.out.println(n1);
		
		long l1;
		l1 = 100;
		System.out.println(l1);
		l1 = 1000000000;
		System.out.println(l1);
		
		//The literal 3000000000 of type int is out of range 
		l1 = 3000000000L;
		System.out.println(l1);
		//모든 상수들도 자료형을 가진다.
		//정수형 상수의 자료형은 무조건 Integer
		
		
		//실수
		//단정도형
		float f1;
		f1 = 3.14F;
		
		//배정도형
		double d1;
		d1 = 6.28;
		
		f1 = 123.123456789012345678901234567890F;
		d1 = 123.123456789012345678901234567890D;
		
		System.out.println(f1);
		System.out.println(d1);
		
		f1 = 123123456789012312312345678901234567890F;
		d1 = 123123456789012312312345678901234567890D;
		
		System.out.println(f1);
		System.out.println(d1);
		
		double d2 = 0.2;
		double d3 = 0.1;
		System.out.println(d2 + d3);
		
//		0.2 x 10 = 2
//		0.1 x 10 =1
//		2 + 1
//		3 / 10 = 0.3
		//BIgDecimal
		//문자형
		
		char c1;
		c1 = 'A'; //홑따옴표 > 문자형 상수(리터럴)
		System.out.println(c1);
		
		c1 = '가'; 
		System.out.println(c1);
		
		c1 = '@'; 
		System.out.println(c1);
		
		c1 = '1'; //숫자 1과 전혀 무관. 문자로서의 1
		System.out.println(c1);
		
//		c1 = '홍길동';		
//		System.out.println(c1);
		
		char name1 = '홍';
		char name2 = '길';
		char name3 = '동';
		
		//논리형
		boolean flag;
		
		flag = true;
		flag = false;
		
		System.out.println(flag);
		
		//추가
		//참조형
		String name;
		name = "홍길동"; //문자열 상수(리터럴)
		System.out.println("제 이름은 "+name+"입니다.");
		
		char m1 = 'A';
		String m2 = "A";
		System.out.println(m1);
		System.out.println(m2);
		//0개의 문자열 > 빈문자열, Empty String
		//문자열 변수를 초기화할 때 많이 사용
		String m3 =""; 
		
		
		
	}
}
