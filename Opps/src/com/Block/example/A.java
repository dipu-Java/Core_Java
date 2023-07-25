package com.Block.example;

public class A {
	  A(){
	    	System.out.println("hello world"); //constructor
	    }
    static {
    	System.out.println("static world");
    }
    {
    	System.out.println("non static world"); //
    	System.out.println("non static world"); //non-static block
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

       new A();
       new A();
       new A();
	}

}
