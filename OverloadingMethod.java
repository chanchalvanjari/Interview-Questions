package com.company;

class Adder{
//	public static int add(int a,int b) {
//		int c=a+b;
//		return c;
//	}
//	public static int add(int a,int b,int d) {
//		int c=a+b+d;
//		return c;
//	}
	
	
	public static float add(float a,int b) {
		float c=a+b;
		return c;
	}
	public static float add(float a,int b,int d) {
		float c=a+b+d;
		return c;
	}
}

public class OverloadingMethod {
	//Overloading with Main Method.....We can Also overload the main method.

	public static void main(String[] args) {
//		 System.out.println(Adder.add(11.9f,11));
//		 System.out.println(Adder.add(11.4f,11,11));
		 
		System.out.println("Main Method with String[] args");
		 
	}
	public static void main(String args) {
		System.out.println("Main Method with String args");
	}
	public static void main() {
		System.out.println("Main Method without argument ");
	}

}
