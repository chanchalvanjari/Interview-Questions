package com.company;

public class JavaStrings {
	public static void main(String[] args) {
		String s1="Gmail";
		String s2="Gmail";
		
		String s3= new String("Gmail");
		String s4= new String("Gmail");
		
		if(s1==s2) {
			System.out.println("String S1 and S2 are Equal ");
		}else {
			System.out.println("String S1 and S2 are not Equal ");	
		}

		if(s3==s4) {
			System.out.println("String S3 and S4 are Equal ");
		}else {
			System.out.println("String S3 and S4 are not Equal ");	
		}
		
	}
}
