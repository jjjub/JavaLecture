package com.test.java.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Ex63_TreeSet {

	public static void main(String[] args) {
		/*
		 
		 
		 컬렉션 이름
		 
		 [물리구조]	[사용법=인터페이스]
		 Array 			+ List
		 Linked 		+ List
		 
		 Hash 			+ Set
		 Tree 			+ Set
		 
		 Hash 			+ Map
		 Tree 			+ Map
		 
		 TreeSet
		 - 순서가 없다.
		 - 중복값을 가지지 않는다.
		 - 이진 탐색 트리 구조, Binary Search Tree
		 - 크면 오른쪽 작으면 왼쪽에 배치
		 - 내부 데이터가 정렬이 되어 있는 구조로 저장.
		 - 
		 
		 
		 */

		
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		set.add(5);
		set.add(2);
		set.add(6);
		set.add(8);
		set.add(1);
		set.add(9);
		set.add(10);
		set.add(7);
		set.add(3);
		set.add(4);
		
		System.out.println(set);
		
		//범위 관련 기능 제공(= List 계열이 할 수 있음)
		System.out.println(set.first());
		System.out.println(set.last());
		
		//범위: 시작위치(포함) ~ 끝위치(미포함)
		System.out.println(set.headSet(3));
		System.out.println(set.tailSet(7));
		System.out.println(set.subSet(3, 7));
		
		//HashSet & TreeSet > iterator, 향상된 for문
		
		Iterator<Integer> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println();
		
		for(int n : set) {
			System.out.println(n);
		}
		
		//Set 사용
		// HashSet vs TreeSet > HashSet
		
		
		
	}

}
