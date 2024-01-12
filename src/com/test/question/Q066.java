package com.test.question;


public class Q066 {

	public static void main(String[] args) {

		int[] lotto = new int[6];
		String result ="[";
		for (int i = 0; i < lotto.length; i++) {
			int random = (int) (Math.random() * 45) + 1;
			lotto[i] = random;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		for(int i=0; i<lotto.length; i++) {
			if(i ==0) {
				result += lotto[i];
			}else {
			result += "," + lotto[i];
			}
		}
		result += "]";
		System.out.println(result);
	
	}

}
