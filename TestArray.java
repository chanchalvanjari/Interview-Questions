package com.company;

public class TestArray {
	public static void main(String[] args) {
		int [] a= {1,3,5,6,7,9,4};
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		
		for(int element:a) {
			System.out.print(element+" ");
		}
		System.out.println();
		int total=0;
		for (int i=0;i<a.length;i++) {
			total +=a[i];
			
		}
		System.out.println(total);
		//finding largest Element
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
		}

}
