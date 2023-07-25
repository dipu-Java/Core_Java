package com.Array.example;

public class Non_repeated_element {

	public static void main(String[] args) {
     int[]a= {1,2,3,2,3,1,7,8,8,9,23};
     int res=a[0];
     for(int i=1;i<a.length;i++) {
    	 res=res^a[i];
     }
     System.out.println(res);
	}
}
