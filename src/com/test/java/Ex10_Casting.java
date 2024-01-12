package com.test.java;

public class Ex10_Casting {

	public static void main(String[] args) {
		
		byte b1;
		short s1;
		
		b1 =10;
		//LValue =RValue
		//***** LValue와 RValue의 자료형은 반드시 동일
		//s1 =b1;
		s1 = (short)b1;
		System.out.println(s1);

		byte b2;
		short s2;
		
		s2 = 10;
	//	b2 = s2; -> 에러
		b2 = (byte)s2; //범위 벗어나면 Overflow
		
		System.out.println(b2);
		
		//기업은행 > 계좌
		int m1;
		long m2 = 3000000000L;
		m1 = (int)m2;
		System.out.printf("계좌이체결과: %d원\n", m1);
		
		//큰형 = 작은형
		//long = int
		//long = short
		//long = byte
		//int = short
		//int = byte
		//short = byte
		
		//작은형 = 큰형
		//byte = long
		//byte = int
		//byte = short
		//short = long
		//short = int
		//int = long
		
		
		//정수형 리터럴은 int
		//실수형 리터럴은 double
		
		//byte = int
		//작은형(1) = 큰형(4)
		//명시적 형변환
		byte a1 = 10;
		
		short a2 = 10;
		
		int a3 = 10;
		//암시적 형변환
		long a4 = 10;
		
		//작은형(4) = 큰형(8)
		float f1 = (float)3.14;
		float f2 = 3.14F;
		
		double f3 = 3.14F;
		
		//정수 > 정수
		//실수 > 실수
		//실수 > 정수
		//정수 > 실수
		
		int n1 = 100; //원본(4)
		float n2; //복사본(4)
		//float = int
		//암시적 형변환 > 안전
		n2 = n1;
		System.out.println(n2);
		
		int n3;	//복사본
		float n4 = 30000000000F; //원본(4)
		n3 = (int)n4; 	//Type mismatch: cannot convert from float to int(암시적으로 불가능하다.)
		System.out.println(n3);
		
		long n5;
		float n6 =10;
		
		//long(8) - float(4)
		n5 = (long)n6;
		
		System.out.println(n5);
		
		//*** 정수와 실수간의 크기 비교는 단순한 메모리 크기가 아닌, 실제 저장하는 수의 범위로 비교한다.
		// byte(1) < short(2) < int(4) < long(8) <<< float(4) <double(8)
		//char 형변환
		char c1 = 'A';
		System.out.println(c1);
		System.out.println((int)c1);
		System.out.println((char)65);
		
		char c2;	//2byte
		short t2;	// 2byte
		c2 = '가';
		//short(2) = char(2)
		t2 = (short)c2;
		System.out.println(t2);
		
		char c3;
		short t3;
		t3 = 65;
		c3 = (char)t3;	//short와 char의 범위가 다르다. 오버플로우 발생
		System.out.println(c3);
		
		
//		System.out.println((int)"A"); //Cannot cast from String to int -> 값형과 참조형간에는 형변환이 절대 불가능하다
		
		String txt = "100";
		int result;
		result = Integer.parseInt(txt);	//가능은 하지만 형변환 메커니즘은 아니다.
		
		
		String txt2 = String.valueOf(100); //정석
		String txt3 = 100 + "";	//편법
		String txt5 = 3.14 + "";	//"3.14"
		String txt6 = true + "";	//"true"
		//Ctrl + 1 : 소스코드 중 잘못된거 한번에 수정
	}

}
