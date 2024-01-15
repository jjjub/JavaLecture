package com.test.java;

import com.test.java.bbb.Yellow;

public class Ex44_package {

	public static void main(String[] args) {
		/*
		 
		 
		 패키지, Package
		 - 클래스를 저장하기 위한 폴더
		 -많은 클래스들을 체계적으로 과리하기 위한 용도
		 - 파일/폴더: C:\aaa\bbb\ccc
		 - 패키지 : aaa.bbb.ccc
		 - . : 멤버 접근 연산자
		 
		 
		 com.test.java.aaa > Red.java
		 
		 - 기본적으로 모든 코드는 자신과 같은 패키지내에 있는 모든 요소들은 인식이 가능하다.
		 - 패키지가 다르면 인식이 불가능하다.
		 */
		com.test.java.aaa.Red r1 = new com.test.java.aaa.Red();
		
		Yellow y1 = new Yellow();	//Import 같은이름의 클래스를 가져올때는 패키지명 명시해야함
		com.test.java.aaa.Yellow y2 = new com.test.java.aaa.Yellow();
		
		/*
		 
		  
		  패키지 + 접근 지정자
		  1. private > 100% 비공개
		  2. public > 100% 공개
		  -----------------------
		  3. protected
		  - 같은 패키지내에서는 100% 공개
		  - 다른 패키지에서는 100% 비공개
		  - 다른 패키지에 있어도 자식 클래스라면 100% 공개
		  4. (default) > 패키지 접근 지정자
		  - 같은 패키지내에서는 100% 공개
		  - 다른 패키지에서는 100% 비공개
		  
		  
		  
		  
		 
		 */
		
	}

}
