package com.test.java.obj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex49_Object {

	public static void main(String[] args) {
		
		//Object 클래스
		// 모든 클래스의 부모 클래스이다.
		// 업캐스팅 적용 > 모든 자료형을 담을 수 있는 자료형
		
		
//		m1();
		m2();
		
		
	}

	private static void m2() {
		//참조형 = (형변환)참조형
		//부모클래스  = 자식클래스
		Object o1 = new AAA();
		
		//불가능 작업
		//눈에 안보이는 작업 > 박싱(Boxing) 발생
		Object o2 = 100;
		Object o3 = new Integer(100);
		//TODO 공부 따로(박싱)
		
		
		int a1 = 100;	//값형
		Integer a2 = new Integer(100);	 //참조형
		System.out.println(a1 ==a2);	//Integer 클래스는 int 값형이 가끔씩 참조타입으로 사용해야 하는 경우 대신 그 역할을 하기 위해 제공되는 클래스
		//Wrapper Class
		// btye > Byte
		// short > Short
		// ....
		
		Integer a3 = 100;
		System.out.println(a3 * 2);	//Unboxing 발생
		
		o2 = 100;
		System.out.println((Integer)o2 * 2);	//Unboxing 발생 x Object타입은 모든 자료형을 넣을 수 있기에 자동으로 Integer로 변환 못함 > 다운캐스팅 필요
		System.out.println((int)o2 * 2); //옳지 않은 표현(되긴함)
		
		//박싱(언방식) > 비용 발생
		
		
	}

	private static void m1() {
		AAA a1 = new AAA();
		AAA a2 = new BBB(); //부모 변수 = 자식 객체 > 업캐스팅
		AAA a3 = new CCC();	//할아버지 = 손자 > 업캐스팅
		
		
		Object o1 = new AAA(); //업캐스팅
		Object o2 = new BBB(); //업캐스팅
		Object o3 = new CCC(); //업캐스팅
		Object o4 = new Scanner(System.in); //업캐스팅
		Object o5 = new BufferedReader(new InputStreamReader(System.in));//업캐스팅
		Object o6 = new Employee();
		
		Object o7 = "홍길동";
		Object o8 = new int[3];
		
		//값형 <- (형변환 불가능) -> 참조형
		Object o9 = (Object)100;
		Object o10 = (Object)true;
		
		//자료형을 신경 쓰지도 않아도 되는 편리한 집합(***********)
		//자료형을 신경 쓰지도 않아도 되는 것이 단점(꺼내쓰기 힘듬)
		
		// Object 배열에는 무엇이든 담을 수 있다. 하지만, 처음 담은 자료형을 나머지 방에도 담는다.
		
		Object[] list = new Object[5];
		list[0] = 100;
		list[1] = 200;
		list[2] = 300;
		
		list[3] = "문자열";
		list[4] = true;
		
//		for(int i=0; i<list.length; i++) {
//			System.out.println((int)list[i] * 2);//예측 불가능
//		}
	}

}


class AAA{	//extend Object
	
	
}
class BBB extends AAA{
	
}
class CCC extends BBB{
	
}