package com.test.java.obj;

public class Monitor {

	private String model;
	private int size = 24;
	private int price;
//	private int level;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSize() {
		return size;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getLevel() {

		if (this.price >= 500000) {
			return 1;
		} else if (this.price >= 300000) {
			return 2;
		} else {
			return 3;
		}
	}

}
