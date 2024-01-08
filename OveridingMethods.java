package com.company;

class Vehicle{
	void run() {
		System.out.println("Vehicle is running");
	}
}

public class OveridingMethods extends Vehicle{
	public static void main(String[] args) {
		OveridingMethods ov=new OveridingMethods();
		ov.run();
	}
}
