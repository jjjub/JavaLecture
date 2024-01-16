package com.test.java.obj;

public class Ex51_Generic {

	public static void main(String[] args) {
		/*
		 
		 제네릭, Generic
		 
		 1. 제네릭 클랙스
		 
		 
		 1. 멤버변수 int 1개
		 2. 멤버변수를 중심으로 여러가지 행동을 하는 메서드를 선언

		 추가사항] String을 중심으로 하는 클래스를 추가 설계
		 추가사항] boolean을 중심으로 하는 클래스를 추가 설계
		 추가사항] double을 중심으로 하는 클래스를 추가 설계
		 추가사항] byte을 중심으로 하는 클래스를 추가 설계
		 추가사항] float을 중심으로 하는 클래스를 추가 설계
		 추가사항] Employee을 중심으로 하는 클래스를 추가 설계
		 
		 
		 */
		//전용 클래스
		WrapperInt n1 = new WrapperInt(100);
		System.out.println(n1);
		System.out.println(n1.getData()*2);
		System.out.println();
		
		//범용 클래스
		WrapperObject n2 = new WrapperObject(200);
		System.out.println(n2);
		System.out.println((int)n2.getData()*2);	//Object이기 때문에 int로 형변환
		System.out.println();
		
		Wrapper<Integer> n3 = new Wrapper(300);
		System.out.println(n3);
		System.out.println(n3.getData() * 3);
		System.out.println();
		
		
		WrapperString s1 = new WrapperString("홍길동");
		System.out.println(s1);
		System.out.println(s1.getData().length());
		System.out.println();
		
		WrapperObject s2 = new WrapperObject("아무개");
		System.out.println(s2);
		System.out.println(((String)s2.getData()).length());
		System.out.println();
		
		Wrapper<String> s3 = new Wrapper("김자바");
		System.out.println(s3);
		System.out.println(s3.getData().length());
		System.out.println();

		
		
		WrapperBoolean b1 = new WrapperBoolean(true);
		System.out.println(b1);
		System.out.println(b1.getData() ? "참" : "거짓");
		System.out.println();
	
		WrapperObject b2 = new WrapperObject(false);
		System.out.println(b2);
		System.out.println((boolean)b2.getData() ? "참" : "거짓");
		System.out.println();
		
		Wrapper<Boolean> b3 = new Wrapper<>(true);
		System.out.println(b3);
		System.out.println(b3.getData() ? "참" : "거짓");
		System.out.println();
		
		
		
		
		
		
		
	}
}

class WrapperInt{
	
	private int data; //1. 클래스 중심
	
	//2. data 중심 > 메서드
	public WrapperInt(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "[data=" + data + "]";
	}
	
	
}

class WrapperString{
	
	private String data; //1. 클래스 중심
	
	//2. data 중심 > 메서드
	public WrapperString(String data) {
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "[data=" + data + "]";
	}
	
	
}

class WrapperBoolean{
	
	private boolean data; //1. 클래스 중심
	
	//2. data 중심 > 메서드
	public WrapperBoolean(boolean data) {
		this.data = data;
	}

	public boolean getData() {
		return data;
	}

	public void setData(boolean data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "[data=" + data + "]";
	}
	
	
}
class WrapperObject{
	
	private Object data; //1. 클래스 중심
	
	//2. data 중심 > 메서드
	public WrapperObject(Object data) {
		this.data = data;
	}
	
	public Object getData() {
		return data;
	}
	
	public void setData(Object data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "[data=" + data + "]";
	}
	
	
}

//제네릭 클래스
class Wrapper<T>{
	
	private T data;
	
	public Wrapper(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "[data=" + data + "]";
	}
	
}






















