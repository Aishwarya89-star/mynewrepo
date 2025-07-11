package com.polymorphism;

public class Onseason {
	
	private float cost=100;
	public void discount(float cost) {
		this.cost=cost;
		
		float finalamount=cost*40/100;
		System.out.println(finalamount);
		
	}

}
