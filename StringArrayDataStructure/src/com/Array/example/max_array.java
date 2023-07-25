package com.Array.example;

public class max_array {

	public static void main(String[] args) {
          int[]a= {2,14,7,9,6,5};
          int temp=0;
          for(int i=0;i<a.length;i++) {
        	  if(a[i]>temp) {
        		  temp=a[i];
        	  }
        	  
          }
          System.out.println(temp);
	}

}
