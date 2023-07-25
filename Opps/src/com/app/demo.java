package com.app;

public class demo {
	public void print(Integer i) {
		System.out.println("Integer");
	}

	public void print(int i) {
		System.out.println("int");
	}

	public void print(long l) {
		System.out.println("long");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo d = new demo();
		d.print(10);
	}

	

}
