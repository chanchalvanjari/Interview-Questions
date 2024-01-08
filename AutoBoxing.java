package com.company;

public class AutoBoxing {
	
	public static void main(String[] args) {
		int x=5;
		double y=4.5;
		Integer a= Integer.valueOf(x);
		Double d=Double.valueOf(y);
		if(a instanceof Integer) {
			System.out.println("Object of Integer Class....");
		}
		if(d instanceof Double) {
			System.out.println("Object of Double Class....");
		}
	}
}
