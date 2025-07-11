package com.hierarchial;

public class ChildCow extends ParentAnimal{
	
	void show2() {
		
		System.out.println("Dog showing");
	}

	public static void main(String[] args) {
		ChildCow cow=new ChildCow();
		ParentAnimal animal= new ParentAnimal();
		ChildCat cat=new ChildCat();
		
		cow.show2();
		cow.show();
		
		
		
		
	}

}
