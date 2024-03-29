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
	
	public Espresso makeEspresso(int bean) {
	Espresso espresso = new Espresso(bean);
	Coffee.countCoffee(espresso);
	return espresso;

	}
	
	Espresso[] makeEspressoes(int bean, int count) {
		
	
		Espresso[] espressoes =new Espresso[count];
		for(int i=0; i<espressoes.length; i++) {
			
			Espresso espresso = new Espresso(bean);
			Coffee.countCoffee(espresso);
			espressoes[i] = espresso;
		}
	
	return espressoes;
	}
	
	Latte makeLatte(int bean, int milk) {
		Latte latte = new Latte(bean, milk);
		Coffee.countCoffee(latte);
		return latte;
		
		
	}
	Latte latte = new Latte(int bean, int milk) {
	
		
	}
	Latte[] makeLattes(int bean, int milk, int count) {
	
	}
	Americano makeAmericano(int bean, int water, int ice) {
		
	}
	Americano[] makeAmericanos(int bean, int water, int ice, int count) {
		
	}
	
	void result() {
		System.out.println("=======================");
		System.out.println("판매 결과");
		System.out.println("=======================");
		System.out.println();
		System.out.println("--------------");
		System.out.println("음료 판매량");	
		System.out.println("--------------");
		System.out.printf("에스프레소: %d잔\n", Coffee.espresso);
		System.out.printf("아메리카노: %d잔\n", Coffee.americano);
		System.out.printf("라테: %d잔\n", Coffee.latte);
		System.out.println();
		System.out.println("--------------");
		System.out.println("원자재 소비량");	
		System.out.println("--------------");
		System.out.printf("원두: %dg\n",Coffee.bean );
		System.out.printf("물: %dml\n",Coffee.water );
		System.out.printf("얼음: %d개\n",Coffee.ice );
		System.out.printf("우유: %dml\n",Coffee.milk );
		System.out.println("--------------");
		System.out.println("매출액");	
		System.out.println("--------------");
		System.out.printf("원두: %d원\n", Coffee.beanTotalPrice);
		System.out.printf("물: %d원\n", Coffee.waterTotalPrice);
		System.out.printf("얼음: %d원\n", Coffee.iceTotalPrice);
		System.out.printf("우유: %d원\n", Coffee.milkTotalPrice);
		System.out.println();
	
	
	
	
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
		
		beanTotalPrice = 0;
		waterTotalPrice = 0;
		iceTotalPrice = 0;
		milkTotalPrice =0;
		
		americano = 0;
		latte = 0;
		espresso = 0;
		
	}
	public static void countCoffee(Americano americano) {
		Coffee.americano++;
		Coffee.bean += americano.getBean();
		Coffee.americano += americano.getIce();
		Coffee.americano += americano.getWater();
		beanTotalPrice += beanUnitPrice*americano.getBean();
		iceTotalPrice += iceUnitPrice * americano.getIce();
		waterTotalPrice += waterUnitPrice*americano.getWater();
		
	}
	public static void countCoffee(Latte latte) {
		Coffee.latte++;
		Coffee.bean += latte.getBean();
		Coffee.latte += latte.getMilk();
		beanTotalPrice += beanUnitPrice*latte.getBean();
		milkTotalPrice += beanUnitPrice*latte.getMilk();
		
	}
	public static void countCoffee(Espresso espresso) {
		Coffee.espresso++;
		Coffee.bean += espresso.getBean();
		beanTotalPrice += beanUnitPrice*espresso.getBean();

	}
	
}
