package com.company;

class A{
	A(){
		System.out.println("Class A");	
	}
	void method1() {
		System.out.println("Method1 of A");
	}
	static void staticMethod() {
		System.out.println("staticMethod");
	}
	static {
		System.out.println("static Block");
	}
	{
		System.out.println("Non-static Block");
	}
	
}

public class SuperClass {
	public static void main(String[] args) {
		A a=new A();
	}
}
