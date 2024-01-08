package com.company;

interface Printable{
	void print();
}
class A6 implements Printable{
	public void print() {
		System.out.println("Print Somethig.......");	
	}
}
public class InterfaceEx {
	public static void main(String[] args) {
		A6 a=new A6();
		a.print();
	}
}
