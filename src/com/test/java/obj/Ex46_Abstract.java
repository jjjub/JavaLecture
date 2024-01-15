package com.test.java.obj;

import java.awt.RenderingHints.Key;

public class Ex46_Abstract {

	public static void main(String[] args) {
		/*
		 
		 
		 추상, Abstract
		 
		 구체적이다 <> 추상적이다.
		 
		 추상 클래스, Abstract Class
		 추상 메서드, Abstract Method
		 
		 
		 */
		//Ex30_CLass.java > Point 클래스
//		Point p1 = new Point();
		Keyboard k1 = new Keyboard();
		
		k1.a = 10;
		k1.aaa();
//		k1.bbb();
		
		//Cannot instantiate the type Mouse
		//m1.bbb();

	}

}


//추상 클래스
//추상 메서드를 가질 수 있다.
//객체를 생성할 수 없다.
abstract class Mouse{
//	
//	//구현된 멤버를 가진다.
//	public int a;
//	public void aaa() {
//		
//	}
//	
//	//추상 멤버를 가진다.
//	public abstract void bbb();
	
	public String model;
	public int price;
	
	public void info() {
		System.out.println("mode: " + this.model);
		System.out.println("price: " + this.price);
	}
	
	public abstract void click();
	
	
}

class G305 extends Mouse{

	@Override
	public void click() {
		System.out.println("저렴한 스위치를 사용해서 클릭합니다.");
	}
	
}

class M410 extends Mouse{
	
	@Override
	public void click() {
		System.out.println("비싼 스위치를 사용해서 클립합니다.");
	}
	
}






//일반 클래스는 추상 멤버를 가질 수가 없다.
class Keyboard{
	public int a;
	public void aaa() {
		System.out.println("타이핑을 합니다.");
	}
	
//	public abstract void bbb();	//구현부를 가질 수 없다.
	
}