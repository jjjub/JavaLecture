package com.test.java;

import java.util.Random;

public class Ex50_Random {

	public static void main(String[] args) {
			
		//1. Math.random()
		//2. Random 클래스
//		m1();
		m2();
		
	}

	private static void m2() {
		// 프로젝트
		// 주제 선정
		// 학생 정보 > 프로그램
		// 학교 규모
		// 500여명 > 1년 생활 > 데이ㅓ
		// 성적, 출결, 기타 등..
		// 이름, 나이, 성별, 주소, 키
		Random rnd = new Random();
		//문자열 난수 > 배열
		String[] name1 = {"김","이","박","최","정","유","윤","민","차","장","최","조","전","한"};
		String[] name2 = {"길","동","준","지","재","영","명","수","석","섭","세","원","호","주","이","미","원"};
		
		String[] address1 = {"서울시", "인천시", "부산시", "강릉시", "대구시", "광주시", "제주시"};
		String[] address2 = {"강남구", "강동구", "강서구", "강북구", "중구", "마포구"};
		String[] address3 = {"역삼동", "대치동", "압구정동", "천호동", "길동", "명일동"};
		
		for(int i=0; i<200; i++) {
			String name = name1[rnd.nextInt(name1.length)]
						+ name2[rnd.nextInt(name2.length)]
						+ name2[rnd.nextInt(name2.length)];
//			System.out.println(name);
			int age = rnd.nextInt(2) + 13;
			String gender = rnd.nextInt(2) == 0 ? "남자" : "여자";
			
			String address = address1[rnd.nextInt(address1.length)] + " "
							+ address2[rnd.nextInt(address2.length)] + " "
							+ address3[rnd.nextInt(address2.length)]
							+ (rnd.nextInt(300)+100) + "번지";		;
							
			
			System.out.printf("%s(%d세) %s %s\n", name, age, gender, address);
		}
		
		
	}

	private static void m1() {


		Random rnd = new Random();
		
		//각 자료형별 > 난수 발생
//		rnd.nextxxx()
		
		for(int i=0; i<10; i++) {
//			System.out.println(rnd.nextInt());
//			System.out.println(rnd.nextDouble()); //Math.random()
//			System.out.println(rnd.nextInt(10)); //가장 많이 사용
//			System.out.println(rnd.nextBoolean());
			
			
			
		}
		
	}

}
