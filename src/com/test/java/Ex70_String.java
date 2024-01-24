package com.test.java;

public class Ex70_String {

	public static void main(String[] args) {
		
		// 문자열 성질
		//"문자열은 불변(immutable)이다."
//		m1();
		m2();

		
		
		
		
		
	}

	private static void m2() {
//		String txt = "홍길동";
//		txt = txt + "님";
//		System.out.println(txt);
//		
//		String txt2 = "홍길동님";
//		System.out.println(txt2);
		
		//문자열의 잦은 조작 > 다량의 Garbage를 생성(메모리 낭비)
		
		long begin = 0, end = 0;
		String txt = "홍길동";
		begin = System.currentTimeMillis();
		for (int i=0; i< 100000; i++) {
			txt += ".";
		}
		
		end = System.currentTimeMillis();
		
		System.out.printf("길이 : %,d자\n시간: %,dms\n", txt.length(), end - begin);
		
		
	
//		String txt = "홍길동";
		//잦은 조작, 규모가 큰 조작의 경우 사용
		begin = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder("홍길동");
		
		for (int i=0; i< 100000; i++) {
			sb.append(".");
		}
		
		end = System.currentTimeMillis();
		
		System.out.printf("길이 : %,d자\n시간: %,dms\n", sb.length(), end - begin);
		
	}

	private static void m1() {
		
		//값형(고정)
		int n1 = 10;		//크기 > 4byte
		int n2 = 100000;	//크기 > 4byte
		
		//참조형
		int[] ns1 = { 10, 20, 30}; 			//12byte
		int[] ns2 = { 10, 20, 30, 40, 50 }; //20byte
		
		String s1 = "홍길동";			//6byte
		String s2 = "홍길동입니다.";	//14byte
		
		String s3 = "문자열문자열문자열문자열문자열";
		String s4 = "문자열문자열문자열문자열문자열";
		String s5 = "문자열문자열문자열";
		s5 += "문자열문자열";
		System.out.println(s3 == s4);
		System.out.println(s3 == s5); //주소값이 다름 > equals사용
		System.out.println(s3.equals(s5)); //오버라이딩
		
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		//문자열은 사이드이펙트 적용이 안된다.
		s4 = s4 + ".";
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
	}

}


class Item{
	
	private int sum;
	private String type;
//	@Override
//	public String toString() {
//		return "Item [sum=" + sum + ", type=" + type + "]";
//	}
	
	
//	@Override
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("Item [sum=");
//		builder.append(sum);
//		builder.append(", type=");
//		builder.append(type);
//		builder.append("]");
//		return builder.toString();
//	}
	
//	@Override
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("Item [sum=").append(sum).append(", type=").append(type).append("]");
//		return builder.toString();
//	}
	
	@Override
	public String toString() {
		return String.format("Item [sum=%s, type=%s]", sum, type);
	}
	
}








