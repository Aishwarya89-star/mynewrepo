package com.obsqura;

import java.util.Scanner;

public class Positive {

	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("The number is  " +a);
		
		if(a%2==0)
		{
			
			System.out.println("The number is positive");
		}else {
			
			System.out.println("The number is negative");
		}

	}

}
