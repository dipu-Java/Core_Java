package com.constructor.example;

public class Person1 {
	String name;      //here java create a default constructor
	int rollno;
	Person1(){
		name="dipu";
	   rollno=102;
			System.out.println(name+ " "+rollno);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Person1 p=new Person1();


	}
}
