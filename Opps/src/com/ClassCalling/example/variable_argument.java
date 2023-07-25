package com.ClassCalling.example;

public class variable_argument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
     m1(1,3,5,6,7);
	}
   static void m1(int...arg) {
	   int sum=0;
	   for(int n:arg) {
		  sum+=n; 
	   }
	   System.out.println(sum);
   }
}
