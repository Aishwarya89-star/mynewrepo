package com.obsqura;

public class HDFC implements RBI{

	public static void main(String[] args) {
		RBI rbi=new HDFC();
		rbi.show();

	}

	@Override
	public void show() {
		double recur=amount*duration;
		System.out.println(recur);
		
	}

}
