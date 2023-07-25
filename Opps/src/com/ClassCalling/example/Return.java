package com.ClassCalling.example;

public class Return {
     
	 static void display() {
	    	
	    	System.out.println("no param");
	    }
	  static void display(int n) {
		 
		  System.out.println("Int parameter"); 
	  }
	  static void display(String s){
			  
			  System.out.println(s);
	  }
	  public static void main(String[] args) {
		  display();
		
	  }
}
