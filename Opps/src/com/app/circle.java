package com.app;

class test5 {
	static final double pi;
	static {
		pi = 3.14;
	}
	int r;

	void area() {
		int a = (r * r);
		System.out.println(pi * a);
	}

	void circum() {
		int a = (r * 2);
		System.out.println(pi * a);
	}
}

public class circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test5 t = new test5();
		t.r = 4;
		t.area();
		t.circum();
	}

}
