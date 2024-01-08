package com.company;

// class StudentDemo{
//	String name="Punam";
//	int ID=100;
//}
class StudentDemo{
	String name;
	int id;
}

public class Student2 {
	public static void main(String[] args) {
		StudentDemo s1=new StudentDemo();
		StudentDemo s2=new StudentDemo();
		    s1.id=101;
		    s1.name="Punam";
		    s2.id=102;
		    s2.name="Divya";
		  System.out.println(s1.name+" "+s1.id);
		  System.out.println(s2.name+" "+s2.id);
		}

}
