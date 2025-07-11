package com.interfaceexample;

public class ShowingActivities implements Animal,Birds{

	public static void main(String[] args) {
		ShowingActivities show=new ShowingActivities();
		show.bark();
		show.fly();
		show.eat();
		

	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
		System.out.println("Flying...");
		
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("Barking...");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
		System.out.println("eating...");
		
	}

}
