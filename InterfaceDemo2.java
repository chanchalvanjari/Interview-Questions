package com.company;
//Multiple Inheritance.

//interface Printable1{
//	void Print();
//}
//interface Showable{
//	void Print();
//}

interface Printable1{
	void print();
}
interface Showable extends Printable{
	void print();
}
public class InterfaceDemo2 implements Showable {
	
		public static void main(String[] args) {
			
			Showable p=new InterfaceDemo2();
			p.print();
	}
	
		@Override
		public void print() {
			System.out.println("Hello Interface...");
			
		}
		
		
	
}
