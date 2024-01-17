package com.test.java.collection;

public class MyHashMap {
	//key + value
	//Case 1.
	private String[] keys;
	private String[] values;
	private int index;
	public MyHashMap() {
		this.keys = new String[4];
		this.values = new String[4];
		this.index = 0;
	}
	
	public void put(String keys, String values) {
	
		this.keys[this.index] = keys;
		this.values[this.index] = values;
		index++;
	}
	
	
	

}

