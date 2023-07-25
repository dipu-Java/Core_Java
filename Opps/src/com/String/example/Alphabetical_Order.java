package com.String.example;

public class Alphabetical_Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s="acbd";
 char[]c=s.toCharArray();
 char temp=' ';
 for(int i=0;i<c.length;i++) {
	 for(int j=i+1;j<c.length;j++) {
		 if(c[i]>c[j]) {
			 temp=c[i];
			 c[i]=c[j];
			 c[j]=temp;
		 }
	 }
 }
 System.out.println(c);
	}

}
