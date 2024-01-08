package com.company;


interface Banks{
	float rateOfInterest();
}

class SBIBank1 implements Banks{
	public float rateOfInterest(){
		return 9.4f;
	}
}
class AxisBank1 implements Banks{
	public float rateOfInterest(){
		return 7.2f;
	}
}
class IciciBank1 implements Banks{
	public float rateOfInterest(){
		return 6.4f;
	}
}
public class InterfaceDemo1 {
	public static void main(String[] args) {
		Banks sb=new SBIBank1();
		AxisBank1 ab=new AxisBank1();
		IciciBank1 IB=new IciciBank1();
		System.out.println("Interest of SBI Bank : "+sb.rateOfInterest());
		System.out.println("Interest of Axis Bank : "+ab.rateOfInterest());
		System.out.println("Interest of ICICI Bank : "+IB.rateOfInterest());
	}
}
