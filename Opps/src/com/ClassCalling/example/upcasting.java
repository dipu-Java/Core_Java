package com.ClassCalling.example;
class e{
	public  static void m1() {
    	 System.out.println("m1 of a class");
     }
}
class d extends e{
   public static void m1() {
   	 System.out.println("m1 of b class");
    }
}
class c extends d{
	public static void m1() {
   	 System.out.println("m1 of c class");
    }
}
public class upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    e a1=  new d();
    a1.m1();
    e a2=  new c();
    a2.m1();
    
	}

}
