package com.company;
import java.util.*;
public class UserDefineMethod {
	//Static Method.
 public static void findEvenOdd(int num) {
	 if(num%2==0) {
		 System.out.println(num+" is a Even Number");
	 }
	 else {
		 System.out.println(num+" is a Odd Number");
	 }
	 
 }
 //instance Method - Non-Static Method.
 
 int add(int a, int b) {
	 int c=a+b;
	 return c;
 }
	public static void main(String[] args) {
		Scanner Sc= new Scanner(System.in);
		 System.out.println("Enter the Number:- ");
		 int x=Sc.nextInt();
		 findEvenOdd(x);
		 System.out.println("Enter the Numbers for Addition :- ");
		 int x1=Sc.nextInt();
		 int y1=Sc.nextInt();
		 UserDefineMethod um=new UserDefineMethod();
		 System.out.println("the Addition is : "+um.add(x1, y1));

;
		 
		}
}
