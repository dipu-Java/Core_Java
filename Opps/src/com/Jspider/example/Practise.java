package com.Jspider.example;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a=0,b=1,c=0;
		int n=1000;
		int sum=0;
		int e=1;
		//System.out.println(a+" \n"+b);
	   while(n>0) {
//			c=a+b;
//			System.out.println(c);
//			a=b;
//			b=c;
		   int rem=n%10;
		   sum=sum+e*rem;
		   e=e*2;
		   n/=10;
		}
		System.out.println(sum);
//      if(res==temp)System.out.println("str");
//      else System.out.println("not");
	}

}
