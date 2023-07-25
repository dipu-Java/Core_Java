package com.dss;

public class reverseString {

	public static void main(String[] args) {
     String s="mihir";
     String temp="";
     for(int i=s.length()-1;i>=0;i--) {
    	 temp+=s.charAt(i);   	 
     }
     System.out.println(temp);
	}

}
