package com.test.question;


public class Q097 {

	public static void main(String[] args) {
		Refrigerator r = new Refrigerator();

		Item item1 = new Item();
		item1.setName("김치");
		item1.setExpiration("2024-01-29");
		r.add(item1);// 냉장고에 넣기

		Item item2 = new Item();
		item2.setName("깍두기");
		item2.setExpiration("2024-01-22");
		r.add(item2);// 냉장고에 넣기

		Item item3 = new Item();
		item3.setName("멸치볶음");
		item3.setExpiration("2024-01-24");
		r.add(item3);// 냉장고에 넣기

		Item item4 = r.get("깍두기");// 냉장고에서 꺼내기
		System.out.printf("%s의 유통기한 : %s\n", item4.getName(), item4.getExpiration());

		System.out.printf("냉장고 안의 총 아이템 개수 : %d개\n", r.count());

		r.listItem();

	}

}

class Refrigerator {
	private Item[] items = new Item[100];
	private int count = 0; // 아이템 개수

	public void add(Item item) {
		items[this.count] = item;
		this.count++;

		System.out.println(item.getName() + "을 냉장고에 넣었습니다.");
	}

	public Item get(String name) {
		Item item = null;
		int itemIndex = 0;
		for (int i = 0; i < this.count; i++) {
			if (this.items[i].getName().equals(name)) {
				itemIndex = i;
				for (int j = i; j < this.count; j++) {
					items[itemIndex] = items[itemIndex + 1];
				}
				item = this.items[i];
			}
		}
		count--;
		return item;
	}

	public int count() {
		return this.count;
	}

	public void listItem() {
		System.out.println("[냉장고 아이템 목록]");
		for (int i = 0; i < this.count; i++) {
			Item item = this.items[i];
			System.out.printf("%s(%s)", item.getName(), item.getExpiration());
		}
	}
}

class Item {
	private String name;
	private String expiration;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExpiration() {
		
		return expiration;
	}

	public void setExpiration(String expiration) {
		
		this.expiration = expiration;
	}
}