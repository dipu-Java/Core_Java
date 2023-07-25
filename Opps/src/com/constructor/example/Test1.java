package com.constructor.example;

public class Test1 {
      String name;
      int no;
	Test1(){
		this.name="siba";
		 System.out.println(name);
	}
	Test1(String name){
	
		this();
		}
		public static void main(String[] args) {
		
		 Test1 t=new Test1();
		 Test1 t1=new Test1("dtjhk");
		 
		 System.out.println(t1.name);
			}
		}
		
		
