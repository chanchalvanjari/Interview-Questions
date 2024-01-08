package com.company;

public class Unboxing {

	public static void main(String[] args) {
		
		Integer a= Integer.valueOf(23);
		Double d=Double.valueOf(67.8);
		
		int x=a.intValue();
		double y=d.doubleValue();

		System.out.println(x);
		System.out.println(y);
	}
}
