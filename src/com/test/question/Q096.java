package com.test.question;

public class Q096 {

	public static void main(String[] args) {
		Box box1 = new Box();

		box1.cook();
		box1.check();
		box1.list();

	}

}

class Box {
	private Macaron[] list = new Macaron[10];

	public void cook() {
		String[] color = { "red", "blue", "yellow", "white", "pink", "purple", "green", "black" };
		for (int i = 0; i < list.length; i++) {
			Macaron macaron = new Macaron();

			macaron.setColor(color[(int) (Math.random() * 8)]);
			macaron.setSize((int) (Math.random() * 11) + 5); // 5 ~ 15
			macaron.setThickness((int) (Math.random() * 20) + 1); // 1~20

			this.list[i] = macaron;
		}
		System.out.printf("마카롱을 %d개 만들었습니다.", this.list.length);
		System.out.println();

	}

	public boolean check() {
		for (int i = 0; i < list.length; i++) {
			if (!(list[i].getSize() >= 8 && list[i].getSize() <= 14)) {;
				return false;
			} else if (list[i].getColor().equals("black")) {
				return false;
			}
				return true;
			
		}
		
	}

	public boolean check(Macaron macaron) {
		int pass = 0;
		int failed = 0;
		for (int i = 0; i < list.length; i++) {
			if (!(list[i].getSize() >= 8 && list[i].getSize() <= 14)) {
				failed++;
				return false;
			} else if (list[i].getColor().equals("black")) {
				failed++;
				return false;
			} else {
				pass++;
				return true;
			}
		}
		System.out.println("[박스 체크 결과]");
		System.out.printf("QC 합격 개수 : %d\n", pass);
		System.out.printf("QC 불합격 개수 : %d\n", failed);
		System.out.println();
		return true;

	}

	public void list() {
		for (int i = 0; i < list.length; i++) {
			Macaron macaron = this.list[i];
			System.out.printf("%d번 마카롱 : %dcm(%s, %dmm) : %s\n", i, list[i].getSize(), list[i].getColor(),
					list[i].getThickness(), check(macaron) ? "합격" : "불합격");
		}

	}
}

class Macaron {
	private int size;
	private String color;
	private int thickness;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getThickness() {
		return thickness;
	}

	public void setThickness(int thickness) {
		this.thickness = thickness;
	}
}