package com.ClassCalling.example;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		m1(1);
	}
	public static void m1(int i) {
		System.out.println(i);
		if(i==3) 
			return;
		m1(i+1);
		
		System.out.println(i);
	}

}
