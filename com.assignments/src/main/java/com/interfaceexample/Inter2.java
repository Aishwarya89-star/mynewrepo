package com.interfaceexample;

public class Inter2 implements Inter1 {

	public static void main(String[] args) {
		Inter2 inter=new Inter2();
		inter.display();
	
		inter.show();
		System.out.println(inter.i);

	}

	@Override
	public void display() {
		System.out.println("Iam invoked abstract method");
		
	}
	
	public void show() {
		
		System.out.println("IAm normal class");
	}

}
