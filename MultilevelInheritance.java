package com.company;

class Animal1{
	void animalEat() {
		 System.out.println("Animal are Eating ........ ");
	}
}

class Dog1 extends Animal1{
	void dogEat() {
		 System.out.println("Dogs are Eating ........ ");
	}
}
class BabyDog extends Dog1{
	void BabydogEat() {
		 System.out.println("Dogs are Eating ........ ");
	}
}
public class MultilevelInheritance {
		public static void main(String[] args) {
			BabyDog d=new BabyDog();
			d.animalEat();
			d.dogEat();
			d.BabydogEat();
			
		}

	}



