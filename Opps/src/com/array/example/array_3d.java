package com.array.example;
interface a{
	void m1();
	void m2();
}
abstract class b implements a{
	public void m1() {
		System.out.println("sdjlbds");
	}
	
}
class c extends b{

	@Override
	public void m2() {
		
	}
	public void m3() {
		System.out.println("dfajh");
	}
	
}
public class array_3d {

	public static void main(String[] args) {
		b b1=new c();
		
		b1.m1();
		c c1=(c)b1;
		c1.m3();
		
	}

}