package com.test.java;


import java.util.Scanner;

public class Ex28_Scanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//문자열 입력
//		System.out.print("입력: ");
//		String line = scan.nextLine(); //reader.readline()
//		System.out.println(line);	//next.line()만 뒤 엔터 지움 > 나머지는 버퍼에 \r\n남은 > 다음스캔에서 엔터인식 > 빈문자열가지고 끝냄
//									// scan.nextLine() or scan.skip("\r\n");으로 엔터를 지워야함
//									// 문자열을 제외한 자료형들은 자유롭게 사용가능
//		
//		//자료형별로 입력받는 메서드 제공
//		System.out.print("입력: ");
//		int num = scan.nextInt();
//		System.out.println(num + 10);
//		 
//		//String 사용전 버퍼에 남은 \r\n 지우기
//		//scan.nextLine();
//		scan.skip("\r\n");
//		
		System.out.print("입력: ");
//		line = scan.nextLine();
//		System.out.println("마지막: " +line);
		
//	
		// TODO 다음에 다시 정리!!!
		String txt = "";
		//입력버퍼에서 다음에 입력받을 토큰이 있는지 검사 있으면 true, 없으면 false
		while(scan.hasNext()) {
			txt = scan.next();
			System.out.println(txt);
		}
		
		System.out.println("종료");
		
		
		
		
	}

}
