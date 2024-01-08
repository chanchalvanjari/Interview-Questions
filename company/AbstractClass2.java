package com.company;

abstract class Shape{
	Shape(){
		System.out.println("Draw Shapes.......");
	}
	
	abstract void draw();
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("Draw Rectangle.......");	
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("Draw Circle.......");	
	}
}

public class AbstractClass2 {
	public static void main(String[] args) {
		Shape r=new Rectangle();
		r.draw();
		Circle c=new Circle();
		c.draw();
	}
}
