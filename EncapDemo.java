package com.company;

public class EncapDemo {
private int ssn;
private String empName;
private int empAge;

void setSSN(int val) {
	ssn=val;
}
void setEmpName(String nm) {
	empName=nm;
}
void setEmpAge(int ag) {
	empAge=ag;
}
int getSSN() {
	return ssn;
}
String getEmpName() {
	return empName;
}
int getEmpAge() {
	return empAge;
}

	
	public static void main(String[] args) {
		EncapDemo ed=new EncapDemo();
		ed.setSSN(100);
		ed.setEmpName("Mona");
		ed.setEmpAge(21);
		
		System.out.println("Emp SSN : "+ed.getSSN());
		System.out.println("Emp Name : "+ed.getEmpName());
		System.out.println("Emp Age : "+ed.getEmpAge());
	}
}
