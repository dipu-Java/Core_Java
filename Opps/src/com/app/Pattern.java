package com.app;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n=7;
    int a=n/2;
    int s=1;
    
    for(int i=1;i<=n;i++){
    	for(int j=1;j<=a;j++) {
    		System.out.print(" ");
    	}
    	for(int j=1;j<=s;j++) {
    		System.out.print(s);
    	}
    	if(i<=n/2) {
    		s+=2;
    		a--;
    	}
    	else {
    		s-=2;;
    		a++;
    	}
    	System.out.println();
    }
	}

}
