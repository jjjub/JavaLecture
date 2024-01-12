package com.test.java;

import java.util.Calendar;
import java.util.Date;

public class Ex20_DateTime {

	public static void main(String[] args) {
		
//	m1();	
//	m2();
//	m3();
//	m4();
//	m5();
//	m6();
	m7();
	}//main

	private static void m7() {
		// 현재 시각의 tick
		Calendar now = Calendar.getInstance();
		System.out.println(now.getTimeInMillis());
		
		//전용 메서드(현재 시각)
		System.out.println(System.currentTimeMillis());
		
	}

	private static void m6() {
		// 연산
		// 시간 + 시간 = 시간
		// 시간 - 시간 = 시간
		
		//2시간 + 1시간 = 3시간
		int h1 = 2;
		int h2 = 1;
		System.out.println(h1+h2);
		
		//2시간 30분 + 30 = 2시간 40분
		int hour = 2;
		int min = 30;
		
		min += 10;
		System.out.printf("%d시간 %d분\n", hour, min);
		
		//2시간 30분 + 40분 = 2시간 70분 = 3시간 10분
		hour = 2;
		min = 30;
		
		min += 140;
		
		hour = hour + (min / 60); //2시간 +1시간 >자리올림
		min %= 60;
		System.out.printf("%d시간 %d분\n", hour, min);
				
		
	}

	private static void m5() {
		//연산
		//시각 - 시각 = 시간
		//내가 태어나서 살아온 시간?
		Calendar now = Calendar.getInstance();
		Calendar birthday = Calendar.getInstance();
		birthday.set(1998,10,1,12,0,0);
		
		//Epoch Time, Tick
		//1970년 1월 1일  0시 0분 0초로부터 몇 밀리초가 흘렀는지 누적값(ms)
		System.out.println(birthday.getTimeInMillis());
		System.out.println(now.getTimeInMillis());
		
		long gap = now.getTimeInMillis() - birthday.getTimeInMillis();
		System.out.printf("살아온 시간: %,dms\n",gap);
		System.out.printf("살아온 시간: %,d시간\n",gap/1000/60/60);
		System.out.printf("살아온 시간: %,d일\n",gap/1000/60/60/24);
		System.out.printf("살아온 시간: %,d일\n",gap/1000/60/60/24/365);
		
		//수료일까지 얼마나 남았나 112일
		Calendar end =Calendar.getInstance();
		end.set(2024, 5, 17);
		System.out.printf("수료일까지 남은 일: %d\n",
						(end.getTimeInMillis() - now.getTimeInMillis())/1000/60/60/24);
		
		//오늘 집에 가려면 몇시간
		Calendar out = Calendar.getInstance();
		out.set(Calendar.HOUR_OF_DAY, 17);
		out.set(Calendar.MINUTE, 50);
		
		System.out.printf("오늘 집에 가려면 남은 시간: %.1f\n"
				,(out.getTimeInMillis() - now.getTimeInMillis())/1000.0/60/60);
		
		
		
	}

	private static void m4() {

		//연산
		//시각 + 시간
		//시각 - 시간
		//오늘 만난 커플 > 100일기념일
		//오늘(시작) + 100(시간) = 기념일(시각)
		Calendar now = Calendar.getInstance();
		System.out.printf("1일차: %tF\n", now);
		
		now.add(Calendar.DATE, 99);
		System.out.printf("100일차: %tF\n", now);
		
		//1주일전
		now = Calendar.getInstance();
		
		now.add(Calendar.DATE, -7);
		System.out.printf("일주일전: %tF\n", now);
		
		//컵라면 > 3분뒤
		now = Calendar.getInstance();
		now.add(Calendar.MINUTE, 3);
		System.out.printf("라면 시간: %tT", now);
	}

	private static void m3() {
		// TODO 
		// XXX
		// FIXME
		//1. int get(int) : 읽기
		//2. void set(오버로딩) : 쓰기
		//특정 날짜를 생성하기 > 올해 크리스마스
		Calendar christmas = Calendar.getInstance(); //현재 시각
		
		System.out.printf("%tF\n", christmas);
//		//수정
//		christmas.set(Calendar.DATE, 25);
//		christmas.set(Calendar.MONTH, 11);
		
		christmas.set(2024, 12, 25);
		christmas.set(2024, 11, 25, 18, 30, 0);
		
		System.out.printf("%tF %tT\n", christmas, christmas);
	}

	private static void m2() {
		Calendar c1 = Calendar.getInstance();
		System.out.println(c1);
		//집합 데이터 > 내가 원하는 항목을 추추
		//int get(int)
		System.out.println(c1.get(1)); //년도
		System.out.println(c1.get(2));
		System.out.println(c1.get(3));
		System.out.println(c1.get(4));
		System.out.println(c1.get(5));
		//Calendar.YEAR 캘린더 상수
		System.out.println(Calendar.YEAR);
		System.out.println(c1.get(Calendar.YEAR)); //년도 2024년
		System.out.println(c1.get(Calendar.MONTH)); //월(0~11) 0
		System.out.println(c1.get(Calendar.DATE)); //일 5
		System.out.println(c1.get(Calendar.HOUR)); //11 > 시(12H)
		System.out.println(c1.get(Calendar.HOUR_OF_DAY)); //시 > 11(24H)
		System.out.println(c1.get(Calendar.MINUTE));// 8 > 분
		System.out.println(c1.get(Calendar.SECOND)); // 34 >초
		System.out.println(c1.get(Calendar.MILLISECOND)); // 0.960 > 밀리초
		System.out.println(c1.get(Calendar.AM_PM)); //0 > 오전, 오후(1)
		System.out.println(c1.get(Calendar.DAY_OF_YEAR)); //5 >올해 누적된 날(년)
		System.out.println(c1.get(Calendar.DAY_OF_MONTH)); // 5 > 일(월)
		System.out.println(c1.get(Calendar.DAY_OF_WEEK)); //6 > 요일 일(1) ~토(7)
		System.out.println(c1.get(Calendar.WEEK_OF_YEAR)); //몇주차
		System.out.println(c1.get(Calendar.WEEK_OF_MONTH)); //몇주차
		System.out.println();
		
		//요구사항)"오늘은 2024년 1월 5일입니다." 출력
		System.out.printf("오늘은 %d년 %d월 %d일입니다.\n", 
							c1.get(Calendar.YEAR), 
							c1.get(Calendar.MONTH) + 1, 
							c1.get(Calendar.DATE));
		
		System.out.printf("오늘은 %d년 %d월 %s일입니다.\n", 
							c1.get(Calendar.YEAR), 
							c1.get(Calendar.MONTH) + 1, 
							c1.get(Calendar.DATE) < 10 ? "0"+c1.get(Calendar.DATE) : c1.get(Calendar.DATE) + "");
		
		System.out.printf("오늘은 %d년 %02d월 %02d일입니다.\n", 
							c1.get(Calendar.YEAR), 
							c1.get(Calendar.MONTH) + 1, 
							c1.get(Calendar.DATE));
		//요구사항)"지금은 오전 11시 36분 49초입니다."
		System.out.printf("지금은 %s %02d시 %02d분 %02d초입니다.\n"
				, c1.get(Calendar.AM_PM) == 0 ? "오전" : "오후"
				, c1.get(Calendar.HOUR)
				, c1.get(Calendar.MINUTE)
				, c1.get(Calendar.SECOND));
		
		System.out.println();
		
		//printf() > 형식 문자(날짜시간)
		System.out.printf("%tF\n", c1); //2024-01-05
		System.out.printf("%tT\n", c1); //11:31:55
		System.out.printf("%tA\n", c1); //금요일
	}

	private static void m1() {
		
		Date now = new Date(); //컴퓨터의 시각을 가져온다.
		System.out.println(now);
		
	}
	

}
