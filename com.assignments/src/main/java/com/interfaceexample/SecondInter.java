package com.interfaceexample;

public class SecondInter implements FirstInter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirstInter inter=new SecondInter();
		inter.show();

	}

	@Override
	public void show() {
		System.out.println("Showing abstract class");
		
	}
	
	public void display() {
		
		
		System.out.println("IAm child class normal");
	}

}
