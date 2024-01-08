package com.company;

public class Ellipsis {
	static void display(String ...values) {
		for(String s:values) {
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		display();
		display("Punam","Mona");
		display("xyz","AbC","LMN");
		display("ABCD","KBCNMU","hello","World");
		
	}
}
