package com.Polymerphism.Override;

class parent {
	parent(){
		System.out.println("parent class constructor...");
	}
	void m1() {
		System.out.println("parent class method");
	}
}

public class Child extends parent {
	
	@Override
	void m1() {
		 super.m1();;
		System.out.println("child 1 class method");
	}

	void m2() {
		System.out.println("child 2 class method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent p = new Child();
		p.m1();
	
		Child c = (Child) p;
		c.m2();
	}

}
//in this case when p.m1(); is called that time child-1 method will be executed
//m2 will not execute; then to execute the m2 we call type casting 
//then convert the parent reference to child; after that m2 will be executed. 