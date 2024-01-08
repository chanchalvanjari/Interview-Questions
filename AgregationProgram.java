package com.company;
//Program on Aggregation 
class Address{
	String city,state, country;
	Address(String city,String state,String country){
		this.city=city;
		this.state=state;
		this.country=country;
	}
	
}

class Emp{
	int id;
	String name;
	Address address;
	
	Emp(int id,String name, Address address){
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	void display() {
		 System.out.println( id+" "+name);
		 System.out.println( address.city+" "+address.state+" "+address.country);
	}
}
public class AgregationProgram {
	public static void main(String[] args) {
		Address add=new Address("Pune","Maharashtra","India");
		Address add1=new Address("Pachora","Maharashtra","India");
		
		
		Emp e=new Emp(100,"Punam",add);
		Emp e2=new Emp(102,"Mona",add1);
		
		e.display();
		e2.display();
	}

}
