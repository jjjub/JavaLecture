package com.test.question;

public class Q064 {

	public static void main(String[] args) {

		int[] random = new int[20];
		int max=random[0];  
		int min = random[0];
		int num;
		String test ="";
		for (int i=0; i<20; i++) {
			 num=(int)(Math.random()*20)+1;
			 random[i] = num;
			 test += num+",";
			 if(num > max) {
				 max = num;	
			 }
			 if(num<min) {
				 min = num;
			 }
			 
		}
		System.out.print("원본: ");
		System.out.println(test);
		System.out.printf("최대값: %d\n",max);
		System.out.printf("최소값: %d",min);
	}

}
