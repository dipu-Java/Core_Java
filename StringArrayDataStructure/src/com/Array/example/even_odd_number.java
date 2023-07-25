package com.Array.example;

public class even_odd_number {

	public static void main(String[] args) {
      int[]a= {1,2,3,4,5,6,7,8,9};
      int rem=0;
      for(int i=0;i<a.length;i++) {
    	  rem=a[i];
    	  if(rem%2==0) {
    		  System.out.print(rem);
    	  }
    	  if(rem%2!=0) {
    		  System.out.println("..........");
    		  System.out.println(rem);
    	  }
      }
	}

}
