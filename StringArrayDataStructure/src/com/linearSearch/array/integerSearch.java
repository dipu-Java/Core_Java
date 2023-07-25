package com.linearSearch.array;

public class integerSearch {

	public static void main(String[] args) {
          int[]a= {1,4,7,8,4,6,3};
          int temp=4;
          for(int i=0;i<a.length;i++) {
        	  if(a[i]==temp) {
        		  System.out.println("number is present in position : "+i);
        	  }
          }
	}

}
  