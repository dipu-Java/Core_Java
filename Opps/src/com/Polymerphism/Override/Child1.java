package com.Polymerphism.Override;
class parent1{
	 void m1() {
		System.out.println("parent 1 method");
	}
}
public class Child1 extends parent1 {
	@Override	
	 void m1() {
		 super.m1();
		System.out.println("child 1 method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Child1 p=new Child1();
       p.m1();           //parent 1 method
	}

}
//in this program when we compile the program that time first 
//class file will be executed ,as it is a static method thats why
//parent method will be executed.