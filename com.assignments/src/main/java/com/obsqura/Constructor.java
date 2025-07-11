package com.obsqura;

public class Constructor extends Employee {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor cons=new Constructor();
		cons.calculatesalary();

	}

	@Override
	void calculatesalary() {
		int a=90;
		int hrs=70;
		int c=a*hrs;
		System.out.println(c);
		
	}

}
