package com.clone.example;

class Subject implements Cloneable {
	String paper;
	String duration;

	public Subject(String paper, String duration) {
		super();
		this.paper = paper;
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Subject [paper=" + paper + ", duration=" + duration + "]";
	}
	

}

class Student1 implements Cloneable {
	String name;
	int id;
	Subject subject;

	@Override
	public String toString() {
		return "Student1 [name=" + name + ", id=" + id + ", subject=" + subject + "]";
	}

	public Student1(String name, int id, Subject subject) {
		super();
		this.name = name;
		this.id = id;
		this.subject = subject;
	}
}

public class Demo2 {
	public static void main(String[] args) {
		Subject s1 = new Subject("math", "3 months");
		           
		Student1 st1 = new Student1("dipu", 435, s1);
	}
}
