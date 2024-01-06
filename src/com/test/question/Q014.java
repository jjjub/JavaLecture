package com.test.question;

import java.util.Scanner;

public class Q014 {

	public static void main(String[] args) {
		int result;
		Scanner sc = new Scanner(System.in);
		System.out.print("역의 개수: ");
		int station = sc.nextInt();
		System.out.print("환승역의 횟수: ");
		int change = sc.nextInt();
		System.out.print("시간대(1.평상시, 2.출근시, 3.퇴근시): ");
		int time = sc.nextInt();
		result = getTime(station, change, time);
		System.out.printf("총 소요 시간은 %d입니다.", result);
	}

	private static int getTime(int station, int change, int time) {
		int result = 0;
		if( time == 1) {	//평상시
			result = station * 2 + change * 3;
		}else if(time == 2) {	//출근시
			result = station * 2 + change * 4;
		}else {	//퇴근시
			result = station * 2 + change *5;
		}
		return result;
	}

	
}
