package com.abs.example;

abstract class A5 {
	A5() {
		System.out.println("fgsjfh");
	}

	abstract void m1();

	public void m2() {
		System.out.println("m2() of Abstract class...");
	}
}

class B extends A5 {
	public void m1() {
		System.out.println("m1 of abstract() implemented...");
	}
}

public class Demo {
	public static void main(String[] args) {

		A5 b = new B();
		b.m1();
		b.m2();
	}
}
