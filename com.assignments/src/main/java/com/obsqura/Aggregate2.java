package com.obsqura;

public class Aggregate2 {
	
	
	int postalcode;
	String home;
	Aggregat1 aggregae;
	
	
	public Aggregate2(int postalcode,String home,Aggregat1 aggregae){
		
		this.postalcode=postalcode;
		this.home=home;
		this.aggregae=aggregae;
	}
	
	public void display() {
		System.out.println(aggregae.rollno+ "  "+aggregae.studname);
		System.out.println(home+ "  "+postalcode);
		
		
	}

	public static void main(String[] args) {
		Aggregat1 ass=new Aggregat1("Aishwarya", 12);
		Aggregate2 add1=new Aggregate2(123,"Kalpakasseril",ass);
	
		

		add1.display();
		
	
		
	

	}
	
	

}
