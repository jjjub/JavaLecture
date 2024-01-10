package com.test.question;

public class Q063 {
	
	public static void main(String[] args) {
		int[] list = new int[4];
		
		list[0] = 10;
		list[1] = 20;
		list[2] = 30;
		list[3] = 40;
		
		String result = dump(list);
		System.out.printf("nums = %s\n", result);
	}

	private static String dump(int[] list) {
		String result ="[";
		for(int i=0; i<list.length; i++) {
			if(i ==0) {
				result += list[i];
			}else {
			result += "," + list[i];
			}
		}
		result += "]";
		return result;
	}

}
