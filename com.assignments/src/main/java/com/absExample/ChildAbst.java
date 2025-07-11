package com.absExample;

public class ChildAbst extends MainAbstr {
	
	
	public void come() {
		
		System.out.println("okey");
	}
	
	

	public static void main(String[] args) {
		
		
		ChildAbst abs=new ChildAbst();
		abs.calculate();
		abs.display();
		abs.come();
		
		
	/*	MainAbstr abd=new ChildAbst();
		abd.calculate();
		abd.display();*/
		

	}

	@Override
	void display() {
		System.out.println("Welcome to Allapuza");
		
	}

}
