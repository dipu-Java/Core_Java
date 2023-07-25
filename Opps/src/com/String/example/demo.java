package com.String.example;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s="siba";
      char temp;
      char[]c=s.toCharArray();
      for(int i=0;i<s.length();i++) {
    	  for(int j=i+1;j<c.length;j++) {
    		  if(c[i]>c[j]) {
    			  temp=c[j];
    			  c[j]=c[i];
    			  c[i]=temp;
    		  }
    	  }
      }
      System.out.println(c);
	}

}
