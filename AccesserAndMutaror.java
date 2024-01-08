package com.company;

import java.util.Scanner;

public class AccesserAndMutaror {

private String name;
private int Roll;

 
 void setRoll(int Roll) {
	 this.Roll=Roll;
 }
 int getRoll() {
		return Roll;
	}
 void setName(String name) {
	 this.name=name;
 }
 String getName() {
		return name;
	}
	public static void main(String[] args) {
		Scanner Sc= new Scanner(System.in);
		 System.out.println("Enter the Roll:- ");
		 int x=Sc.nextInt();
		 System.out.println("Enter the Name :- ");
		String nm=Sc.next();
		AccesserAndMutaror a=new AccesserAndMutaror();
		a.setName(nm);
		a.setRoll(x);
		 System.out.println("Roll no:- "+a.getRoll());
		 System.out.println("Name :- "+a.getName());
		
	}
}
