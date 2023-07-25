package com.clone.example;

class Address implements Cloneable {
	int hno;
	String address;
	String state;

	Address(int hno, String address, String state) {
		this.hno = hno;
		this.address = address;
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [hno=" + hno + ", address=" + address + ", state=" + state + "]";
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

class Student implements Cloneable {
	int id;
	String name;
	Address address;

	public Student(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	public Student clone() throws CloneNotSupportedException {
		Student s2 = (Student) super.clone();
		s2.address = (Address) address.clone();
		return s2;
	}
}
public class Demo1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address address = new Address(10, "btm", "uganda");
		Student s = new Student(1, "siba", address);
		Student s1 = s.clone();
		System.out.println(s1);
		Student s3 = new Student(2, "dipu", address);
		System.out.println(s3);
		
		s.address.state = "india";
		
		Student s4 = new Student(3, "rashmi", address);
		System.out.println(s4);
		Student s5 = new Student(1, "rashmi", address);
		System.out.println(s5);
	}

}
