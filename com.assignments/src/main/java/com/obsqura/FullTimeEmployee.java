package com.obsqura;

public class FullTimeEmployee extends Employee {

	
	
	public void current() {
		
		int a=90;
		int b=20;
		int c=a*b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		FullTimeEmployee emp=new FullTimeEmployee();
		emp.calculatesalary();
		emp.current();

	}

	@Override
	void calculatesalary() {
		
		double working=8909.90;
		int a=8;
		double z=working*a;
		System.out.println(z);
		
		
	}

}
