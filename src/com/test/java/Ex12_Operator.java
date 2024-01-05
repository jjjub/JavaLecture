package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex12_Operator {
	
	public static void main(String[] args) throws IOException {
		
		// 비교 연산자
		// >,>=,<,<=,==,!=
		
		int a = 10;
		int b = 3;
		System.out.printf("%d > %d = %b\n", a, b, a>b);
		System.out.printf("%d >= %d = %b\n", a, b, a>=b);
		System.out.printf("%d < %d = %b\n", a, b, a<b);
		System.out.printf("%d <= %d = %b\n", a, b, a<=b);
		System.out.printf("%d == %d = %b\n", a, b, a==b);
		System.out.printf("%d != %d = %b\n", a, b, a!=b);
		//요구사항) 사용자 나이 입력 > 18세 이상이면 통과, 미만이면 거절
//		System.out.print("나이 입력: ");
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		String input = reader.readLine();
//		int age = Integer.parseInt(input);
//		System.out.println(age >= 18);
		
		// ==, !=
		// 문자열(참조형) 비교
		int n1 = 100;
		int n2 = 100;
		int n3 = 50;
		n3 = n3 + 50;
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
		System.out.println(n1 == n3);
		
		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = "홍";
		s3 = s3 + "길동";
		
		System.out.println(s1 == s2);
		System.out.println(s3);
		System.out.println(s1 == s3); //false
		//*** 문자열의비교는 ==, != 연산자를 사용하면 안된다.
		//*** 문자열의 비교는 equals() 메서들 사용한다.
		
		System.out.println(s1.equals(s2)); // s1 == s2
		System.out.println(s1.equals(s3)); // s1 == s3
		System.out.println("");
		System.out.println("");
		
		//논리 연산자
	

		boolean f1 = true;
		boolean f2 = false;
		
		System.out.println(f1 && f2);
		System.out.println(f1 || f2);
		System.out.println(!f1);
		System.out.println(f1 ^ f2);
		System.out.println("");
		System.out.println("");
		//나이 입력 > 18세 이상 + 60 미만
		int age = 25;
		System.out.println((age >= 18) && (age < 60));
		
		int sum = 10 + 20 * 3;
		System.out.println(sum);
		
		
		int m1 = 100;
		int m2;
		int m3;
		
		m3 = m2 = m1;
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		
		//복합 대입 연산자
		int n = 10;
		//n에 1을 추가하시오 > n의 값에 1을 더 값을 n에 다시 넣어라 > 누적
		n = n + 1;
		System.out.println(n);
		
		n+=1;
		System.out.println(n);
		
		n += 5;
		System.out.println(n);
		
		n = n -2;
		n-=2;
		n-=3;
		n = n * 2;
		n *= 2;
		n = n / 2;
		n /= 2;
		n = n & 3;
		n %= 3;
		
		n= 10;
		++n;
		System.out.println(n);
		--n;
		
		++n;
		n++;
		System.out.println(n);
		
		n =10;
		int result = 0;
		//result = 10 + ++n;
		++n;
		result = 10 + n;
		System.out.println(result);
		System.out.println("");
		
		n = 10;
		result = 0;
	//	result = 10 + n++;
		result = 10 + n;
		++n;
		System.out.println(result);
		System.out.println(n);
		
		System.out.println(true ? "남자" : "여자");
		System.out.println(true ? "여자" : "남자");
		
		age = 25;
		System.out.println(age >= 18 ? "통과" : "거절");		
		n = 5;
		System.out.println(n % 2 == 0 ? "짝수" : "홀수");
		
		a= 10;
		b = 5;
		System.err.println(a & b); // 0
		System.out.println(a | b); // 15
		
		
		
		
		
		
		
	}

}
