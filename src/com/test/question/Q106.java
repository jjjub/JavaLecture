package com.test.question;

public class Q106 {

	public static void main(String[] args) {
		// 배열 생성
		MyStack stack = new MyStack();

		// 추가
		stack.push("빨강");
		stack.push("노랑");
		stack.push("파랑");
		stack.push("주황");
		stack.push("검정");
		System.out.println(stack);

		// 읽기
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack);
		

		//개수
		System.out.println(stack.size());
//
		//확인
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.size());
//
//		//크기 조절
//		stack.trimToSize();
//
//		//초기화
		stack.clear();
		System.out.println(stack.size());

	}

}

class MyStack {
	private int index;
	private String[] list;

	public MyStack() {
		this.index = 0;
		this.list = new String[4];
	}

	public void clear() {
		this.index = 0;
	}

	public String peek() {
		
		return this.list[this.index-1];
	}

	public int size() {
		
		return this.index;
	}

	public String pop() {
		String	item = list[this.index-1];
		this.list[this.index-1] = null;
		for(int i=this.index; i>this.list.length-2;) {
			list[i] = list[i+1];
		}
		index--;
		return item;
	}

	public boolean push(String s) {

		if (checkSize()) {
			doubleSize();
		}
		this.list[this.index] = s;
		this.index++;
		return true;
	}

	@Override
	public String toString() {
		String temp = "";

		temp += String.format("length: %d\r\n", this.list.length);
		temp += String.format("index: %d\r\n", this.index);
		temp += "[\r\n";
		for (int i = 0; i < this.list.length; i++) {
			temp += String.format("    %d: %s\r\n", i, this.list[i]);
		}
		temp += "]\r\n";

		return temp;
	}

	public boolean checkSize() {
		if (this.list.length == this.index) {
			return true;
		}
		return false;
	}

	public void doubleSize() {
		String[] temp = new String[this.list.length * 2];
		for (int i = 0; i < this.list.length; i++) {
			temp[i] = this.list[i];
		}
		this.list = temp;
	}
	

}