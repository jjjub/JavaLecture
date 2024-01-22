package com.test.java.stream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.test.data.Data;
import com.test.data.Item;
import com.test.data.User;
import com.test.java.collection.Member;
import com.test.util.MyUtil;

public class Ex68_Stream {

	public static void main(String[] args) {

		/*
		 * 
		 * 자바 스트림 1. 입출력 스트림 - 파일 입출력, 콘솔 입출력, 네트워크 입출력 등... 2. 스트림 - Java8(1.8) + 람다식과
		 * 같이 출시 - 배열(컬렉션)의 탐색(조작) 기술(********) - 파일 입출력 지원 - 디렉토리 탐색 지원 - 기타 등등...
		 * 여러곳에서 시도 중 - 익명 객체 (적극적으로) 사용 > 람다식 사용 + 함수형 인터페이스
		 * 
		 * 
		 * 표준 API 함수형 인터페이스 1. Consumer - (매개변수) -> {} 2. Supplier - () -> { return 값; }
		 * 3. Function - (매개변수) -> { return 값; } 4. Operator - (매개변수) -> { return 값; } -
		 * 매개변수와 반환값이 동일한 타입 5. Predicate - (매개변수) -> { return 값; } - 반환값이 boolean
		 * 
		 * 
		 *
		*
		 * 
		 * 
		 * 스트림, Stream - 데이터 소스로부터 생성 - list.stream().기능()
		 * 
		 * 파이프, Pipe - 스트림 객체 메서드 1. 중간 파이프
		 * 
		 * 2. 최종 파이프
		 * 
		 * 최종 처리 -forEach() - 최종 파이프 - 앞의 스트림으로부터 요소를 받아 최종 처리하는 메서드
		 * 
		 * 필터링 - filter() - 중간 파이프 - 앞의 스트림으로부터 요소를 받아 조건에 맞는 요소만 남기고 맞지 많은 요소는 버린다.
		 * 
		 * 중복 제거
		 *  - distinct()
		 *  - 중간 파이프
		 *  - 앞의 스트림에서 중복 요소를 제거한다.
		 *  - 유일한 요소만 남아있는 스트림을 반환한다.
		 *  - Set 성질
		 */

//		m1();
//		m2();
//		m3();
//		m4();
//		m5();
		m6();
	}

	private static void m6() {
		// 중복제거
		
		List<Integer> list = Data.getIntList();
		System.out.println(list.size());
		System.out.println();
		
		//위의 집합에서 중복값을 제거하시오. > Set
		//Case 1.
		Set<Integer> set = new HashSet<Integer>();
		for(int n : list) {
			set.add(n);
		}
		System.out.println(set.size());
		
		//case 2.
		Set<Integer> set2 = new HashSet<Integer>(list);
		System.out.println(set2.size());
		
		
		System.out.println(list.stream().count());
		System.out.println(list.stream().distinct().count());
		System.out.println();
//		list.stream().distinct().forEach(num -> System.out.println(num));
		
		
		Data.getStringList().stream()
							.filter(word -> word.length() >=5)
							.distinct()
							.forEach(word -> System.out.println(word));
		System.out.println();
		System.out.println();
		
		
		ArrayList<Member> mlist = new ArrayList<>();
		//서로 다른 인스턴스(주소값이 다름)
		mlist.add(new Member("홍길동", 20));
		mlist.add(new Member("아무개", 25));
		mlist.add(new Member("강아지", 5));
		mlist.add(new Member("고양이", 3));
		mlist.add(new Member("홍길동", 20));
		
		System.out.println(mlist);
		System.out.println();
		
		mlist.stream().forEach(m -> System.out.println(m));
		System.out.println();
		mlist.stream().distinct().forEach(m -> System.out.println(m));
		
		
		
		
		
		
		
		
		
		
	}

	private static void m5() {
		// 문자열
		Data.getStringList().stream()
							.filter(word -> word.length() >= 5)
							.filter(word -> word.startsWith("애"))
							.forEach(word -> System.out.println(word));
		System.out.println();
		
		Data.getUserList().stream()
						.filter(user -> user.getGender()==1)
						.filter(user -> user.getHeight() >= 180)
						.filter(user -> user.getWeight() >= 80)
						.forEach(user -> System.out.println(user));
		System.out.println();
		
	}

	private static void m4() {
		List<Integer> list = Data.getIntList(20);
		System.out.println(list);
		// 짝수만 출력
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 == 0) {
				System.out.printf("%4d", list.get(i));
			}
		}
		System.out.println();
		// 2. 향상된 for
		for (int n : list) {
			if (n % 2 == 0) {
				System.out.printf("%4d", n);
			}
		}
		System.out.println();

		// 3. 스트림
		list.stream().forEach(n -> {
			if (n % 2 == 0) {
				System.out.printf("%4d", n);
			}
		});
		System.out.println();

		// true면 return false면 버린다.
		list.stream().filter(n -> {
			if (n % 2 == 0) {
				return true;
			} else {
				return false;
			}
			// 남은 짝수(true)만 forEach과정을 거치게됨
		}).forEach(n -> System.out.printf("%4d", n));
		System.out.println();

		list.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.printf("%4d", n));
		System.out.println();

		list.stream()
			.filter(n -> n % 2 == 0 && n >= 50)
			.forEach(n -> System.out.printf("%4d", n));
		System.out.println();
		
		//필터 하나당 한줄로 하는게 가독성면에서 좋을 수 있다.
		list.stream()
			.filter(n -> n % 2 == 0)
			.filter(n -> n >= 50)
			.forEach(n -> System.out.printf("%4d", n));
		System.out.println();
		
		
	}

	private static void m3() {
		// 스트림을 얻어오는 방법
		// stream() 메서드를 사용한다.
		// 1. 배열로부터(********)
		// 2. 컬렉션으로부터(*********)
		// 3. 숫자 범위
		// 4. 파일로부터
		// 5. 디렉토리부터

		// 1.순수 배열
		int[] nums1 = { 10, 20, 30, 40, 50 };
		Arrays.stream(nums1).forEach(num -> System.out.println(num));
		System.out.println();

		// 2. 컬렉션으로 부터
		ArrayList<Integer> nums2 = new ArrayList<Integer>();
		nums2.add(100);
		nums2.add(200);
		nums2.add(300);
		nums2.stream().forEach(num -> System.out.println(num));
		System.out.println();

		// LinkedList
		LinkedList<Integer> num3 = new LinkedList<Integer>();
		num3.add(100);
		num3.add(200);
		num3.add(300);
		num3.stream().forEach(num -> System.out.println(num));
		System.out.println();

		// HashSet
		HashSet<Integer> num4 = new HashSet<Integer>();
		num4.add(100);
		num4.add(200);
		num4.add(300);
		num4.stream().forEach(num -> System.out.println(num));
		// HashMap은 지원안함 list,set계열은 지원한다.

		// 3. 숫자로 부터
		IntStream.range(1, 11).forEach(num -> System.out.println(num));
		System.out.println();

		try {
			// 4. 파일 > 읽기 작업
			Path path = Paths.get("dat\\score.txt");
			Files.lines(path).forEach(str -> System.out.println(str));
			System.out.println();

			// 5. 디렉토리 > dir.listFiles()
			Path dir = Paths.get("C:\\class\\dev\\eclipse");
			Files.list(dir).forEach(p -> {
				System.out.println(p.getFileName());
			});

		} catch (Exception e) {
			System.out.println("Ex68_Stream.m3");
			e.printStackTrace();
		}

	}

	private static void m2() {
		// 배열(컬렉션) 탐색
		List<String> list = Data.getStringList(10);

		System.out.println(list);

		// 1.for문(while)
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%s\t", list.get(i));
		}
		System.out.println();
		System.out.println();

		// 2. 향상된 for문
		for (String word : list) {
			System.out.printf("%s\t", word);
		}
		System.out.println();
		System.out.println();

		// 3. iterator
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.printf("%s\t", iter.next());
		}
		System.out.println();
		System.out.println();

		// 4. stream
		// 4.1 list.stream() > ArrayList로부터 스트림 객체를 생성해라
		// 4.2 stream 객체 > ArrayList를 참조
		// 4.3 forEach 실행
		// - stream을 통해서 ArrayList 요소를 접근(하나씩 + 순서대로)
		Stream<String> stream = list.stream();
		//
		stream.forEach(word -> System.out.print(word + "\t"));
		System.out.println();
		System.out.println();

		List<Integer> nums = Data.getIntList(10);
		Stream<Integer> stream2 = nums.stream();
		stream2.forEach(num -> System.out.println(num)); // 한번 소비가 끝난 스트림은 재사용 불가능
//		stream2.forEach(num -> System.out.println(num)); //stream has already been operated upon or closed
		// 배열 .stream().메서드().메서드().메서드().메서드().메서드().메서드().메서드()
		stream2.close();

		nums.stream().forEach(num -> System.out.println(num));

		Data.getUserList().stream().forEach(user -> {
			System.out.println(user.getName());
			System.out.println(user.getAge());
			System.out.println();
		});

	}

	private static void m1() {

		int[] nums1 = Data.getIntArray();
		System.out.println(Arrays.toString(nums1));
//		System.out.println();

		int[] nums2 = Data.getIntArray(10);
		System.out.println(Arrays.toString(nums2));

		List<Integer> nums3 = Data.getIntList();
//		System.out.println(nums3);

		List<Integer> nums4 = Data.getIntList(10);
		System.out.println(nums4);

		String[] txt1 = Data.getStringArray(5);
		System.out.println(Arrays.toString(txt1));

		User[] ulist = Data.getUserArray();
		System.out.println(Arrays.toString(ulist));

		Item[] ilist = Data.getItemArray();
		System.out.println(Arrays.toString(ilist));

		MyUtil util = new MyUtil();

		System.out.println(util.sum(100, 200));

	}

}
