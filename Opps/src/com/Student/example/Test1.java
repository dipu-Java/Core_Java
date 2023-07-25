package com.Student.example;

class Subject implements Cloneable {
	String name;
	String duration;

	public Subject(String name, String duration) {
		super();
		this.name = name;
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Subject [name=" + name + ", duration=" + duration + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Subject s1 = new Subject("english", "4 months");
		Subject sb = (Subject) s1.clone();

	}
}
