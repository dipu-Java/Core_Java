package com.Student.example;

public class Student {
	private int sid;
	private String name;
	private University university;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public University getUniversity() {
		return university;
	}
	public void setUniversity(University university) {
		this.university = university;
	}
	public Student(int sid, String name, University university) {
		super();
		this.sid = sid;
		this.name = name;
		this.university = university;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", university=" + university + "]";
	}
	
	
}