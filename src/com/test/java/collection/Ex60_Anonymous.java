package com.test.java.collection;

public class Ex60_Anonymous {

	public static void main(String[] args) {
		
		/*
		 
		 익명 클래스, Anonymous Class
		  - 익명 객체, Anonymous Object
		  - 이름 없는 클래스
		  
		 실명 클래스
		  - 객체를 여러개 만들 수 있다.(장점)
		  - 이름이 있는 클래스를 만들어야 한다.(단점)
		  
		 익명 클래스
		  - 객체를 딱 1개만 만들 수 있다.(단점)
		  - 이름이 있는 클래스를 만들어야 한다.(장점)
		 
		 */
		
		//요구사항] 인터페이스를 구현한 클래스 선언하기 > 객체를 생성하기
		
		//1. 본인 타입의 참조 변수를 만들기
		BBB b1 = new BBB();
		b1.test();
		
		//2.부모 타입의 참조 변수를 만들기
		AAA b2 = new BBB();
		b2.test();
		
		//3. 익명 클래스
		AAA b3 = new AAA() { //자바에서 anonymous클래스는 독립적으로 선언이 불가하기에 인터페이스를 통해 만들 수 있다.
			//설계도
			@Override
			public void test() {
				System.out.println("익명 객체 메서드");
				
			}
		};
		b3.test();
	}

}

interface AAA{
	void test();
}

class BBB implements AAA{
	@Override
	public void test() {
		System.out.println("추상 메서드를 구현");
		
	}
}