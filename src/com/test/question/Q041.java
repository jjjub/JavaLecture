package com.test.question;

public class Q041 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		String result = "";
		while(sum <= 1000) {
			sum += i;
			result += i;
			if(sum < 1000) {
				result += "+";
			}
			i++;
		}
		System.out.println(result + " = " +sum);

	}

}
