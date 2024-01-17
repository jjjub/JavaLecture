package com.test.question;

public class ArrayList {

	public static void main(String[] args) {
		//배열 생성
		Q104 list = new Q104();

		//추가
		list.add("홍길동");
		list.add("아무개");
		list.add("하하하");
		list.add("하하하");
		list.add("하하하");
		list.add("하하하");
		
		System.out.println(list);

//		//읽기
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
//		System.out.println(list.get(7));
//
//		//개수
		System.out.println(list.size());
//
//		//탐색 + 읽기
		for (int i=0; i<list.size(); i++) {
		      System.out.println(list.get(i));
		}
//
//		//수정
		list.set(0, "우하하");
		list.set(4, "푸하하");
		System.out.println(list.get(0));
		System.out.println();
		System.out.println(list);
//
//		//삭제
		list.remove(1);
		System.out.println("삭제 후");
		System.out.println(list);
		
		list.remove("푸하하");
		System.out.println(list);
		
		
		//삽입
		list.add(1, "호호호");
		for (int i=0; i<list.size(); i++) {
		      System.out.println(list.get(i));
		}
//
		//검색
		if (list.indexOf("홍길동") > -1) {
		      System.out.println("홍길동 있음");
		} else {
		      System.out.println("홍길동 없음");
		}

		System.out.println(list.indexOf("호호호"));
		System.out.println(list.lastIndexOf("호호호"));
		System.out.println(list.indexOf("호호호",2));
		System.out.println(list.lastIndexOf("호호호",2));
		//초기화
		list.clear();
		System.out.println(list);
		System.out.println(list.size());
		
		//trimToSize()
		list.add("홍길동");
		list.add("아무개");
		list.add("강아지");
		list.add("고양이");
		list.add("병아리");
		System.out.println(list);
		
		//잘안씀 빈공간제거
		list.trimToSize();
		System.out.println(list);
		
	}

}
