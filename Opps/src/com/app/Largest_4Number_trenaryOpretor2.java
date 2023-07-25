package com.app;

public class Largest_4Number_trenaryOpretor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a=12,b=13,c=45,d=67;
   int n=a>b?(a>c?(a>d?a:d):(c>d?c:d)):(b>c?(b>d?b:d):(c>d?c:d));
   System.out.println(n);
	}

}
