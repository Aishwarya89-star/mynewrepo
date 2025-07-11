package com.obsqura;

import java.util.Scanner;

public class DrivingLicesence {

	public static void main(String[] args) {
		System.out.println("Enter The age is");
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		System.out.println("The age is  " +c);
		
		if(c>18) {
			
			System.out.println("\n eligible for driving licesnse");
		}

	}

}
