package com.test.java.obj._static;

public class Ex38_Static {

	public static void main(String[] args) {
		
		//Ex38_Static.java
		
		//요구사항]
		//1. 펜을 생산하시오.
		//2. 생산된 펜이 개수를 세시오.
		
		
		//Case 1. 
		//- 간편함
		//- Pen과 count간의 관계 애매..
		//- count++ 누락 위험!!
		
		/*
		int count = 0; //누적 변수
		
		Pen p1 = new Pen("MonAmi", "Black");
		count++;
		
		Pen p2 = new Pen("MonAmi", "Black");
		count++;
		
		Pen p3 = new Pen("MonAmi", "Black");
		count++;
		
		System.out.println("볼펜 개수: " + count);
		*/
		
		
		//Case 2.
		//- Pen클래스와 count변수의 관계 강화
		//- count 변수 많다. > 객체마다 가지고 있다.(문제점) > count라는 데이터 성질은 개인 데이터가 아닌 집합 데이터 의미를 가지고 있는데, 그 변수를 객체안에 만든 것이 문제다.
		/*
		Pen p1 = new Pen("MonAmi", "Black");
		p1.count++;
		
		Pen p2 = new Pen("MonAmi", "Black");
		p1.count++;
		
		Pen p3 = new Pen("MonAmi", "Black");
		p1.count++;
		
		System.out.println("볼펜 개수: " + p1.count);
		System.out.println("볼펜 개수: " + p2.count);
		System.out.println("볼펜 개수: " + p3.count);
		*/
		
		
		//Case 3.
		//- Pen클래스와 count변수의 관계 강화
		//- 개인 데이터와 공용 데이터를 구분
		//- count++ 누락 위험!!
		/*
		Pen p1 = new Pen("MonAmi", "Black");
		Pen.count++;
		
		Pen p2 = new Pen("MonAmi", "Black");
		Pen.count++;
		
		Pen p3 = new Pen("MonAmi", "Black");
		Pen.count++;
		
		System.out.println("볼펜 개수: " + Pen.count);
		*/
		
		Pen p1 = new Pen("MonAmi", "Black");
		
		Pen p2 = new Pen("MonAmi", "Black");
		
		Pen p3 = new Pen("MonAmi", "Black");
		
		System.out.println("볼펜 개수: " + Pen.count);
		
	}
	
}

class Pen {
	
	private String model;
	private String color;
	public static int count = 0; //누적 변수(펜 개수)
	
	public Pen(String model, String color) {
		this.model = model;
		this.color = color;
		Pen.count++;
	}
	
	public String dump() {
		return String.format("[model: %s, color: %s]"
								, this.model
								, this.color);	
	}
	
}

//class Pen {
//	
//	private String model;
//	private String color;
//	public static int count = 0; //누적 변수(펜 개수)
//	
//	public Pen(String model, String color) {
//		this.model = model;
//		this.color = color;
//	}
//	
//	public String dump() {
//		return String.format("[model: %s, color: %s]"
//								, this.model
//								, this.color);	
//	}
//	
//}

//class Pen {
//	
//	private String model;
//	private String color;
//	public int count = 0; //누적 변수(펜 개수)
//	
//	public Pen(String model, String color) {
//		this.model = model;
//		this.color = color;
//	}
//	
//	public String dump() {
//		return String.format("[model: %s, color: %s]"
//								, this.model
//								, this.color);	
//	}
//	
//}


//class Pen {
//	
//	private String model;
//	private String color;
//	
//	public Pen(String model, String color) {
//		this.model = model;
//		this.color = color;
//	}
//	
//	public String dump() {
//		return String.format("[model: %s, color: %s]"
//								, this.model
//								, this.color);	
//	}
//	
//}












