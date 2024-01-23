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
			String result = "";
			String line = null;
		
			BufferedReader reader = new BufferedReader(new FileReader(path));
			
			while((line = reader.readLine())!= null) {
				String[] temp = line.split(",");
				if(temp[1].equals(name)) {
					result += String.format("[%s]\n", temp[1]);
					result += String.format("번호: %s", temp[0]);
					result += String.format("주소: %s", temp[2]);
					result += String.format("전화: %s", temp[3]);
					break;
				
				}
				
			}
			if(result == ""){
				System.out.println("없다");
			}else {
				System.out.println(result);
			}
				
			
		} catch (IOException e) {
			System.out.println("없음");
			e.printStackTrace();
		}
	}

}
