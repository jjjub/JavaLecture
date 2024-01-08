package com.test.question;

import java.util.Calendar;

public class Q019 {

	public static void main(String[] args) {
		nowTime();
		

	}

	private static void nowTime() {
		Calendar time = Calendar.getInstance();
		
		System.out.printf("현재시간 : %s %02d시 %02d분 %02d초\n"
				, time.get(Calendar.HOUR_OF_DAY)
				, time.get(Calendar.MINUTE)
				, time.get(Calendar.SECOND));
		
		System.out.printf("현재시간 : %s %02d시 %02d분 %02d초\n"
				, time.get(Calendar.AM_PM) == 0 ? "오전" : "오후"
				, time.get(Calendar.HOUR)
				, time.get(Calendar.MINUTE)
				, time.get(Calendar.SECOND));
	}

}
