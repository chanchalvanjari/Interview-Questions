package com.company;

public class ParamererizedConstructor {
	String name;
	int Roll;
	float fees;
	//Parameterize Constructor
	ParamererizedConstructor(String name, int Roll,float fees)
	{
		this.name=name;
		this.Roll=Roll;
		this.fees=fees;
		 System.out.println(name);
		 System.out.println(Roll);
		 System.out.println(fees);
	}
	public static void main(String[] args) {
		ParamererizedConstructor d= new ParamererizedConstructor("Punam",100,10000);
	}
}
