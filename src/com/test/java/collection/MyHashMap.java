package com.test.java.collection;

import java.util.Arrays;

public class MyHashMap {
	// key + value
	// Case 1.
	private String[] keys;
	private String[] values;
	private int index;

	public MyHashMap() {
		this.keys = new String[4];
		this.values = new String[4];
		this.index = 0;
	}

	@Override
	public String toString() {
		return "MyHashMap [keys=" + Arrays.toString(keys) + ", values=" + Arrays.toString(values) + ", index=" + index
				+ "]";
	}

	public void put(String keys, String values) {
		if (checkKey(keys) == -1) {

			if (checkLength()) {
				doubleList();
			}

			this.keys[this.index] = keys;
			this.values[this.index] = values;
			index++;
		} else {
			this.values[checkKey(keys)] = values;
		}
	}

	private boolean checkLength() {
		if (this.keys.length == this.index) {
			return true;
		}
		return false;
	}

	private void doubleList() {
		String[] tempKeys = new String[this.index * 2];
		String[] tempValues = new String[this.index * 2];
		for (int i = 0; i < this.keys.length; i++) {
			tempKeys[i] = this.keys[i];
		}
		for (int i = 0; i < this.values.length; i++) {
			tempValues[i] = this.values[i];
		}

		this.keys = tempKeys;
		this.values = tempValues;

	}

	public String get(String key) {
		if (checkKey(key) == -1) {
			return null;
		} else {
			return this.values[checkKey(key)];
		}
	}

	private int checkKey(String key) {
		for (int i = 0; i < this.keys.length; i++) {
			if (this.keys[i] == key) {
				return i;
			}
		}
		return -1;
	}

	private int checkValue(String value) {
		for (int i = 0; i < this.values.length; i++) {
			if (this.values[i] == value) {
				return i;
			}
		}
		return -1;
	}

	public int size() {
		return this.index;
	}

	public void remove(String key) {
		if (checkKey(key) > -1) {
			for (int i = checkKey(key); i <= this.keys.length - 2; i++) {
				this.values[i] = this.values[i + 1];
			}
			for (int i = checkKey(key); i <= this.values.length - 2; i++) {
				this.keys[i] = this.values[i + 1];
			}
			this.index--;
		}
	}

	public boolean containsKey(String key) {
		if (checkKey(key) == -1) {

			return false;
		} else {
			return true;
		}
	}

	public boolean containsValue(String value) {
		if (checkValue(value) == -1) {
			return false;
		} else {
			return false;
		}
	}

	public void clear() {
		this.index = 0;

	}

}
