package com.constructor.example;
public class Area {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 test t1 = new test();
	     t1.length=5;
	     t1.breadth=7;
	     t1.display();
	     
	     test t2=new test(t1);
	     t1.breadth=7;
	     t1.display();
	     
	     test t3=new test(t2);
	     t3.length=12;
	     t3.display();
	     
	     test t4=new test(t3);
	     t4.breadth=8;
	     t4.display();		
	}
}
class test{
	int length;
	int breadth;
	test() {
	this.length=length;
	this.breadth=breadth;
	}
	test(test t){
		this.length=t.length;
		this.breadth=t.breadth;
	}
	void display() {
		System.out.println("length ="+length+"  breadth ="+breadth);
	}
}