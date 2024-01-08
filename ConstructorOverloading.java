package com.company;
//Constructor Overloading in Java is a technique of having more than one constructor with different parameter lists. 
//They are arranged in a way that each constructor performs s different task.
//They differentiated by the compiler by the no.of Parameters in the list and their types.



//program on Constructor Overloading

class Student3{
	int id;
	String name;
	int age;
	Student3(int id,String name){
		this.id=id;
		this.name=name;
	}
	Student3(int i,String nm,int a){
		id=i;
		name=nm;
		age=a;
	}
	
	void disp() {
		System.out.println("Student Id is  "+id);
		System.out.println("Student name is  "+name);
		System.out.println("Student age is  "+age);
	}
}
public class ConstructorOverloading {
	public static void main(String[] args) {
		Student3 s=new Student3(100,"Mona");
		Student3 s1=new Student3(101,"Punam",21);
		s.disp();
		s1.disp();
	}
}
