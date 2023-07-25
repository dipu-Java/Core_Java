package com.Student.example;

public class A {
	String name;
 
	A(String name) {
		this.name = name;
		return;
	}

	void display(B arg) {
		System.out.println(arg.name);
		System.out.println(arg.id);
		System.out.println(arg.course);

	}

	public static void main(String[] args) {
		A a = new A("naresh");
		System.out.println(a.name);
	}
}
