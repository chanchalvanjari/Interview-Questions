package com.company;

//java program to initialize the values from one object to another object

public class Student6 {
	int id;
	String name ;
	//constructor to initialize integer and string 
	Student6(int i,String n){
		id=i;
		name=n;
		
	}
	//constructor to initialize another object
	Student6(Student6 s){
		id=s.id;
		name=s.name;
	}
	void disp() {
		System.out.println("Student Id is  "+id);
		System.out.println("Student name is  "+name);
		
	}

	public static void main(String[] args) {
		Student6 s1=new Student6(111,"Punam");
		Student6 s2=new Student6(s1);
		s1.disp();
		s2.disp();
	}
}
