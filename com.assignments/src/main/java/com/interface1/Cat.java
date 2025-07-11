package com.interface1;

public class Cat implements AnimalKindon,Animal{
	
		
	@Override
	public void carry() {
		System.out.println("The donkey is able to carry loads");
		
	}

	@Override
	public void attack() {
		System.out.println("Lion attacks cat");
		
	}

}

