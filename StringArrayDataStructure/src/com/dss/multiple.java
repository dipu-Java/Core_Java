package com.dss;

public class multiple {

	public static void main(String[] args) {
     String s="7*8";
     int sum=1;
     char[]c=s.toCharArray();
     for(int i=0;i<s.length();i++) {
    	 if(c[i]>='0'&&c[i]<='9') {
    		 sum=('1'-'0')*(c[i]-'0')*sum;
    	 }
     }
     System.out.println(sum);
	}

}
