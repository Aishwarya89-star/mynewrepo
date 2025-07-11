package com.inheritance1;

public class Sheep extends Dog {
	
	
	void sleep() {
		
		
		System.out.println("sheep is sleeping");
	}

	public static void main(String[] args) {
		
		Sheep s=new Sheep();
		Dog dg=new Dog();
		Cow cow=new Cow();
		s.sleep();
		dg.eat();
		cow.bark();
		

	}

}
