package com.company;

public class StringsMethods {
	public static void main(String[] args) {
		String s="Punam";
	//	s.concat(" Mona"); implicitly return another object.
		String s1=s.concat("   Mistari");
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.trim());
	}
}
