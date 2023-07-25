package com.ClassCalling.example;

public class Test {
     static int i;
     int j;
     void increment() {
    	 i++;
    	 j++;
     }
     void display() {
    	 System.out.println(i + " " + j);
     }
     public static void main(String[]args) {
    	 Test t1=new Test();
    	 Test t2=new Test();
    	 Test t3=new Test();
    	 
    	 t2.increment();
    	 t2.increment();
    	 t3.increment();
    	 
    	 t1.display();
    	 t2.display();
    	 t3.display();
     }
}
