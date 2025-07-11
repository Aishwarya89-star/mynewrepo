package com.obsqura;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		
		System.out.println("Enter The mark ");
		Scanner sc=new Scanner(System.in);
		int marks=sc.nextInt();
		System.out.println("The mark is  " +marks);
		
		if(marks<40) {
			
			
			System.out.println("Failed");
		}
		
		else if(marks>40&&marks<60) {
			System.out.println("Grade D");
			
			
			
		}else if(marks>61&&marks<70) {
		
			System.out.println("Grade C");
		}
		
		else if(marks>71&&marks<80) {
			
			System.out.println("Grade B");
		}
		else
			System.out.println("Grade A");
		
		
	}

}
