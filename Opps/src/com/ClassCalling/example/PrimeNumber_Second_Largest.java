package com.ClassCalling.example;
import java.util.Scanner;
public class PrimeNumber_Second_Largest {
	static int temp;
	public static void main(String[] args) {
		
		 
		   int secondHighest=0;
		   int a=0;
		   for(int n=1;n<=100;n++) {
			   if(isPrime(n)==1) {
				   a= n;			   
		   }
		   }	
		    int check2ndHighest = check2ndHighest(a);
		    System.out.println(check2ndHighest);		  
	}
  static int check2ndHighest(int a) {
		for(int n=1;n<a;n++) {
			if(isPrime(n)==1) {
				temp=n;
			}			
		}
		return temp;		
	}
static int isPrime(int n) {
	 int flag=0;
	 int count=0;
	 for(int i=1;i<=n;i++) {
		 if(n%i==0) {
			 count++;
		 }
	 }
	 if(count==2) {
		 flag=1;
	 }
	 return flag;
 }
}
