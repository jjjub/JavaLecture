package com.test.java;

public class Ex11_Operator {
	public static void main(String[] args) {
		int a = 10;
		int b =3;
		
		System.out.printf("%d + %d = %d\n", a, b, a+b);
		System.out.printf("%d - %d = %d\n", a, b, a-b);
		System.out.printf("%d * %d = %d\n", a, b, a*b);
		System.out.printf("%d / %d = %d\n", a, b, a/b);  //몫
		System.out.printf("%d %% %d = %d\n", a, b, a%b); //나머지
		
		double c =10;
		double d = 3;
		System.out.printf("%.0f / %.0f = %f\n", c,d,c/d);
		//정수 / 정수 = 정수
		//실수 / 실수 = 실수
		//정수 / 실수 = 실수
		//실수 / 정수 = 실수
		
		int e = 10000;
		byte f = 10;
		System.out.println(e+f); //int + byte = int
		
		int g = 1000000000;
		int h = 2000000000;
		long i = (long)g + h;
		System.out.println(i); 
		System.out.println((long)1000000000+2000000000);
		
		byte j = 10;
		byte k =20;
		System.out.println(j + k);
		
		//byte l = j + k; //Type mismatch: cannot convert from int to byte
		//byte l = (byte)(j + k);	//잘 안씀
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
