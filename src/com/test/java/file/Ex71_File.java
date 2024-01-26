package com.test.java.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex71_File {

	private static String data;

	static {
		data = "dat\\data.txt";
	}

	public static void main(String[] args) {

		// 파일 입출력
		// 읽기
		// 쓰기
		// 수정하기
		// 수정하기(x)
//		m1();
//		m2();
//		m3();
		m4();

	}

	private static void m4() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(data));

			String txt = "";
			String line = null;

			while ((line = reader.readLine()) != null) {
				txt += line.replace("둘", "two") + "\r\n";

			}
			reader.close();
			System.out.println(txt);

			BufferedWriter writer = new BufferedWriter(new FileWriter(data));

			writer.write(txt);

			writer.close();
			System.out.println("complete");
		} catch (Exception e) {
			System.out.println("Ex71_File.m3");
			e.printStackTrace();
		}

	}

	private static void m3() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(data));

			String txt = "";
			String line = null;

			while ((line = reader.readLine()) != null) {
				if (!line.equals("셋")) {
					txt += line + "\r\n";
				}
			}
			reader.close();
			System.out.println(txt);

			BufferedWriter writer = new BufferedWriter(new FileWriter(data));

			writer.write(txt);

			writer.close();
			System.out.println("complete");
		} catch (Exception e) {
			System.out.println("Ex71_File.m3");
			e.printStackTrace();
		}

	}

	private static void m2() {
		//
		try {
			// 편집(=수정) > 일부 내용 추가/삭제
			BufferedWriter writer = new BufferedWriter(new FileWriter(data, true));

			writer.write("넷");
			writer.newLine();
			writer.write("다섯");
			writer.newLine();

			writer.close();
			System.out.println("complete");

		} catch (Exception e) {
			System.out.println("Ex71_File.m2");
			e.printStackTrace();
		}

	}

	private static void m1() {
		// 쓰기
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(data));

			writer.write("하나");
			writer.newLine();
			writer.write("둘");
			writer.newLine();
			writer.write("셋");
			writer.newLine();

			writer.close();
			System.out.println("complete");

		} catch (Exception e) {
			System.out.println("Ex71_File.m1");
			e.printStackTrace();
		}
	}
}
