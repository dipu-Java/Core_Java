package com.practise.SA;

class A {
	static {
		System.out.println("static block");
	}

	A() {
		System.out.println("core");
	}
}

class B {// ({[})
	//
	int i;

	B() {
		System.out.println("java");
	}
}

public class Demo10 {
	static B b = new B();

	public static void main(String[] args) {
		A a = new A();
	}

	void m1() {
		b.i = 100;
		System.out.println(b.i);
	}
}
