package com.interface1;

public class Goat implements Animal,AnimalKindon {
	
	
	
	public static void main(String args[]) {
		
		Cow cow=new Cow();
		Goat goat=new Goat();
		Cat cat=new Cat();
		
		cow.attack();
		cow.carry();
		cat.attack();
		cat.carry();
		goat.attack();
		goat.carry();
		
		
	}

	@Override
	public void attack() {
		System.out.println("Carrying");
		
	}

	@Override
	public void carry() {
		System.out.println("Welcome");
		
	}

}
