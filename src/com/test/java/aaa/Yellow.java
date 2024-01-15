package com.test.java.aaa;

public class Yellow {

	public void test() {
		Red r1 = new Red();

		r1.a = 10;	//public
//		r1.b = 20; private
		r1.c = 30;
		r1.d = 40;	//protected
	}

}
