package com.ClassCalling.example;

public class Method {

  	int i;
	void display() {
		System.out.println(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Method a=new Method();
      a.i=10;
      System.out.println(a.i);
      a=new Method();
      System.out.println(a.i);
        Method a1;
         a1=a;
         a1.i=4;
      a1.display();
     // a2=a;
      
	}
}
