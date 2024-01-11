package com.test.question.obj;

public class Note {
	private String size;
	private String color;
	private int page;
	private String owner;
	private int price;
	
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
	public String info() {
		String tmp ="";
		
		String thickPage ="";
		
		if(this.page > 10 && this.page<=50) {
			thickPage = "얇은";
		}else if(this.page > 51 && this.page <= 100){
			thickPage ="보통";
		}else if(this.page >= 101 && this.page <=200) {
			thickPage ="두꺼운";
		}
		
		
		if(owner == null) {
			tmp+="■■■■■■■■■■■노트정보■■■■■■■■■■■■■\r\n";
			tmp+="주인없는 노트\r\n";
			tmp+="■■■■■■■■■■■■■■■■■■■■■■■■■■■■■";
		}else {
		
		tmp += "■■■■■■■■■■■노트정보■■■■■■■■■■■■■\r\n";
		tmp +="소유자 : "+ owner + "\r\n";
		tmp +="특성 : " + color+" "+thickPage+" " + size +"노트\r\n"; 
		tmp +="가격 : " + getPrice(price) + "\r\n";
		tmp += "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\r\n";


		}
		
		return tmp;
	}
	
	
	private int getPrice(int price) {
		int sumPrice = 500;
		if(size == "A3") {
			sumPrice += 300;
		}else if(size == "A4") {
			sumPrice += 200;
		}else if(size == "B3") {
			sumPrice += 500;
		}else if(size == "B4") {
			sumPrice += 300;
		}else if(size == "B5") {
			sumPrice += 100;
		}
		
		if(color == "검정색" ) {
			sumPrice += 100;
		}else if(color == "노란색") {
			sumPrice += 200;
		}else if(color == "파란색") {
			sumPrice += 200;
		}
		
		if(page > 10) {
			sumPrice += (page - 10) * 10;
		}
		price = sumPrice;
		
		if(size == "A5" && color == "white" && page <= 10) {
			price = 500;
		}		 
		return price;
	}
}

