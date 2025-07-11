package com.obsqura;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		
		/*System.out.println("Enter the row size");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println(a);*/
		int a[][]= {{1,2,3},{1,2,3},{1,2,3}};
		
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				
				
				System.out.print(a[i][j]+"\t");
			}
			System.out.println("\n");
		}

	}

}
