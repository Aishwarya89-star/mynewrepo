package com.assignments;

public class ChildResult extends AdditionResult {
	
	
	public void display() {
		
		
	
System.out.println(super.result());
	}

	public static void main(String[] args) {
		
		ChildResult child=new ChildResult();
		child.display();
		
	}

}
