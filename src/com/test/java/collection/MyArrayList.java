package com.test.java.collection;

import java.util.Arrays;

public class MyArrayList {

	private String[] list;
	private int index;

	public MyArrayList() {
//		this.list = new String[4];
//		this.index = 0; // 추가할 방번호
	}
	public MyArrayList(int capacity) {
		this.list = new String[capacity];
		this.index = 0;
	}

	public boolean add(String s) {
		// 배열의 방이 모자란지 확인
		if (checkLength()) {
			doubleList();
		}

		// append
		this.list[this.index] = s;
		this.index++;

		return true;
	}

	private void doubleList() {

		// 기존 배열 > (복사+교체) > 새로우 배열
		String[] temp = new String[this.list.length * 2];

		// 깊은 복사
		for (int i = 0; i < this.list.length; i++) {
			temp[i] = this.list[i];
		}

		// ** 교체
		this.list = temp;

	}

	private boolean checkLength() {

		if (this.index == this.list.length) {
			// 방이 꽉찼다.
			return true;
		}
		// 방이 남았다.
		return false;
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

	public String get(int index) {
		if (!checkIndex(index)) {
			// 강제 에러 발생
			throw new IndexOutOfBoundsException();
		}
		return this.list[index];
	}

	private boolean checkIndex(int index) {

		// 사용 가능한 방번호 확인
		if (index >= 0 && index < this.index) {
			return true;
		}
		return false;
	}

	public int size() {

		return this.index;
	}

	public void set(int index, String s) {
		
		if (!checkIndex(index)) {
			// 강제 에러 발생
			throw new IndexOutOfBoundsException();
		}
		
		this.list[index] = s;

	}
	public void remove(int index) {
		//left Shift
		for (int i = index; i < this.list.length-2; i++) {
			this.list[i] = this.list[i + 1];
		}
		this.list[this.index] = null;
		index--;
	}

}