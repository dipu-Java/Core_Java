package com.String.example;

public class printDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s="madamhh";
     char[]c=s.toCharArray();
     String temp="";
     for(int i=0;i<c.length;i++) {
    	 for(int j=i+1;j<c.length;j++) {
    		 if(c[i]==c[j]) {
    			 temp+=c[j];
    		 }
    	 }
     }
     System.out.println(temp);
	}

}
