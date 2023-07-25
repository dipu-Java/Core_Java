package com.dss;

public class removeDuplicates {

	public static void main(String[] args) {
         String s="mihir";
         String temp="";
         while(s.length()>0) {
        	 char c=s.charAt(0);
        	 s=s.replace(c+"", "");
        	 if(s.indexOf(c)==-1) {
        		 temp+=c;
        	 }
         }
         System.out.println(temp);
	}

}
