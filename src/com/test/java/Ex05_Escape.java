package com.test.java;

public class Ex05_Escape {
	
	public static void main(String[] args) {
		
		// 특수문자 > Escape Sequence
		// 컴파일러가 번역을 할 때, 소스의 문자를 그대로 출력하지 않고, 미리 약속된 표현으로 바꿔서 출력하는 요소
		
		//1. \n
		char c1 = '\n';
		String s1 = "\n";
		//요구사항) "안녕하세요. 홍길동입니다." 출력
		String msg = "안녕하세요. 홍길동입니다.";
		System.out.println(msg);
		//수정사항) "안녕하세요."와 "홍길동입니다." 각각 다른줄에 출력(엔터)
		//** 문자열 리터럴내에는 엔터를 작성할 수 없다.
		msg = "안녕하세요. \n홍길동입니다.";
		System.out.println(msg);
		
		//빈줄
		System.out.println();
		
		//2. \r
		msg = "안녕하세요. \r홍길동";
		System.out.println(msg); //홍길동세요.
		
		//3. \t
		msg ="하나	둘	셋";
		System.out.println(msg);
		
		msg="하나\t둘\t셋";
		System.out.println(msg);
		
		//4. \b
		msg = "홍길동\b 입니다.";
		System.out.println(msg); //홍길입니다.
		
		//5. \", \', \\
		//요구사항) 화면 > 홍길동: "안녕하세요"
		msg = "홍길동: \"안녕하세요\"";
		System.out.println(msg);
		
		//요구사항) 수업 폴더의 경로를 출력하시오.
		// C:\class\code\java
		// System.out.println("C:\class\code\java"); //Invalid escape sequence (valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ )
		System.out.println("C:\\class\\code\\java");
		
		//
		
		
	}
}
