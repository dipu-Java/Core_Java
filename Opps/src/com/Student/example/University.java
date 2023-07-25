package com.Student.example;

public class University{
	
    String name;
    int id;
   String address;
   String course;
public University(String name, int id, String address, String course) {
	super();
	this.name = name;
	this.id = id;
	this.address = address;
	this.course = course;
}
@Override
public String toString() {
	return "University [name=" + name + ", id=" + id + ", address=" + address + ", course=" + course + "]";
}

	
	
	}
 //called in school