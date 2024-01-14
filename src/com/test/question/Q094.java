package com.test.question;

import java.util.Calendar;

public class Q094 {
	public static void main(String[] args) {
		Bugles snack = new Bugles();

		snack.setSize(500);
		snack.setCreationTime("2024-01-11");
		System.out.println("가격 : " + snack.getPrice() + "원");
		System.out.println("유통 기한이 " + snack.getExpiration() + "일 남았습니다.");

		snack.eat();

		Bugles snack2 = new Bugles();

		snack2.setSize(300);
		snack2.setCreationTime("2024-01-03");
		System.out.println("가격 : " + snack2.getPrice() + "원");
		System.out.println("유통 기한이 " + snack2.getExpiration() + "일 남았습니다.");

		snack2.eat();
	}
}

class Bugles {
	private int price;
	private int weight;
	private Calendar creationTime;
	private int expiration;

	public int getPrice() {
		return price;
	}

	public void setSize(int weight) {

		if (weight == 300 || weight == 500 || weight == 850) {
			this.weight = weight;

			if (weight == 300) {
				this.price = 850;
				this.expiration = 7;
			} else if (weight == 500) {
				this.price = 1200;
				this.expiration = 10;
			} else if (weight == 850) {
				this.price = 1950;
				this.expiration = 15;
			}

		}
	}

	public int getExpiration() {
		Calendar now = Calendar.getInstance();
		return this.expiration - (int)((now.getTimeInMillis()- this.creationTime.getTimeInMillis())/1000/60/60/24);
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setCreationTime(String creationTime) {
		Calendar creation = Calendar.getInstance();
		
		creation.set(Integer.parseInt(creationTime.substring(0,4)),	//2022-09-02
				Integer.parseInt(creationTime.substring(5,7))-1,
				Integer.parseInt(creationTime.substring(8)));
		this.creationTime = creation;
	}

	public void eat() {
		if(getExpiration() >= 0) {
			System.out.println("과자를 맛있게 먹습니다.");
		}else {
			System.out.println("유통기한이 지나 먹을 수 없습니다.");
		}
	}
}