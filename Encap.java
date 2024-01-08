package com.company;
//Program to demonstrate Encapsulation 

class Employee{
	private int id;
	private int sal;
	
	void setId(int id) {
		this.id=id;
	}
	int getId() {
		return id;
	}
	void setSal(int sal) {
		this.sal=sal;
	}
	int getSal() {
		return sal;
	}
}
public class Encap {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setId(100);
		e.setSal(30000);
		System.out.println("Emp Id is  "+e.getId());
		System.out.println("Emp Salary is  "+e.getSal());
	}

}
