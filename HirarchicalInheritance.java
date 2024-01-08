package com.company;
class Animal2{
	void animalEat() {
		 System.out.println("Animal are Eating ........ ");
	}
}

class Dog2 extends Animal2{
	void dogEat() {
		 System.out.println("Dogs are Eating ........ ");
	}
}
class Cat extends Animal2{
	void catEat() {
		 System.out.println("cats are Eating ........ ");
	}
}
public class HirarchicalInheritance {
	public static void main(String[] args) {
		Dog2 d= new Dog2();
		d.dogEat();
		d.animalEat();
		Cat c= new Cat();
		c.catEat();
		c.animalEat();
	}

}
