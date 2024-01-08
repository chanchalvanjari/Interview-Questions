package com.company;
//Passing Arrays to methods.
public class TestArray1 {
	
	public static void printArray(int[] arr) {
		for(int element:arr) {
			System.out.print(element+" ");
		}
	}
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7};
		printArray(a);
	}
}
