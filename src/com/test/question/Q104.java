package com.test.question;

import java.util.Arrays;

public class Q104 {
	private String[] list;
	private int index = 0;

	public Q104() {
		this.index = 0;
		this.list = new String[4];
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

	public boolean add(String s) {
		if (checkSize()) {
			doubleSize();
		}
		this.list[this.index] = s;
		this.index++;
		return true;
	}

	private void doubleSize() {
		String[] tmp = new String[this.list.length * 2];
		for (int i = 0; i < this.list.length; i++) {
			tmp[i] = this.list[i];
		}
		this.list = tmp;

	}

	private boolean checkSize() {
		if (this.list.length == this.index) {
			return true;
		}
		return false;
	}

	public String get(int index) {
		if (!checkIndex(index)) {
			throw new IndexOutOfBoundsException();
		}
		return this.list[index];
	}

	private boolean checkIndex(int index) {
		if (index <= this.index && index >= 0) {
			return true;
		}
		return false;

	}

	public int size() {
		return this.index;
	}

	// 수정
	public void set(int index, String s) {
		if (!checkIndex(index)) {
			// 강제 에러 발생
			throw new IndexOutOfBoundsException();
		}
		this.list[index] = s;

	}

	// 삭제
	public void remove(int index) {
		//left Shift
		for (int i = index; i < this.list.length-2; i++) {
			this.list[i] = this.list[i + 1];
		}
		
		this.index--;
	}

	public void remove(String s) {
		//삭제할 요소 검색
		int index = -1;
		
		index = indexOf(s);
		
		this.remove(index);
	}

	public void add(int index, String s) {
		if (checkSize()) {
			doubleSize();
		}
		//Right Shift
		for(int i=this.list.length-2; i>=index; i--) {
			this.list[i+1] = this.list[i];
		}
		this.list[index] = s;
		this.index++;
		
	}

	public int indexOf(String s) {
//		for(int i=0; i<this.index; i++) {
//			if(this.list[i].equals(s)) {
//				return i;
//			}
//		}
		return indexOf(s,0);
	}

	public int lastIndexOf(String s) {
//		for(int i=this.index-1; i>=0; i--) {
//			if(this.list[i].equals(s)) {
//				return i;
//			}
//		}

		return lastIndexOf(s, this.index-1); //리팩토링
	}
	
	public int indexOf(String s, int beginIndex) {
		for(int i=beginIndex; i<this.index; i++) {
			if(this.list[i].equals(s)) {
				return i;
			}
		}
		return -1;
	}

	public int lastIndexOf(String s, int beginIndex) {
		for(int i=beginIndex; i>=0; i--) {
			if(this.list[i].equals(s)) {
				return i;
			}
		}
		
		return -1;
	}

	public void clear() {
		
//		for (int i=0; i<this.index; i++) {
//			this.list[i] = null;
//		}
//		this.index = 0;
		
//		this.list = new String[4];
//		this.index = 0;
		
		this.index = 0;
	}

	public void trimToSize() {
		// 8 >5
		
		String[] temp = new String[this.index];
		
		for(int i=0; i<this.index; i++) {
			temp[i] = this.list[i];
			
		}
		this.list = temp;
	}
	
	

}
