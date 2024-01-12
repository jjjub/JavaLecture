package com.test.java.obj._static;

public class Ex37_Static {
	// 1. 클래스 로딩, Clss Loading
	// - 프로그램을 실행하기 전에 클래스 정의를 미리 읽어서 메모리에 얹는 작업> 설계도 인식 작업
	// 2. main 메서드 실행
	// 로딩 과정 중에 만나는 모든 static 요소를 메모리에 구현한다.
	public static void main(String[] args) {
		
		/*
		 
		 static 키워드
		 - 지시자(제어자) 중 하나
		 - 클래스 or 클래스 멤버에 붙이는 키워드
		 - 지역변수에 사용 불가
		 1. 멤버 변수
		 2. 멤버 메서드
		 
		 */
		//상황] 학생 3명 >300
		//역삼 중학교
		
		Student s1 = new Student();
		s1.setName("홍길동");
		s1.setAge(15);
		//static 메서드를 접근하는 방식(static way
		Student.setSchool("역삼 중학교");
//		s1.setSchool("역삼 중학교");
		
		Student s2 = new Student();
		s2.setName("아무개");
		s2.setAge(16);
//		s2.setSchool("역삼 중학교");

		Student s3 = new Student();
		s3.setName("임꺽정");
		s3.setAge(16);
//		s3.setSchool("역삼 중학교");
		
		System.out.println(s1.info());
		System.out.println(s2.info());
		System.out.println(s3.info());
		
	}

}
class Student{
	private String name;
	private int age;
	
//	private String school;
	
	private static String school;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
//	public String getSchool() {
//		return school;
//	}
//	public void setSchool(String school) {
//		this.school = school;
//	}
	
	public static String getSchool() {
		return school;
	}
	public static void setSchool(String school) {
		Student.school = school;
	}
	
	public String info() {
		
		//print()
		//String.format()
//		String result = String.format("%d", 100);
		
		return String.format("%s[%d세, %s]"	, this.name
											, this.age
											, this.school);
		
		
		
	}
	
	
	
	
	
	
	
}