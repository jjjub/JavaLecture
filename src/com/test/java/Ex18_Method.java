package com.test.java;

public class Ex18_Method {

	public static void main(String[] args) {
		
//		drawLine();
//		System.out.println("  성적표");
//		drawLine();
		
		//기본선
		drawLine();
		drawLine();
		drawLine();
		drawLine("+");
		drawLine("+");
		drawLine("+");
		

	}//main
	//요구사항) 선을 그리는 메서드를 선언하시오.
	//요구사항) ----
	//요구사항) ****
//	public static void drawLine() {
//		
//		System.out.println("==========");
//	}
//	public static void drawLine() {
//		
//		System.out.println("---------");
//	}
//	public static void drawLine() {
//	
//		System.out.println("**********");
//}
	public static void drawLine() {
		
		System.out.println("==========");
	}
	public static void drawLine(String c) {
		
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.println();
	}
	//코드컨벤션
	//네이밍 규칙 > 변수명, 메서드명, 클래스명 등...
	//K&R
	public static void m1(){
		
	}
	
	//Allman
	public static void m2()
	{
		
	}

}


/*
 public static void test(){}				//O
 public static void test(){}				//X, 1번 때문에
 public static void test(int n){}			//O
 public static void test(int m){}			//X 3번 때문에 (매개변수의 이름)
 public static void test(int n, int m){} 	//O
 public static void test(String s){}		//O
 public static int test(){}					//X, 1번
 호출
 test(); //1번
 test(10); //3번
 test(10, 20); // 5번
 test("문자열"); // 6번
 int result = test(); //x
 */








