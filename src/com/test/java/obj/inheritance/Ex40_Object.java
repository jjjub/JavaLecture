package com.test.java.obj.inheritance;

import java.util.Scanner;

public class Ex40_Object {

	public static void main(String[] args) {
		
		/*
		 
		 
			Object 클래스 
			-개발자가 선언한 모든 클래스는 자동으로 Object 클래스를 상속받는다.
		 	- 모든 클래스의 근원 클래스 
		 	- 루트 클래스(Root Class)
		 	- Object 클래스는 멤버를 9개 구현 > 상속에 의해서 모든 클래스에게 물려진다.
		 		> 모든 클래스는 9개의 메서드를 가지고 있다. > 공통기능
		 
		 */
		Test t1 = new Test();
		
		Object o1 = new Object(); // Class Object is the root of the class hierarchy.Every class has Object as a superclass. All objects,including arrays, implement the methods of this class.

		
		

		
	}

}

class Test extends Object {
	
	public int a;
	public int b;
	
}









