package com.Block.example;

 class C {
int i;
C(int i){
	this.i=i;
}
}
 class D 
{
void m1(C arg) {
	System.out.println(arg.i);
}
}
 public class E{
     
		public static void main(String[] args) {
			
	  C c=new C(10);
	 // C c1=new C(20);
	  D d=new D();
	  
	 // E e=new E();
	 
	  d.m1(c);
	  //d.m2(c1);
	 // d.m1();
		}

	}
