package com.test.java.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex59_File {

	public static void main(String[] args) {

		
		/*
		 
		 1. 파일/디렉토리 조작
		 
		 2. 파일 > (내용)입출력
		 	a. 텍스트 입출력 > 수업
		 		- 메모장
		 		- 이클립스
		 	
		 	b. 비텍스트 입출력(바이너리)
		 
		 파일 입출력
		  - 자바 프로그램 <-> (데이터) <-> 보조기억장치(HDD,SSD)
		  - 		  ->          ->                  :쓰기(저장)
		  - 		  <-          <-                  :읽기
		  
		  저장장치
		   - 데이터 1,0으로 저장
		   - 데이터의 자료형 규칙 없음
		  
		  
		  인코딩, Encoding
		   - 문자 코드(응용 프로그램 데이터)를 부호화(0,1) 시키는 작업
		   - 자바 프로그램("홍길동", String) > 텍스트 파일(1000100110101100101)
		  
		  디코딩, Decoding
		   - 부호 데이터를 문자 코드로 변환하는 작업
		   - 텍스트 파일(1000100110101100101) > 자바 프로그램("홍길동", String)
		  
		  인코딩/디코딩 규칙
		   - 저장 장치 or 네트워크 상에서 데이터를 표현하는 규칙
		  
		  1. ANSI
		  2. UTF
		  	2.1 UTF-8
		  	2.2 UTF-16
		  3. ISO-8859-1
		  5. MS949
		  
		  ANSI(ISO-8859-1, EUC-KR, MS949)
		   - 영어(숫자, 특수문자, 서유럽 문장 등 ASCII: 1byte
		   - 한글(한자, 일본어 등): 2byte
		  
		  UTF-8 > 국제 표준 역할 > 자바/오라클 UTF-8 사용
		   - 영어: 1byte
		   - 한글: 3byte
		  
		  UTF-16
		   - 영어 : 2byte
		   - 한글 : 2byte
		 
		 */
		
//		m1();
//		m2();
//		m3();
//		m4();
//		m5();
//		m6();
//		m7();
		m8();
		
	}

	private static void m8() {
		// 성적 관리
		// 성적표 출력
		// 성적 파일(score.dat)
		
		//***********데이터 구조 설계
		// 이름, 국어, 영어, 수학
		
		System.out.println("======================================");
		System.out.println("              성적표");
		System.out.println("[이름]\t[국어]\t[영어]\t[수학]\t[총점]\t[평균]");
		try {
			BufferedReader reader = new BufferedReader(new FileReader("dat\\score.txt"));
			
//			File file = new File(".\\data\\score.txt");
//			System.out.println(file.exists());
			
			String line = null;
			while((line = reader.readLine())!= null) {
//				System.out.println(line); //학생 1명
				//홍길동,100,90,80 > Parsing > 데이터 변환
				String[] temp = line.split(",");
				
				String name = temp[0];
				int kor = Integer.parseInt(temp[1]);
				int eng = Integer.parseInt(temp[2]);
				int math = Integer.parseInt(temp[3]);
				int total = kor + eng + math;
				double avg = total / 3.0;
				
				System.out.printf("%s\t%5d\t%5d\t%5d\t%5d\t%5.1f\n"
									,name
									,kor
									,eng
									,math
									,total
									,avg);
			}
			reader.close();
		} catch (Exception e) {
			System.out.println("Ex59_File.m8");
			e.printStackTrace();
		}
		
		
		
	}

	private static void m7() {
		
		try {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("자바 파일명: "); //Ex01_DatatType.java
			String filename = sc.nextLine();
			
			//C:\class\code\java\JavaTest\src\com\test\java\파일명
			
			String path = "C:\\class\\code\\java\\JavaTest\\src\\com\\test\\java\\" + filename;
			BufferedReader reader = new BufferedReader(new FileReader(path));
			
			String line = null;
			int number = 1;
			while((line = reader.readLine())!= null) {
				System.out.printf("%3d: %s\n", number, line);
				number++;
			}
			reader.close();
			
			
			
		} catch (Exception e) {
			System.out.println("Ex59_File.m7");
			e.printStackTrace();
		}
		
		
		
	}

	private static void m6() {
		// FileOutputStream > FileWriter > BufferedWriter
		// FileInputStream > FileReader > BufferedReader
		
		try {
//			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\class\\code\\java\\file\\list.txt"));
//			
//			writer.write(65);
//			writer.newLine(); // == writer.write("\r\n")
//			writer.write("문자열");
//			writer.close();
			
//			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			BufferedReader reader = new BufferedReader(new FileReader("C:\\class\\code\\java\\file\\list.txt"));
			//reader.read()
//			String line = reader.readLine();
//			System.out.println(line);
//			line = reader.readLine();
//			System.out.println(line);
//			line = reader.readLine();
//			System.out.println(line);
			
			String line = null;
			
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
		} catch (Exception e) {
			System.out.println("Ex59_File.m6");
			e.printStackTrace();
		}
		
	}

	private static void m5() {
		// 파일 읽기
		try {
			//파일 읽기
			//FileInputStream > FileReader
			//1. 문자 단위 읽기(2byte) > 한글 안깨짐
			
			FileReader reader = new FileReader("C:\\class\\code\\java\\file\\data.txt");
			
//			int code = reader.read();
//			System.out.println((char)code);
//			code = reader.read();
//			System.out.println((char)code);
//			code = reader.read();
//			System.out.println((char)code);
//			code = reader.read();
//			System.out.println((char)code);
//			code = reader.read();
//			System.out.println((char)code);
			
			int code = -1;
			
			while((code = reader.read()) != -1) {
				System.out.print((char)code);
			}
			
			
			reader.close();
		} catch (Exception e) {
			System.out.println("Ex59_File.m5");
			e.printStackTrace();
		}
		
	}

	private static void m4() {
		//메모장 구현 > 콘솔 버전
		
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("저장할 파일명: ");
			String filename = scan.nextLine();
			
			FileWriter writer = new FileWriter("C:\\class\\code\\java\\" + filename);
			
			boolean loop = true;
			
			while(loop) {
				System.out.print("입력: ");
				String line = scan.nextLine();
				if(line.equals("q!")) {
					break;
				}
				writer.write(line);
				writer.write("\r\n");
				
			}
			
			writer.close();
			System.out.println("end");
			
		} catch (Exception e) {
			System.out.println("Ex59_File.m4");
			e.printStackTrace();
		}
		
		
		
	}

	private static void m3() {

		try {
			
			//파일 쓰기
			//FileOutputStream > FileWriter
			//1. 문자열 쓰기 지원
			//2. 문자 단위 쓰기(2byte)
			
			FileWriter writer = new FileWriter("C:\\class\\code\\java\\file\\member.txt", true);	//파일이 없어도 알아서 만들어줌
			
			writer.write("가나다라마바사");
			writer.write(" ");
			
			
			writer.close();
			
			
		} catch (Exception e) {
			System.out.println("Ex59_File.m3");
			e.printStackTrace();
		}
		
	}

	private static void m2() {
		// 파일 읽기 == 파일 입력
		
		try {
			
			//FileOutputStream <-> FileInputStream
			
//			FileInputStream stream = new FileInputStream("C:\\class\\code\\java\\file\\data.txt");
			FileInputStream stream = new FileInputStream("C:\\class\\code\\java\\JavaTest\\src\\com\\test\\java\\Ex28_Scanner.java");
			//System.in.read()
			//reader.read()
//			int code = stream.read();
//			System.out.println((char)code);
//
//			code = stream.read();
//			System.out.println((char)code);
//			
//			code = stream.read();
//			System.out.println((char)code);
//			code = stream.read();
//			System.out.println((char)code);
//			code = stream.read();
//			System.out.println((char)code);
//			code = stream.read();
//			System.out.println((char)code);
//			code = stream.read();
//			System.out.println((char)code);
//			code = stream.read();
//			System.out.println((char)code);
//			code = stream.read();
//			System.out.println((char)code);
//			code = stream.read();
//			System.out.println((char)code);
//			code = stream.read();
//			System.out.println(code); //읽을게 없으면 -1반환
			
			
			//로직 기억!
			int code = -1;
			while((code = stream.read()) != -1) {
				System.out.print((char)code);
			}
			
			stream.close(); //입출력 상관없이 모든 스트림은 마지막에 종료
			
			
			
		} catch (Exception e) {
			System.out.println("Ex59_File.m2");
			e.printStackTrace();
		}
		
	}

	private static void m1() {
		// 파일 입출력
		
		//파일 쓰기 == 파일 출력
		
		//쓰기 스트림 객체
		try {
			
			File file = new File("C:\\class\\code\\java\\file\\data.txt");
			
			//파일 객체 > 스트림 생성
			//쓰기 스트림 모드
			//1. Create Mode > 기존 내용 없어짐 > 기본값
			//2. Append Mode > 이어쓰기
			
			//FileOutputStream 
			//바이트 단위 쓰기(1byte)
			FileOutputStream stream = new FileOutputStream(file, true); //false = Create Mode
			/*
			char c = 'A';
			
			stream.write((int)c); //문자코드를 사용해서 파일에 문자를 작성
			stream.write('B');
			stream.write('C');
			
			stream.close(); //스트림 닫기(실제 저장)
			
//			stream.write('C'); //스트림을 다시 열어야 가능
			
			stream = new FileOutputStream(file, true);
			stream.write('가');  //한글은 깨짐
			*/
			
			String txt= "Hello Java!!";
			for(int i=0; i<txt.length(); i++) {
				char c = txt.charAt(i);
				stream.write(c);
			}
			stream.close();
			
			System.out.println("end");
			
			
		} catch (Exception e) {
			System.out.println("Ex59_File.m1");
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
