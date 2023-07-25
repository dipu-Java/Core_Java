package com.globallogicOnterviewQuestion;

class Foo {
	Foo(String text) {
		System.out.println(text);
	}
}

public class Check {
	public static void main(String[] args) {
		new Check();
	}

	Foo c = new Foo("hi");
	static Foo f = new Foo("hii");
}
