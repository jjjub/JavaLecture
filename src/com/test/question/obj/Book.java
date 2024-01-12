package com.test.question.obj;


public class Book {
	private String title;
	private int price;
	private String author;
	private String publisher;
	private String pubYear = "2019";
	private String isbn;
	private int page;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		for(int i=0; i<title.length(); i++) {
		char c =title.charAt(i);
		if(title.length()> 50 && (c<'A'||c>'B') && (c<'a' || c<'b') && (c<'0' || c>'9')&& c!=' ') {
			return;
		}else {
		this.title = title;
		}
	}
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price > 1000000) {
			return;
		}else {
		this.price = price;
		}
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		if(page < 0) {
			System.out.println("1이상의 값을 입력하시오.");
		}else {
		this.page = page;
		}
	}
	public String getPubYear() {
		return pubYear;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public String info() {
		String temp = "";
		temp += "제목: " + title + "\r\n";
		temp += "가격: " + price + "원" + "\r\n";
		temp += "저자: " + author + "\r\n";
		temp += "출판사: " + publisher + "\r\n";
		temp += "발행년도: " + pubYear + "년" + "\r\n";
		temp += "ISBN: " + isbn + "\r\n";
		temp += "페이지: " + page + "장" +"\r\n";
		
		return temp;
	}

}
