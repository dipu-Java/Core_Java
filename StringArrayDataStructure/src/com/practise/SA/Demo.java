package com.practise.SA;

class Strig {
	String name;

	public Strig(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Strig [name=" + name + "]";
	}
}

public class Demo {
	public static void main(String[] args) {
		String s = "ram";
//		System.out.println(s);
		String s1 = new String("ram");
		String s2 = new String("ram");
//		System.out.println(s1);
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
	}
}
