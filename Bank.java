package com.company;
class Bank1 {
	int getRateOfInterest(){
		return 0;
	}

}
class SBIBank extends Bank1{
	int getRateOfInterest(){
		return 9;
	}
}
class AxisBank extends Bank1{
	int getRateOfInterest(){
		return 7;
	}
}
class IciciBank extends Bank1{
	int getRateOfInterest(){
		return 8;
	}
}
public class Bank {
	
	public static void main(String[] args) {
		SBIBank sb=new SBIBank();
		AxisBank ab=new AxisBank();
		IciciBank IB=new IciciBank();
		System.out.println("Interest of SBI Bank : "+sb.getRateOfInterest());
		System.out.println("Interest of Axis Bank : "+ab.getRateOfInterest());
		System.out.println("Interest of ICICI Bank : "+IB.getRateOfInterest());
	}
}
