package com.test.java.obj.contructor;

public class Ex36_Constructor {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*
		 
		 
		 생성자, Constructor
		 - (특수한 목적을 가지는) 메서드
		 - 객체의 멤버(변수)를 초기화하는 역할(***)
		 
		 자료형 참조변수 = 객체생성연산자
		 Box b1 = new Box();
		 
		 
		 
		 */
		
		//***
		//1. 객체의 초기화 > 생성자
		//2. 객체의 상태 수정 > Setter
		
		
		//b1 생성
//		Box b1 = new Box();
		Box b1 =new Box("소형", 2000);
		//생성자는 단독 호출이 불가능하다.
		//반드시 new와 함께 호출이 가능하다.
		//생성자는 태어날때 한번 호출되고 그다음부터 호출 불가능
		//초기화
//		b1.setSize("소형");

//		b1.setSize("소형");
		b1.setPrice(2500);//수정
		
		System.out.println(b1.getSize());
		System.out.println(b1.getPrice());
	}

}

class Box{
	
	private String size;
	private int price;
	
	//컴파일러가 컴파일 할 떄 자동으로  생성하는 코드
	//생성자(Constructor)
	//접근지정자 public
	//반환값 존재하지 않음 > void도 생략
	//메서드명 == 클래스명
	//객체를 생성직후 초기화 역할
	//기본 생성자
	
	public Box() {
//		this.size= "";
//		this.price = 0;
		this(""); //생성자간의 호출
	}
	
	//생성자 오버로딩
	public Box(String size) {
		this.size =size;
		this.price = 0;
//		this(size, 0);
	}
	
	public Box(String size, int price) {
		this.size =size;
		this.price = price;
	}
	
	
	public String getSize() {
		return size;
	}
//	public void setSize(String size) {
//		this.size = size;
//	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}

class Cup{
	private String color;
	private int size;
	
	public Cup(String color, int size) {
		
		this.color = color;
		this.size = size;
	}

	public Cup(int size) {
		this.size = size;
	}

	public Cup(String color) {
		this.color = color;
	}
	
}

class Mouse{
	private int a;
	private int b;
	private static int c;	//c는 객체맴버가 아니다.(static)
	//객체 생성자 > 객체 내부를 초기화
	public Mouse(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	//정적 생성자 > 정적 멤버만을 초기화
	//매개변수 없음
	//정적 생성자는 직접 호출이 불가능 > 자바가 호출한다.
	static {
		Mouse.c = 0;
	}
	
	
	
	
}





