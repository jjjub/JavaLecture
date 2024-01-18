package com.test.java.file;

public class Test {
	
	private int a = 10;
	private static int b =20;
	
	public void aaa() {
		System.out.println("객체");
		
		//객체 메서드 > 객체 멤버 접근 가능
//		this.a = 10;
//		this.aaa();
//		this > heap안 객체에만 사용
		//객체 메서드 > 정적 멤버 클래스명.멤버
		Test.b =20;
		Test.bbb();
	}
	
	public static void bbb() {
		System.out.println("정적");
		//정적 메서드 > 객체 멤버(X)
		//Static안에서는 객체 접근 불가(this사용불가)
		Test.b = 20;
		Test.bbb();
		
	}
}
