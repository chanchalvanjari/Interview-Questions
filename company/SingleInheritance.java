package com.company;
//Single Inheritance

class Animal{
	void animalEat() {
		 System.out.println("Animal are Eating ........ ");
	}
}

class Dog extends Animal{
	void dogEat() {
		 System.out.println("Dogs are Eating ........ ");
	}
}
public class SingleInheritance {
	public static void main(String[] args) {
		Dog d=new Dog();
		d.animalEat();
		d.dogEat();
		
	}

}
