package com.Array.example;
import java.util.*;
public class nTh_largest_number {

	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//		System.out.println("enter your required number");
//		int n=s.nextInt();
		int n=3;
		int temp=0;
             int[]a= {2,5,7,9,54,87,23,45,78,90};
             for(int i=0;i<a.length-1;i++) {
            	 for(int j=i+1;j<a.length;j++) {
            		 if(a[i]<a[j]) {
            			  temp=a[j];
            			 a[j]=a[i];
            			 a[i]=temp;
            		 }
            	 }
            	 if(i==n-1) {
            		 
            		 System.out.println(a[i]);
            		 break;
            	 }
             }
             System.out.println("..................");
             for(int i=0;i<a.length;i++) {
            	 System.out.print(a[i]+" ");
             }
	}

}
