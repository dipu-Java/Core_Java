package com.constructor.example;

public class ddd {
	ddd(){
		this(20);
		System.out.println("one");
	}
	ddd(int i){
		this(null);
		System.out.println("two");
	}
	ddd(ddd o){

		System.out.println("three");
	}
	
public static void main(String[] args) {
	
	ddd d=new ddd();
}
}
