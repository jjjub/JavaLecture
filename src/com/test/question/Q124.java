package com.test.question;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Q124 {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			String path ="C:\\Users\\user\\Downloads\\파일 입출력 문제\\단일검색.dat";
			Scanner sc = new Scanner(System.in);
			System.out.print("이름: ");
			String name = sc.nextLine();
			String line = null;
			BufferedReader reader = new BufferedReader(new FileReader(path));
			
			while((line = reader.readLine())!= null) {
				String[] temp = line.split(",");
				if(temp[0].equals(name)) {
					System.out.printf("[%s]\n", temp[0]);
					System.out.printf("번호: %d", temp[1]);
					System.out.printf("주소: %s", temp[2]);
					System.out.printf("전화: %s", temp[3]);
					break;
				}
			}
		} catch (IOException e) {
			System.out.println("없음");
			e.printStackTrace();
		}
	}

}
