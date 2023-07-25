package com.Polymerphism.Override;
class d{
	static void m1() {
		System.out.println("static");}
	void m2() {System.out.println("non-static");
	}
}
class e extends d{
	static void m1() {		
		System.out.println("static-1");}
	void m3() {
		
		System.out.println("non-static-1");
	}
}
public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     d e1=new e();
     e1.m1();
     e e2=(e)e1;
     e2.m3();
     
	}
}
