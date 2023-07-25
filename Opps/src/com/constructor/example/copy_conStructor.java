package com.constructor.example;

public class copy_conStructor {
	int id;
	String name;

	copy_conStructor(int i, String n) {
		id = i;
		name = n;
	}

	copy_conStructor(copy_conStructor d) {
		id = d.id;
		name = d.name;
//		System.out.println(d.id+"    "+d.name);
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		copy_conStructor t = new copy_conStructor(10, "vh");
		copy_conStructor t1 = new copy_conStructor(t);
		t.display();
		t1.display();

	}
}
