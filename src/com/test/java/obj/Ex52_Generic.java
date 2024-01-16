package com.test.java.obj;

public class Ex52_Generic {

	public static void main(String[] args) {

		Item<String> s1 = new Item<String>();
		s1.c = "홍길동";
//		s1.c = 100;
		Item<Integer> s2 = new Item<Integer>();
		s2.c = 100;
//		s2.c = "문자열";

		Pen<Boolean> p1 = new Pen();
		Pen<Boolean> p2 = new Pen<Boolean>();
		Pen<Boolean> p3 = new Pen<>();

		p1.a = true;
		p1.b = false;
		p1.c = true;
		
		Desk<String> d1 = new Desk<String>();
		
		d1.setType("사무용");
		System.out.println(d1.getType());
		
		LapTop<String, Integer> macbook = new LapTop("맥북", 3000000);
		System.out.println(macbook.getA());
		System.out.println(macbook.getB());
		
		LapTop<String, String> galaxy = new LapTop<>("갤럭시북", "최고사양");
		System.out.println(galaxy.getA());
		System.out.println(galaxy.getB());
		
	}

}

//제네릭 클래스
// T : 타입 변수(매개변수 역할) > 참조형만 사용 가능
// <> : 인자 리스트
class Item<T> {
	public int a;
	public int b;
	public T c; // 클래스 선언시에는 c의 자료형이 결정되지 않음. 객체 생성할때 결정

}

class Pen<T> {
	public T a;
	public T b;
	public T c;

}

class Desk<T> {
	private T type;

	public void setType(T type) {
		this.type = type;
	}
	public T getType() {
		return this.type;
	}
	
}

class LapTop<T,U>{
	
	private T a;
	private U b;
	
	public T getA() {
		return a;
	}

	public U getB() {
		return b;
	}

	public LapTop(T a, U b) {
		this.a = a;
		this.b = b;
	}
	
	
	
}












