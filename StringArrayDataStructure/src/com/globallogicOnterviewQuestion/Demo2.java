package com.globallogicOnterviewQuestion;

public class Demo2 {
	int i;
	int j;
	int k;
    Demo2(){
    j=2;	
    }
    Demo2(int m,int n){
    	super();
    	i=m;
    	k=n;
    }
    Demo2(int x){
    	super();
    	j=x;
    	
    }
	public static void main(String[] args) {
    Demo2 e=new Demo2(4);
    System.out.println(e.i+e.j+e.k);
	}

}
