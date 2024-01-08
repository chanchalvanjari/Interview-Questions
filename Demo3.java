package com.company;
class TestDemo{
	String name;
	int id;
	float salary;
	void insertRecord(String nm, int ID, float sal) {
		name=nm;
		id=ID;
		salary=sal;
	}
	void dispRecord() {
		 System.out.println("Name: "+name);
		  System.out.println("Id: "+id);
		  System.out.println("Salary: "+salary);
	}
}
public class Demo3 {
	public static void main(String[] args) {
		TestDemo s1=new TestDemo();
		TestDemo s2=new TestDemo();
		s1.insertRecord("Punam", 100, 30000);
		s2.insertRecord("Divya", 101, 40000);
		s1.dispRecord();
		s2.dispRecord();
		 
		}

}
