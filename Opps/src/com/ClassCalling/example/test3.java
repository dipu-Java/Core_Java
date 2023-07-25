package com.ClassCalling.example;
class a{
	private int i;
	public void accessi() {
		i=10;
		System.out.println(i);
	}
}
class b extends a{
	public void m1() {
		accessi();
		System.out.println("sdjbh");
	}
}
public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    b b1=new b();
    b1.m1();
	}

}
