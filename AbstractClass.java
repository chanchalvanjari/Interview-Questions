package com.company;
abstract class Bike{
	abstract void run();
	void start() {
		System.out.println("Bike is Starting.......");
	}
}
class Honda4 extends Bike{
	void run()
	{
		System.out.println("Bike is Running.......");	
	}
}

public class AbstractClass {
	public static void main(String[] args) {
		Bike b=new Honda4();
		b.run();
		b.start();
	}
}
