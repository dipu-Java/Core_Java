package com.constructor.example;

public class Ex {
	 int i=20;
   Ex(){
	   System.out.println(i);
   }
   Ex(String i){
	   this();
	   System.out.println(i);
   }
 
		public static void main(String[] args) {
			Ex e=new Ex();
			Ex e1=new Ex("gtjthf");
		}
	}

