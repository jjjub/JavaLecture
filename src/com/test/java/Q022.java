package com.test.java;

import java.util.Calendar;
import java.util.Scanner;

public class Q022 {

	public static void main(String[] args) {
		String man, woman;
		int year, month, day;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("남자 이름: ");
		man = sc.next();
		System.out.print("여자 이름: ");
		woman = sc.next();
		System.out.print("만난날(년): ");
		year = sc.nextInt();
		System.out.print("만난날(월): ");
		month = sc.nextInt();
		System.out.print("만난날(일): ");
		day = sc.nextInt();
		
		
		System.out.printf("'%s'과(와) '%s'의 기념일\n", man, woman);
		
		Calendar hundred = Calendar.getInstance();
		hundred.add(Calendar.DATE, 100); //100일
		System.out.printf("100일: %tF\n", hundred);
		
		Calendar twoHundred = Calendar.getInstance();
		twoHundred.add(Calendar.DATE, 200); //200일
		System.out.printf("200일: %tF\n",twoHundred);
		
		Calendar threeHundred = Calendar.getInstance();
		threeHundred.add(Calendar.DATE, 200); //300일
		System.out.printf("300일: %tF\n",threeHundred);
		
		Calendar fiveHundred = Calendar.getInstance();
		fiveHundred.add(Calendar.DATE, 500); //500일
		System.out.printf("500일: %tF\n",fiveHundred);
		
		Calendar thousand = Calendar.getInstance();
		thousand.add(Calendar.DATE, 1000); //200일
		System.out.printf("1000일: %tF\n",thousand);
		sc.close();
	}

}
