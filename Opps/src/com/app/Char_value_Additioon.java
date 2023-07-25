package com.app;
import java.util.Scanner;
public class Char_value_Additioon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner s=new Scanner(System.in);
   System.out.println("enter number");
   String n=s.next(); 
//   sumOfDigit(n);
//	}
//  public static void sumOfDigit(String n) {
   
   
	  int sum=0;
	  for(int i=0;i<n.length();i++) {
		  sum=sum+n.charAt(i)-48;
	  }
	  System.out.println(sum);
	  
  }
}
