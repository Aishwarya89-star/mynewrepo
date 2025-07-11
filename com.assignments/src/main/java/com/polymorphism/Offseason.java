package com.polymorphism;

public class Offseason {
	
	private int cost=100;
	public void discount(int cost) {
		this.cost=cost;
		
		int finalamount=cost*15/100;
		System.out.println(finalamount);
		
	}

}
