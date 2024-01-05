package com.test.java;

public class Ex14_Method {
	//main 메서드
	//특수 메서드
	//이름이 예약된 메서드(main)
	//프로그램이 시작되면 자동으로 호출되는 메서드
	//프로그램의 시작점(Entry Point)
	//프로그램의 종착점(End Point)
public static void main(String[] args) {
	

		
		//요구사항) "안녕하세요" x5번 출력
		//case A.
		// 가장 단순한 방법
		// 비용 : 10 x 5 = 50
		System.out.println("반갑습니다.");
		System.out.println("반갑습니다.");
		System.out.println("반갑습니다.");
		System.out.println("반갑습니다.");
		System.out.println("반갑습니다.");
		System.out.println();
		
		printNumber();
		//메서드 호출
		hello();
	
		
}


	//메서드 호출
		
		//메서드 선언
		//메서드 헤더(header), Signature(서명)
		//몸통(Body), 구현부
		//{코드;}
		//접근지정자 정적키워드 변환타입 메서드명   인자리스트
		// public    static     void     hello    (){
	public static void hello(){
		//구현부 > 메서드가 하려는 업무
		int i;
		for(i=0; i<5; i++) {
		System.out.println("반갑습니다.");
		}
	}
	public static void printNumber() {
		System.out.println("하나");
		System.out.println("둘");
		System.out.println("셋");
		System.out.println("넷");
		System.out.println("다섯");
		System.out.println("여섯");
		System.out.println("일곱");
		System.out.println("여덜");
		System.out.println("아홉");
		System.out.println("열");
	}

}
