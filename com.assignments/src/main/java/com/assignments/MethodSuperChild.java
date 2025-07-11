package com.assignments;

public class MethodSuperChild extends MethodSuper {
	
	public void show() {
		
		System.out.println("showing the child");
	}
	
	public void display() {
		
		System.out.println("Barking...");
	}
	
	void work() {
		
		super.display();
		show();
		display();
	}

	public static void main(String[] args) {
		MethodSuperChild child=new MethodSuperChild();
		child.work();
		

	}

}
