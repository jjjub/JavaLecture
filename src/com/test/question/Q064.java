package com.test.question;

public class Q064 {

	public static void main(String[] args) {

		int[] random = new int[20];
		int max=0;  
		int min =20;
		String test ="";
		for (int i=0; i<random.length; i++) {
			 random[i]=(int)(Math.random()*20)+1;
			 test += random[i] +",";
			 if(random[i] > max) {
				 max = random[i];	
			 }
			 if(random[i]-min<0) {
				 min = random[i];
			 }
			 
		}
		System.out.printf("원본: %s\n",test);
		System.out.printf("최대값: %d\n",max);
		System.out.printf("최소값: %d",min);
	}


}
