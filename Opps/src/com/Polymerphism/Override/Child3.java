package com.Polymerphism.Override;
class parent2{
	void m1() {
		System.out.println("parent 1 method");
	}
}
public class Child3 extends parent2 {
@Override
   void m1() {
	   super.m1();
	   System.out.println("child 1 method");
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    parent2 p=new Child3();
    p.m1();                //o/p=child 1 method
	}

}
//in this program compiler is always 1st check the parent class
//if the method is present in the child class then 
//in run time when object is executed for that object that method will be exicuted