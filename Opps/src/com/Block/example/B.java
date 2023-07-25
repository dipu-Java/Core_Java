package com.Block.example;

public class B {
	static int i;
	int j;
	B(int i,int n){
		this.i=i;
		j=n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	B b=new B(10,20);
		System.out.println(b.i+" "+b.j);
		B b1=new B(30,40);
		System.out.println(b1.i+" "+b1.j);
		System.out.println(b1.i+" "+b1.j);
	}

}
