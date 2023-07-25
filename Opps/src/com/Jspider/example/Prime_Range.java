package com.Jspider.example;
import java .util.Scanner;
public class Prime_Range {
	
	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter first number");
     int a=s.nextInt();
     System.out.println("enter last number");
     int b=s.nextInt();
     boolean flag=true;
     for(int i=a;i<=b;i++) {
    	   flag=true;
    	 for(int j=2;j<=i/2;j++) {
    		 if(i%j==0) {
    			 flag=false;
    			 break;
    		 }
    	 }
    	 if(flag) {
    		 System.out.println(i);
    		// break;
    	 }
     }
	}

}

