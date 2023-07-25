package com.Student.example;

//import java.security.PublicKey;

class Bus {
	String name;
	String no;

	public Bus(String name, String no) {
		//super();
		this.name = name;
		this.no = no;
	}

	public Bus(Bus b) {
		this.name = b.name;
		this.no = b.no;
	}
}

public class Demo1 {
	public static void main(String[] args) {
		Bus b1 = new Bus("raisahab", "or0213");
		Bus b2 = new Bus(b1);
	}
}
