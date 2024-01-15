package com.test.question;

public class Q101 {

	public static void main(String[] args) {
		// 바리스타
		Barista barista = new Barista();

		// 손님 1
		// 에스프레소 1잔 주문 - 원두 30g
		Espresso e1 = barista.makeEspresso(30);
		e1.drink();

		// 손님 2
		// 라테 1잔 주문 - 원두 30g, 우유 250ml
		Latte l1 = barista.makeLatte(30, 250);
		l1.drink();

		// 손님 3
		// 아메리카노 1잔 주문 - 원두 30g, 물 300ml, 각얼음 20개
		Americano a1 = barista.makeAmericano(30, 300, 20);
		a1.drink();

		// 손님 4
		// 에스프레소 10잔 주문 - 원두 25g
		Espresso[] e2 = barista.makeEspressoes(25, 10);

		for (Espresso e : e2) {
			e.drink();
		}

		// 손님 5
		// 라테 5잔 주문 - 원두 25g, 우유 300ml
		Latte[] l2 = barista.makeLattes(25, 300, 5);

		for (Latte l : l2) {
			l.drink();
		}

		// 손님 6
		// 아메리카노 15잔 주문 - 원두 20g, 물 350ml, 각얼음 30개
		Americano[] a2 = barista.makeAmericanos(20, 350, 30, 15);

		for (Americano a : a2) {
			a.drink();
		}

		// 결산
		barista.result();

	}

}

class Barista {
	
	private int bean;
	private int count;
	private int milk;
	
	Espresso makeEspresso(int bean) {
		Espresso espresso = new Espresso();
		
		return espresso;

	}
	
	Espresso[] makeEspressoes(int bean, int count) {
	
	}
	Latte makeLatte(int bean, int milk) {
	
		
	}
	Latte[] makeLattes(int bean, int milk, int count) {
	
	}
	Americano makeAmericano(int bean, int water, int ice) {
		
	}
	Americano[] makeAmericanos(int bean, int water, int ice, int count) {
		
	}
	
	void result() {
		
	}

}

class Espresso {
	private int bean;
	
	public int getBean() {
		return bean;
	}

	void drink() {
		System.out.printf("원두 %dg으로 만들어진 에스프레소를 마십니다.", bean);
	}

}

class Latte {
	private int bean;
	private int milk;
	
	public int getBean() {
		return bean;
	}

	public int getMilk() {
		return milk;
	}


	void drink() {
		System.out.printf("원두 %dg, 우유 %dml으로 만들어진 라테를 마십니다.", bean, milk);
	}
}

class Americano {
	private int bean;
	private int water;
	private int ice;

	public int getBean() {
		return bean;
	}

	public int getWater() {
		return water;
	}

	public int getIce() {
		return ice;
	}

	void drink() {
		System.out.printf("원두 %dg, 물 %dml, 얼음 %d개로 만들어진 아메리카노를 마십니다.",bean, water, ice);
	}
}

class Coffee {
	static int bean;
	static int water;
	static int ice;
	static int milk;
	
	static int beanUnitPrice;
	static double waterUnitPrice;
	static int iceUnitPrice;
	static int milkUnitPrice;
	
	static int beanTotalPrice;
	static int waterTotalPrice;
	static int iceTotalPrice;
	static int milkTotalPrice;
	
	static int americano;
	static int latte;
	static int espresso;
	
	static {
		beanUnitPrice = 1;
		waterUnitPrice = 0.2;
		iceUnitPrice = 3;
		milkUnitPrice = 4;
		
		beanTotalPrice = 
	}
	void countAmericano() {
		int count = 0;
		count++;
		
	}
	
}
