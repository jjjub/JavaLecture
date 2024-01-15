package com.test.question;

public class Q100 {

	public static void main(String[] args) {
		Packer packer = new Packer();

		// 연필
		Pencil p1 = new Pencil();
		p1.setHardness("HB");
		packer.packing(p1);

		Pencil p2 = new Pencil();
		p2.setHardness("4B");
		packer.packing(p2);

		// 지우개
		Eraser e1 = new Eraser();
		e1.setSize("Large");
		packer.packing(e1);

		// 볼펜
		BallPointPen b1 = new BallPointPen();
		b1.setThickness(0.3);
		b1.setColor("black");
		packer.packing(b1);

		BallPointPen b2 = new BallPointPen();
		b2.setThickness(1.5);
		b2.setColor("red");
		packer.packing(b2);

		// 자
		Ruler r1 = new Ruler();
		r1.setLength(30);
		r1.setShape("줄자");
		packer.packing(r1);

		// 결과 확인
		packer.countPacking(0);
		packer.countPacking(1);
		packer.countPacking(2);
		packer.countPacking(3);
		packer.countPacking(4);

	}

}

class Pencil {
	private String hardness;

	public String getHardness() {
		return hardness;
	}

	public void setHardness(String hardness) {
		this.hardness = hardness;

	}

	public String info() {
		return String.format("%s 진하기 연필입니다.", hardness);
	}

}

class Eraser {
	private String size;

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String info() {
		return String.format("%s 사이즈 지우개입니다.", size);
	}
}

class BallPointPen {
	private double thickness;
	private String color;

	public double getThickness() {
		return thickness;
	}

	public void setThickness(double thickness) {
		this.thickness = thickness;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String info() {
		return String.format("%s색상 %d 진하기 연필입니다.", color, thickness);
	}
}

class Ruler {
	private int length;
	private String shape;

	public int getLength() {
		return length;

	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String info() {
		return String.format("%d cm %s입니다.", length, shape);
	}

}

class Packer {
	private static int pecilCount;
	private static int eraserCount;
	private static int ballPointPenCount;
	private static int rulerCount;

	public void Packing(Pencil pencil) {
		System.out.println("포장 전 검수: " + pencil.info());

		if (pencil.getHardness() == "4B" || pencil.getHardness() == "3B" || pencil.getHardness() == "2B"
				|| pencil.getHardness() == "B" || pencil.getHardness() == "HB" || pencil.getHardness() == "H"
				|| pencil.getHardness() == "2H" || pencil.getHardness() == "3H" || pencil.getHardness() == "4H") {
			pecilCount++;
			System.out.println("포장을 완료했습니다.");
		} else {
			System.out.println("포장을 실패하였습니다.");
		}

	}
	
	public void Packing(Eraser eraser) {
		System.out.println("포장 전 검수 : "+eraser.info());
		if (eraser.getSize() == "Large" || eraser.getSize() == "Medium" || eraser.getSize() == "Smll") {
			eraserCount++;
			System.out.println("포장을 완료했습니다.");
		}else {
			System.out.println("포장을 실패하였습니다.");
		}
	}
	
	public void Packing(BallPointPen ballPointPen) {
		System.out.println("포장 전 검수 : " + ballPointPen.info());
		if(ballPointPen.getColor() == "red" || ballPointPen.getColor() == "blue" ||ballPointPen.getColor() == "green" ||ballPointPen.getColor() == "black") {
			if(ballPointPen.getThickness() == 0.3 ||ballPointPen.getThickness() == 0.5 || ballPointPen.getThickness() == 0.7 || ballPointPen.getThickness() == 1.0 || ballPointPen.getThickness() == 1.5 ) {
				
				ballPointPenCount++;
				System.out.println("포장을 완료했습니다.");
			}
		}else {
			System.out.println("포장을 실패하였습니다.");
		}
		
	}
	
	public void Packing(Ruler ruler) {
		System.out.println("포장 전 검수 : " + ruler.info());
		if(ruler.getLength())
	}

}
