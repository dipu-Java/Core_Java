package com.ClassCalling.example;
public class utility {
    static int factor(int n) {
    	int fac=1;
    	for(int i=1;i<=n;i++) {
    		fac=fac*i;
    	}
    	return fac;
    }
    static int length(int n) {
    	int length=0;
    	for(;n>0;n/=10) length++;
    	return length;
    }
    static int reverse(int n) {
    	int rev=0;
    	for(;n>0;n/=10) rev=rev*10+n%10;
    	return rev;
    }
    static int power(int base,int exp) {
    	int res=1;
    	for(int i=1;i<=exp;i++) res=res*base;
    	return res;
    }
    static int armstrong(int n) {
    	int sum=0;
    	int l=length(n);
    	for(;n>0;n/=10) sum=sum+power(n%10,l);
    	return sum;
    }
    static int strong(int n) {
    	int sum=0;
    	for(;n>0;n/=10) sum=sum+factor(n);
    	return sum;
    }
    static boolean prime(int n) {
    	for(int i=2;i<=n/2;i++) {
    		if(n%2==0) return false;
    	}
    	return true;
    }
    public static int rangeArmstrong(int n) { 
   	 int sum=0;
   	 int l=length(n);
   	 while(n>0) {
   		 int rem=n%10;
   		 int d=power(rem,l);
   	 sum=sum+d;
   		 n/=10;	 
   	 }
   	 return sum;
    }
    public static int rangeStrong(int n) {
   	 int sum=0;
   	 while(n>0) {
   		 int rem=n%10;
   		sum=sum+factor(rem);
   		 n/=10; 
   	 }
   	 return sum;
    }
    public static int automorphic(int n) {
    	int a=power(n,2);
    	int l=length(n);
    	int e=1;
    	int z=0;
    	for(int i=1;i<=l;i++) {
    		e=e*10;
    		z=a%e;
    	}
    	return z;
    }
   }

//called in code



















