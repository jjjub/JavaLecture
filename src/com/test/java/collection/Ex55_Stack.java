package com.test.java.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex55_Stack {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * 
		 * ADT, Abstract Data Type(추상적 자료형) - 배열 + 사용법 용도에 맞게 구현 - Stack - Queue
		 * 
		 * Stack - 후입선출 - LIFO, Last Input First Output - 저장소에 나중에 들어간 요소가 먼저 나온다. ex)
		 * 메모리 구조(Stack) ex) 되돌리기(Ctrl + z), 다시하기(Ctrl + Y) ex) 브러우저 > 뒤로가기 , 앞으로가기
		 * 
		 * Queue - 선입선출 - FIFO, First Input First Output - 저장소에 먼저 들어간 요소가 먼저 나온다. ex)
		 * 줄서기 ex) 주문리스트 ex) 순서가 있는 모든 목록
		 * 
		 * 
		 * 
		 */
//		m1();
//		m2();
		m3();

	}

	private static void m3() {

		// 배열 생성
		MyQueue queue = new MyQueue();
		System.out.println(queue);

		// 추가
		queue.add("빨강");
		queue.add("노랑");
		queue.add("파랑");
		queue.add("주황");
		queue.add("검정");

		System.out.println(queue);
//
		// 읽기
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue);

		// 개수
		System.out.println(queue.size());

		// 확인
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue.size());

//		//크기 조절
//		queue.trimToSize();

		// 초기화
		queue.clear();
		System.out.println(queue.size());

	}

	private static void m2() {
		// Queue
		Queue<String> queue = new LinkedList<String>(); // Queue는 인터페이스이기 때문에 객체를 만들수 없다 > 자식객체(LinkedList업캐스팅)

		// 1. 요소 추가하기
		// boolean add(T value)
		queue.add("빨강"); // enqueue()
		queue.add("노랑");
		queue.add("파랑");

		// 2 요소 개수
		System.out.println(queue.size());

//		// 3. 요소 읽기
//		System.out.println(queue.poll()); // dequeue()
//		System.out.println(queue.size());
//
//		System.out.println(queue.poll()); // dequeue()
//		System.out.println(queue.size());
//		System.out.println(queue.poll()); // dequeue()
//		System.out.println(queue.size());
//
//		System.out.println(queue.poll()); //오류 > null

//		while(queue.size() >0) {
//			System.out.println(queue.poll());
//		}

		// 4. 요소 미리보기
		System.out.println(queue.peek());

	}

	private static void m1() {

		// Stack
		Stack<String> stack = new Stack<String>();

		// 1. 요소 추가하기
		// T push(T value)
		stack.push("빨강");
		stack.push("노랑");
		stack.push("파랑");

		// 2. 요소 개수
		// int size()
		System.out.println(stack.size());

		// 3. 요소 읽기
		// T pop()
//		System.out.println(stack.pop());	//읽기이자 제거
//		System.out.println(stack.size());
//		
//		System.out.println(stack.pop());	
//		System.out.println(stack.size());
//		
//		System.out.println(stack.pop());	
//		System.out.println(stack.size());
//		
////		System.out.println(stack.pop());	//Error

//		for(int i=0; i<3; i++) {	//i<3 > i<stack.size()하면 안됨 > 사이즈가 계속 줄기 때문			
//		System.out.println(stack.pop());	
//		}

		// 3. 빈배열
		System.out.println(stack.isEmpty());

//		while(stack.size() > 0) {
//		System.out.println(stack.pop());	
//		}

		// 4. 이번에 pop()을 하면 가져오게 될 요소 미리보기
		System.out.println(stack.peek());
		System.out.println(stack.size());

		System.out.println(stack.peek());

	}

}
