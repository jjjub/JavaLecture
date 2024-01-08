package com.test.java;

public class Ex22_swtich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 
switch (조건){
    case 값:
        구현부;
        break;
    [case 값:
        구현부;
        break;] x N
    [default:
       	구현부;
        break;] - 생략가능
}
```
		 
		 */
		
		m1();

	}

	private static void m1() {
		//요구사항] 숫자를 1개 입력받아 한글로 출력하시오.
		//1 > "하나"
		//2 > "둘"
		
		int num = 1;
		
		if (num == 1) {
			System.out.println("하나");
		}else if (num == 2) {
			System.out.println("둘");
		}else if (num == 3) {
			System.out.println("셋");
		}
		
	}

}
