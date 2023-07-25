package com.linearSearch.array;

public class string_Search {

	public static void main(String[] args) {
     String[]a= {"java","core","mern","python"};
     String s="java";
     for(int i=0;i<a.length;i++) {
    	 if(a[i].equals(s)) {
    		 System.out.println("number is present in position : "+i);
    	 }
     }
	}

}
