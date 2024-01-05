package com.test.java;

import java.io.IOException;

public class Ex07_Input {

	public static void main(String[] args) throws IOException {
		
		//요구사항) 사용자에게 문자 1개를 입력 받아 화면에 출력하시오.
		System.out.printf("문자 입력: ");
		//사용자로부터 키보드 입력을 받아서 입력한 문자를 돌려준다.
		// 현재 상태 > 사용자가 키를 입력하기를 대기하고 있는 상태
		// 사용자가 입력을 해야 대기 상태가 해제된다.
		// 65\r\n을 읽음 ㅡ> 65, 13, 10
		int code = System.in.read();
		System.out.print("출력: " + code +"\n");
		System.out.printf("출력: %d\n", code);
		System.out.printf("출력: %c\n", code);
		
		code = System.in.read();
		System.out.printf("출력: %d\n", code);
		System.out.printf("출력: %c\n", code);
		
		code = System.in.read();
		System.out.printf("출력: %d\n", code);
		System.out.printf("출력: %c\n", code);
		
		code = System.in.read();
		System.out.printf("출력: %d\n", code);
		System.out.printf("출력: %c\n", code);
		
		code = System.in.read();
		System.out.printf("출력: %d\n", code);
		System.out.printf("출력: %c\n", code);
		
		
		

	}

}
