package com.constructor.example;

class A1 {
	String name;
	int i;
	public A1(int i) {
		this.i = i;
		System.out.println(i);
		System.out.println("0--arg--constructor....." + this.i);
	}
	public void m1() {
		System.out.println("m1() of A1 class....");
	}
}
class B1 extends A1 {
	String name;
	int id;

	public B1(String name, int id) {
		super(78);
		this.name = name;
		this.id = id;
		System.out.println(name +" "+id);
		System.out.println("B class parametrized constructor...");
	}

	public void m2() {
		super.m1();
		System.out.println("m2() method of B1 class....");
	}

}

public class Test2 {
	public static void main(String[] args) {
		B1 b = new B1("xyzz", 123);
		b.m2();

	}
}
