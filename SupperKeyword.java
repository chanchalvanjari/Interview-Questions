package com.company;
//use of Super keyword to refer parent class variable, parent class method and parent class constructor.

class Animals{
	String color="White";
	Animals(){
		System.out.println("Animals Constuctor........ ");
	}
	void eat() {
		System.out.println("Animals are Eating......... ");
	}
	
}
class Dogs extends Animals{
	
	Dogs(){
		super();
		System.out.println("Dogs Constuctor........ ");
		
	}
	String color="Black";
	void display() {
		System.out.println("Dogs color "+color);
		System.out.println("Animals color "+super.color);
	}
	void eat() {
		System.out.println("Dogs are Eating......... ");
		super.eat();
	}
}
public class SupperKeyword {
	public static void main(String[] args) {
		Dogs d=new Dogs();
		//d.display();
		//d.eat();
	}
}
