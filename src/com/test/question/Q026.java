package com.test.question;

import java.util.Scanner;

public class Q026 {

	public static void main(String[] args) {
		int korean = 0;
		String score="";
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 :");
		korean = sc.nextInt();
		if (korean >= 0 && korean <=100) {
			if(korean >= 90) {
				score ="A";
				System.out.printf("입력한 점수 %d은 성적 %s입니다.", korean, score);
			}else if(korean >= 80) {
				score = "B";
				System.out.printf("입력한 점수 %d은 성적 %s입니다.", korean, score);
			}else if(korean >=70 ) {
				score = "C";
				System.out.printf("입력한 점수 %d은 성적 %s입니다.", korean, score);
			}else if(korean >= 60) {
				score = "D";
				System.out.printf("입력한 점수 %d은 성적 %s입니다.", korean, score);
			}else if(korean >= 0) {
				score = "F";
				System.out.printf("입력한 점수 %d은 성적 %s입니다.", korean, score);
			}
		}else{
			System.out.println("점수가 올바르지 않습니다. 0~100사이의 값을 입력하시오.");
		}

		
		sc.close();
	}

}
