package com.equals.exa;

class A {
	int i;
	String s;

	public A(int i, String s) {
		super();
		this.i = i;
		this.s = s;
	}

	@Override
	public String toString() {
		return "A [i=" + i + ", s=" + s + "]";
	}
  public boolean equals(Object o) {
	  A a=(A)o;
	  return this.i==a.i&&this.s.equals(a.s);
  }
}

public class Test {

	public static void main(String[] args) {
		A a = new A(1, "java");
		A a1 = new A(1, "java");
		System.out.println(a==a1);
		System.out.println(a.equals(a1));
	}

}
