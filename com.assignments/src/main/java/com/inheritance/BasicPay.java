package com.inheritance;

import java.util.Scanner;

public class BasicPay {
	
	
	int basic;
	float deduction;
	int bonus;
	
	
	public void takein() {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter basic");
		basic=sc.nextInt();
		System.out.println("Enter deduction");
		deduction=sc.nextFloat();
		System.out.println("Enter bonus");
		bonus=sc.nextInt();
		
		
	}
	

}
