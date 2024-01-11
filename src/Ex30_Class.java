

public class Ex30_Class {

	public static void main(String[] args) {

		// 요구사항] 지도 > 우리집 > 좌표 저장
		// Case 1.
		// 가장 간단하 방법
		// 식별자 문제 > 같은 성질의 식별자가 서로 다른 이름을 사용
		//              > 구조를 물리적으로 보장 안함
		// 구조적 문제 > 규칙(x), 조작 불편
		// 우리집 좌표
		int x = 100;
		int y = 200;

		System.out.printf("우리집은 [%d,%d]에 위치합니다.\n", x, y);

		// 마트 좌표
		int x2 = 300;
		int y2 = 400;

		System.out.printf("마트는 [%d,%d]에 위치합니다.\n", x2, y2);

		// Case 2.
		// 배열 사용
		//데이터 저장 가능한 구조 생성 > 집합 > 관리 용이+ 가독성 
		//배열 단점 > 요소의 성질 차이를 구분 불가능 > 배열은 요소를 첨자로 구분한다. > 방번호는 의미를 가질수 없다.

		// 우리집 좌표
		// 정수 x2개
		int[] a1 = { 100, 200 };
		
		System.out.printf("우리집은 [%d,%d]에 위치합니다.\n", a1[0], a1[1]);
		
		
		//마트 좌표
		int[] a2 = { 200, 300 };
		
		System.out.printf("마트는 [%d,%d]에 위치합니다.\n", a2[0], a2[1]);
		
		
		//Case 3.
		//클래스 사용(class 밖에서 (=메서드)
		//데이터 저장 구조 > 관리 용이
		//각 멤버의 이름을 지정 가능 > 데이터 성질 구분 용이
		//초기 비용 발생
		
		
		//설계한 클래스로부터 객체(인스턴스)를 만드는 방법
		//자료형 변수명 = new 생성자();
		//자료형 객체(명, 변수) = 객체생성연산자 생성자()(클래스명과 동일한 메서드)
		
		//붕어빵 틀을 사용해서 붕어빵 1개를 만들었다.
		//우리집 좌표
		Point p1 = new Point();
		
		p1.x = 100;
		p1.y = 200;
		
		System.out.printf("우리집은 [%d,%d]에 위치합니다.\n", p1.x, p1.y);
		
		//마트 좌표
		Point p2 = new Point();
		
		p2.x = 300;
		p2.y = 400;
		
		System.out.printf("마트는 [%d,%d]에 위치합니다.\n", p2.x, p2.y);
		
		//모니터
		Size monitor = new Size();
		
		monitor.name = "LG 모니터";
		monitor.width = 1920;
		monitor.height = 1080;
		
		System.out.println(monitor.name + ": " + monitor.width + "x" + monitor.height);
		
		Score s1 = new Score();
		
		s1.name ="홍길동";
		s1.kor = 100;
		s1.eng = 90;
		s1.math = 80;
		
		
	}

}//Ex30_Class

//클래스 선언하기(= 붕어빵 틀 만들기)
//클래스명 : 파스칼 표기법
class Point {

	//구현부
	//클래스 멤버 선언하기
	//1. 변수
	//2. 메서드
	
	//멤버 변수
	
	public int x;
	public int y;
	
}


class Size {
	public String name;
	public int width;
	public int height;
}


class Score{
	public String name;
	public int kor;
	public int eng;
	public int math;
}



