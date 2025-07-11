package com.obsqura;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		System.out.println("Enter The case ");
		Scanner sc=new Scanner(System.in);
		String case1=sc.nextLine();
		//System.out.println(case1+ "The albhabet is an vowel " );
		
		switch(case1) {
		
		
		case "a": System.out.println("a is a vowel");
		break;
		
		case "b": System.out.println("e is a vowel");
		break;
		
		case "c": System.out.println("i is a vowel");
		break;
		
		case "d": System.out.println("o is a vowel");
		break;
		
		case "e": System.out.println("u is a vowel");
		break;
		
		default:
			System.out.println("Its a consonenet");
		
		
		
		}
		
		

	}

}
