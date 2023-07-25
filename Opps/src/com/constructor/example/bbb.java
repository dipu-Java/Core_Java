package com.constructor.example;

public class bbb {

	public static void main(String[] args) {
		b b=new b(null);
	}	
    }

class b{
	b(){
		this(20);
		System.out.println("one");
	}
	b(int i){
//		this(null);
		System.out.println("two");
	}
	b(b s){
   
		System.out.println("three");
	}
}