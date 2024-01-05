package com.test.question;

import java.util.Scanner;

public class Q005 {

	public static void main(String[] args) {
		double aInCome, tax;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("한달 수입 금액(원): ");
		double bInCome=sc.nextInt();
		
		tax = bInCome  * 0.033;
		aInCome =bInCome - tax;
		System.out.printf
		("세후 금액(원): %,.0f원 \n세금(원) : %,.0f원", aInCome, tax);
		sc.close();
	}

}

