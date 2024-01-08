package com.company;
//class IntroDemo{
//	void intro(String name, int id) {
//		System.out.println("Name "+name+" Id "+id);
//	}
//}
// class PersonalDemo extends IntroDemo{
//	 void intro(String name, int id) {
//		 System.out.println("Personal Demo");
//			System.out.println("Name "+name+" Id "+id);
//		}
// }
public class Practice {
	void multi(int a, int b, int c) {
		int d=a*b*c;
		System.out.println(d);
	}
	void multi(int a, int b) {
		int c=a*b;
		System.out.println(c);
	}
	
	
	public static void main(String[] args) {
//		PersonalDemo pd=new PersonalDemo();
//		pd.intro("Punam", 100);
		
		
		Practice p=new Practice();
		p.multi(50, 2);
	}
}
