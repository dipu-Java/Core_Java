package com.ClassCalling.example;

public class student1 {
	String name;
    int no;
    String address;
    String college;
     void display() {
    	System.out.println(name);
    	System.out.println(no);
    	System.out.println(address);
    	System.out.println(college);
    }
    public static void main(String[]args) {
    	student1 s=new student1();
    	s.name="lipun";
    	s.no=103;
    	s.address="gatebazar";
    	s.college="mumbai";
      s.display();
    }
}
   