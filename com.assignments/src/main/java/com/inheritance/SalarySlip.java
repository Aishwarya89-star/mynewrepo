package com.inheritance;

import java.util.Scanner;



public class SalarySlip extends TotalSalary{
	
	
	public void display() {
		
		super.total();
		

	}

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your basic pay");
	int d=sc.nextInt();
	System.out.println("The basic pay is "  +d);
	
	
	System.out.println("enter your deduction");
	int z=sc.nextInt();
	System.out.println("The deduction is "  +z);
	
	
	System.out.println("enter your bonus");
	int e=sc.nextInt();
	System.out.println("The bonus is "  +e);
		
		SalarySlip slip=new SalarySlip();
		
		System.out.println("\n\n\n");
		
		System.out.println("Her showing salaryslip:");
		System.out.println("-----------------------");
		System.out.println("Bonus   " +   e);
		

	}

}
