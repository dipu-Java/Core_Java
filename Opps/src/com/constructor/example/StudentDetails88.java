package com.constructor.example;

import java.util.Scanner;

class StudentDetails8 {
	int id;
	int age;
	String name;
	String phno;
	static String collegeName;
	static String collegeAddress;

	public StudentDetails8(int id, int age, String name, String phno) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.phno = phno;
	}

	void display(StudentDetails8 student1) {
		// System.out.println(id,age,phno,name,collegeAddress,collegeName);
		System.out.println(student1.id);
		System.out.println(student1.age);
		System.out.println(student1.name);
		System.out.println(student1.phno);
		System.out.println(student1.collegeAddress);
		System.out.println(student1.collegeName);
	}
	public static StudentDetails8 getStudent() {
		Scanner s = new Scanner(System.in);
		System.out.println("id");
		int id = s.nextInt();
		System.out.println("age");
		int age = s.nextInt();
		System.out.println("name");
		String name = s.next();
		System.out.println("phno");
		String phno = s.next();

		StudentDetails8 j = new StudentDetails8(id, age, name, phno);
		return j;
	}
	static void changeCollegeName(String collegeName) {
		StudentDetails8.collegeName = collegeName;
	}

	static void changeCollegeAddress(String collegeAddress) {
		StudentDetails8.collegeAddress = collegeAddress;
	}
}

public class StudentDetails88 {
	public static void main(String[] args) {
		StudentDetails8.collegeAddress = "bam";
		StudentDetails8.collegeName = "Gate";
		StudentDetails8 q = StudentDetails8.getStudent();
		q.display(q);
		StudentDetails8 student1 = StudentDetails8.getStudent();
		student1.display(student1);
		StudentDetails8.changeCollegeAddress("sfdd");
		StudentDetails8.changeCollegeName("jakjFASFgd");
		q.display(q);
		student1.display(student1);
		q.display(q);
	}
}
