package com.constructor.example;

public class Person {

	String name;      //here java create a default constructor
	int rollno;
	void display() {
		System.out.println(name+ " "+rollno);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Person p=new Person();
   p.display();
	}
}
