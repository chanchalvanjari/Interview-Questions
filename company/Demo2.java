package com.company;

import java.util.Scanner;

public class Demo2 {
	 public static void main(String[] args) {
			Scanner Sc=new Scanner(System.in);
			System.out.println("Enter the Value of n :- ");
			int n=Sc.nextInt();
			for(int i=1;i<=n;i++) {
				 for (int s=n-i;s>0;s--) {
					  System.out.print("  ");
				  }
				
			  for (int j=1;j<=i;j++) {
				  System.out.print(" *");
			  }
			  System.out.println(" ");
			}
		}
}
