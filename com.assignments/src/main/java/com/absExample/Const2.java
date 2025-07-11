package com.absExample;

public class Const2 extends Const1 {

	public static void main(String[] args) {
		
		Const1 con=new Const2();
		con.run();
		con.waits();
		
		

	}

	@Override
	void run() {
		System.out.println("run safely");
		
	}

}
